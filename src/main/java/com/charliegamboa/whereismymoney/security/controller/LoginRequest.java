package com.charliegamboa.whereismymoney.security.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
class LoginRequest {

    private String username;
    private String password;
}
