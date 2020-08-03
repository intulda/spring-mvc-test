package com.mint.demo.login.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Builder @NoArgsConstructor @AllArgsConstructor
public class LoginDTO implements Serializable {
    private String email;
    private String password;
    private String name;
    private boolean check;
    private int auth; //사용자3 관리자1

    @Override
    public String toString() {
        return "LoginDTO{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", check=" + check +
                ", auth=" + auth +
                '}';
    }
}
