package com.charliegamboa.whereismymoney.security;

import com.charliegamboa.whereismymoney.security.login.infrastructure.adapter.out.db.repository.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WhereIsMyMoneySecurityApplicationTests {

	@Autowired
	private UserRepository userRepository;

	@Test
	void testUserRepository(){
		Assertions.assertThat(userRepository).isNotNull();
	}

	@Test
	void contextLoads() {
	}

}
