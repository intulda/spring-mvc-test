package com.mint.demo.login;

import com.mint.demo.login.dto.LoginDTO;
import com.mint.demo.login.service.ILoginService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/login/*")
public class LoginController {

    private ILoginService iLoginService;

    public LoginController(ILoginService iLoginService) {
        this.iLoginService = iLoginService;
    }

    @PostMapping(value="resister")
    @ResponseBody
    public boolean addMember(@RequestBody LoginDTO loginDTO) {
        return iLoginService.addMember(loginDTO);
    }

    @PostMapping(value="check")
    @ResponseBody
    public LoginDTO idCheck(@RequestBody LoginDTO loginDTO) {
//        loginDTO.setCheck(iLoginService.idCheck(loginDTO));
        return loginDTO;
    }
}
