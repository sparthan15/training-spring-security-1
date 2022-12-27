package com.charliegamboa.whereismymoney.security.login.infrastructure.adapter.out.db.repository;

import com.charliegamboa.whereismymoney.security.login.infrastructure.adapter.out.db.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByUsername(String username);

    boolean existsByEmail(String email);

    boolean existsByUsername(String username);
}
