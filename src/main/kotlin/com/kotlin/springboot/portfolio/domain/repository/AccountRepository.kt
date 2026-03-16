package com.kotlin.springboot.portfolio.domain.repository

import com.kotlin.springboot.portfolio.domain.entity.Account
import org.springframework.data.jpa.repository.JpaRepository
import java.util.Optional

interface AccountRepository : JpaRepository<Account, Long> {

    fun findByLoginId(loginId: String): Optional<Account>

}