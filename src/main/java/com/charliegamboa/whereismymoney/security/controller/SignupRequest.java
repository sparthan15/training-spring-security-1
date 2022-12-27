package com.charliegamboa.whereismymoney.security.controller;

import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SignupRequest {

    private String username;
    private String email;
    private String password;
    private Set<String> roles;

}
