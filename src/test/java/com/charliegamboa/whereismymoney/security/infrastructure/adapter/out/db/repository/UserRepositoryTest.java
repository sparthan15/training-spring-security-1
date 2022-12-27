package com.charliegamboa.whereismymoney.security.infrastructure.adapter.out.db.repository;

import com.charliegamboa.whereismymoney.security.login.infrastructure.adapter.out.db.entity.UserEntity;
import com.charliegamboa.whereismymoney.security.login.infrastructure.adapter.out.db.repository.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void canFetchUserByUsername() {
        Optional<UserEntity> user = userRepository.findByUsername("cgamboa");
        Assertions.assertThat(user).isEmpty();
    }

    @Test
    void canKnowIfExistsAUserByEmail() {
        boolean exists = userRepository.existsByEmail("carlogamboa15@gmail.com");
        Assertions.assertThat(exists).isFalse();
    }

    @Test
    void canKnowIfExistsAUserByUsername() {
        boolean exists = userRepository.existsByUsername("cgamboa");
        Assertions.assertThat(exists).isFalse();
    }
}
