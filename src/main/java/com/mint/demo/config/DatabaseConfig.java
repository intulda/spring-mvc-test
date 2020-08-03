package com.mint.demo.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfig {

    @Value("${mint.config.db.mybatis-config-path}")
    private String mybatisConfigPath;

    @Value("${mint.config.db.mybatis-mapper-path}")
    private String mybatisMapperPath;

    /**
     * SQL 생명주기관리
     * @param datasource
     * @return
     * @throws Exception
     */
    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource datasource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(datasource);
        sqlSessionFactory.setConfigLocation(new PathMatchingResourcePatternResolver().getResource(mybatisConfigPath));
        sqlSessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(mybatisMapperPath));
        return sqlSessionFactory.getObject();
    }

    /**
     * Sql SessionTemplate
     * @param sqlSessionFactory
     * @return
     */
    @Bean
    public SqlSessionTemplate sqlSession(SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
