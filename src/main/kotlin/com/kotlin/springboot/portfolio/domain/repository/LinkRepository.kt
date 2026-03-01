package com.kotlin.springboot.portfolio.domain.repository

import com.kotlin.springboot.portfolio.domain.entity.Link
import org.springframework.data.jpa.repository.JpaRepository

interface LinkRepository: JpaRepository<Link, Long> {
    
}