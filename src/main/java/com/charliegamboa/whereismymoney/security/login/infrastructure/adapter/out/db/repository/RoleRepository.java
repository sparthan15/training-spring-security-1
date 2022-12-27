package com.charliegamboa.whereismymoney.security.login.infrastructure.adapter.out.db.repository;

import com.charliegamboa.whereismymoney.security.login.domain.model.ERole;
import com.charliegamboa.whereismymoney.security.login.infrastructure.adapter.out.db.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<RoleEntity, Integer> {
    Optional<RoleEntity> findByName(ERole roleName);
}
