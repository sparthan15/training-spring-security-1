package com.charliegamboa.whereismymoney.security.infrastructure.adapter.out.db.entity;

import com.charliegamboa.whereismymoney.security.login.domain.model.ERole;
import com.charliegamboa.whereismymoney.security.login.infrastructure.adapter.out.db.entity.RoleEntity;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class RoleEntityTest {
    private RoleEntity roleEntity = new RoleEntity();
    @Test
    void canCreateRoleEntity(){

        Assertions.assertThat(roleEntity).isNotNull();
    }

    @Test
    void canSetGetTheProperties(){
        roleEntity.setName(ERole.ADMIN);
        roleEntity.setId(1);
        Assertions.assertThat(roleEntity.getName().name()).isEqualTo(ERole.ADMIN.name());
        Assertions.assertThat(roleEntity.getId()).isNotNull();
    }
}
