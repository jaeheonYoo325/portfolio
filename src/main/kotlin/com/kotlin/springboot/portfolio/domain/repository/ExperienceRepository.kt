package com.kotlin.springboot.portfolio.domain.repository

import com.kotlin.springboot.portfolio.domain.entity.Experience
import org.springframework.data.jpa.repository.JpaRepository

interface ExperienceRepository: JpaRepository<Experience, Long> {
    
}