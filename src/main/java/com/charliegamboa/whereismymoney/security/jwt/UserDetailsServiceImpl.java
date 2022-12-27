package com.charliegamboa.whereismymoney.security.jwt;

import com.charliegamboa.whereismymoney.security.login.infrastructure.adapter.out.db.entity.UserEntity;
import com.charliegamboa.whereismymoney.security.login.infrastructure.adapter.out.db.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user = userRepository.findByUsername(username).orElseThrow(()->
            new UsernameNotFoundException("User not found with userName")
        );
        return UserDetailsImpl.build(user);
    }
}
