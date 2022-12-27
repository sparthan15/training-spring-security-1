package com.charliegamboa.whereismymoney.security.login.domain.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Set;

public class UserTest {

    private User user;

    @BeforeEach
    public void setUp() {
        user = User.builder()
                .id(1l)
                .username("cgamboa")
                .password("123123")
                .roles(Set.of(Role.builder().name(ERole.ADMIN).build(),
                        Role.builder().name(ERole.USER).build()))
                .build();
    }

    @Test
    void canCreateUser() {
        User user = new User(1l, "cgamboa", "123456", Collections.emptySet());
        Assertions.assertThat(user).isNotNull();
    }

    @Test
    void canGetProperties() {
        User user = User.builder()
                .id(1l)
                .username("cgamboa")
                .password("123123")
                .roles(Collections.emptySet())
                .build();
        Assertions.assertThat(user).isNotNull();
        Assertions.assertThat(user.getId()).isNotNull();
        Assertions.assertThat(user.getUsername()).isNotNull();
        Assertions.assertThat(user.getPassword()).isNotNull();
        Assertions.assertThat(user.getRoles()).isNotNull();
    }

    @Test
    void userCanHaveMultipleRoles() {
        Assertions.assertThat(user.getRoles()).hasSize(2);
    }
}
