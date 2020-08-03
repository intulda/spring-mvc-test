package com.mint.demo.login.dao;

import com.mint.demo.login.dto.LoginDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDAO {

    private SqlSessionTemplate sqlSessionTemplate;

    public LoginDAO(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    public boolean addMember(LoginDTO loginDTO) {
        int count = sqlSessionTemplate.insert("loginDAO.addMember", loginDTO);
        return count > 0 ? true : false;
    }

    public boolean idCheck(LoginDTO loginDTO) {
        LoginDTO loginDTO1 = sqlSessionTemplate.selectOne("loginDAO.idCheck", loginDTO);
        return loginDTO1 != null ? false : true;
    }
}
