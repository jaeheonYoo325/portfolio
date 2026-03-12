package com.kotlin.springboot.portfolio.admin.context.introduction.service

import com.kotlin.springboot.portfolio.admin.data.TableDTO
import com.kotlin.springboot.portfolio.domain.entity.Introduction
import com.kotlin.springboot.portfolio.domain.repository.IntroductionRepository
import org.springframework.stereotype.Service

@Service
class AdminIntroductionService(
    private val introductionRepository: IntroductionRepository
) {

    fun getIntroductionTable(): TableDTO {
        val classInfo = Introduction::class
        val entities = introductionRepository.findAll()

        return TableDTO.from(classInfo, entities)
    }
}