package com.kotlin.springboot.portfolio.domain.repository

import com.kotlin.springboot.portfolio.domain.entity.ProjectSkill
import org.springframework.data.jpa.repository.JpaRepository

interface ProjectSkillRepository: JpaRepository<ProjectSkill, Long> {
    
}