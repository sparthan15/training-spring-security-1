package com.charliegamboa.whereismymoney.security.login.domain.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Builder
@Getter
@Setter
public class User {
    private long id;
    private String username;
    private String password;
    private Set<Role> roles;
}
