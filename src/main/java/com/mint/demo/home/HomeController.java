package com.mint.demo.home;

import com.mint.demo.login.dto.LoginDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value = "/")
    public String index() {
        LoginDTO loginDTO = LoginDTO.builder()
                .email("email")
                .password("1234")
                .check(false)
                .auth(3)
                .build();

        System.out.println(loginDTO.toString());

        return "index";
    }
}
