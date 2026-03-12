package com.kotlin.springboot.portfolio.admin.context.achievement.service

import com.kotlin.springboot.portfolio.admin.data.TableDTO
import com.kotlin.springboot.portfolio.domain.entity.Achievement
import com.kotlin.springboot.portfolio.domain.repository.AchievementRepository
import org.springframework.stereotype.Service

@Service
class AdminAchievementService(
    private val achievementRepository: AchievementRepository
) {

    fun getAchievementTable(): TableDTO {
        val classInfo = Achievement::class
        val entities = achievementRepository.findAll()

        return TableDTO.from(classInfo, entities)
    }
}