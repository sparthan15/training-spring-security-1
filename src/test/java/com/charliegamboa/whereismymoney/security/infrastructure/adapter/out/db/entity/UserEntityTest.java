package com.charliegamboa.whereismymoney.security.infrastructure.adapter.out.db.entity;

import com.charliegamboa.whereismymoney.security.login.domain.model.ERole;
import com.charliegamboa.whereismymoney.security.login.infrastructure.adapter.out.db.entity.RoleEntity;
import com.charliegamboa.whereismymoney.security.login.infrastructure.adapter.out.db.entity.UserEntity;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.Set;

public class UserEntityTest {

    private UserEntity userEntity = new  UserEntity();
    @Test
    void canCreateUserEntity(){
        Assertions.assertThat(userEntity).isNotNull();
    }

    @Test
    void canGetAndSetProperties(){
        userEntity.setUsername("cgamboa");
        userEntity.setId(1l);
        Assertions.assertThat(userEntity.getUsername()).isNotNull();
        Assertions.assertThat(userEntity.getId()).isNotNull();
        Assertions.assertThat(userEntity.getRoles()).hasSize(0);
    }

    @Test
    void userCanHaveMultipleRoles(){
        userEntity.setRoles(Set.of(RoleEntity.builder().name(ERole.ADMIN).id(1).build()));
        Assertions.assertThat(userEntity.getRoles()).hasSize(1);
    }
}
