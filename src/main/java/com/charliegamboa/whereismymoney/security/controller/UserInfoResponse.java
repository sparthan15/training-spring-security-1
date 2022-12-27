package com.charliegamboa.whereismymoney.security.controller;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class UserInfoResponse {

    private long id;
    private String username;
    private String email;
    private List<String> roles;
}
