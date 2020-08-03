package com.mint.demo.login.service;

import com.mint.demo.login.dto.LoginDTO;

public interface ILoginService {

    public boolean addMember(LoginDTO loginDTO);

    public boolean idCheck(LoginDTO loginDTO);

}
