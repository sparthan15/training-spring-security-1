package com.charliegamboa.whereismymoney.security.infrastructure.adapter.out.db.repository;

import com.charliegamboa.whereismymoney.security.login.domain.model.ERole;
import com.charliegamboa.whereismymoney.security.login.infrastructure.adapter.out.db.entity.RoleEntity;
import com.charliegamboa.whereismymoney.security.login.infrastructure.adapter.out.db.repository.RoleRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
public class RoleRepositoryTest {

    @Autowired
    private RoleRepository roleRepository;
    @Test
    void canFindRoleByName(){
        Optional<RoleEntity> role = roleRepository.findByName(ERole.USER);
        Assertions.assertThat(role).isEmpty();
    }
}
