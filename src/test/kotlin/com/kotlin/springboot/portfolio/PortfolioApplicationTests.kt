package com.kotlin.springboot.portfolio

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

@SpringBootTest
class PortfolioApplicationTests {

	@Test
	fun contextLoads() {
	}

	@Test
	fun test() {
		val encrypted = BCryptPasswordEncoder().encode("dkssudgktpdy")
		println(encrypted)
	}

}
