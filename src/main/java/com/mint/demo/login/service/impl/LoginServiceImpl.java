package com.mint.demo.login.service.impl;

import com.mint.demo.login.dao.LoginDAO;
import com.mint.demo.login.dto.LoginDTO;
import com.mint.demo.login.service.ILoginService;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements ILoginService {

    private LoginDAO loginDAO;

    public LoginServiceImpl(LoginDAO loginDAO) {
        this.loginDAO = loginDAO;
    }

    @Override
    public boolean addMember(LoginDTO loginDTO) {
        return loginDAO.addMember(loginDTO);
    }

    @Override
    public boolean idCheck(LoginDTO loginDTO) {
        return loginDAO.idCheck(loginDTO);
    }
}
