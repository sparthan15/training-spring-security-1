package com.charliegamboa.whereismymoney.security.login.infrastructure.adapter.out.db.entity;

import com.charliegamboa.whereismymoney.security.login.domain.model.ERole;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "roles")
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Getter
@Setter
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Enumerated(EnumType.STRING)
    private ERole name;

}
