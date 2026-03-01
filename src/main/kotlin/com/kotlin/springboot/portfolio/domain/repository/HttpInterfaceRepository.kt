package com.kotlin.springboot.portfolio.domain.repository

import com.kotlin.springboot.portfolio.domain.entity.HttpInterface
import org.springframework.data.jpa.repository.JpaRepository

interface HttpInterfaceRepository: JpaRepository<HttpInterface, Long> {
    
}