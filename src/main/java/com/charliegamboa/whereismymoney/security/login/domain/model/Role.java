package com.charliegamboa.whereismymoney.security.login.domain.model;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@Builder
public final class Role {

    private final int id;
    private final ERole name;
}
