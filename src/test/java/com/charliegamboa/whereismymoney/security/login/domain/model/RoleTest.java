package com.charliegamboa.whereismymoney.security.login.domain.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class RoleTest {

    @Test
    void canCreateRole(){
        Role role = new Role(1, ERole.ADMIN);
        Assertions.assertThat(role).isNotNull();
    }
}
