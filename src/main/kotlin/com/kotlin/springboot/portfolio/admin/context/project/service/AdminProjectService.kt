package com.kotlin.springboot.portfolio.admin.context.project.service

import com.kotlin.springboot.portfolio.admin.data.TableDTO
import com.kotlin.springboot.portfolio.admin.exception.AdminBadRequestException
import com.kotlin.springboot.portfolio.domain.entity.ExperienceDetail
import com.kotlin.springboot.portfolio.domain.entity.Project
import com.kotlin.springboot.portfolio.domain.repository.ProjectRepository
import org.springframework.stereotype.Service

@Service
class AdminProjectService(
    private val projectRepository: ProjectRepository
) {

    fun getExperienceTable(): TableDTO {
        val classInfo = Project::class
        val entities = projectRepository.findAll()

        return TableDTO.from(classInfo, entities, "details", "skills")
    }

    fun getExperienceDetailTable(id: Long?): TableDTO {
        val classInfo = ExperienceDetail::class
        val entities = if (id != null) projectRepository.findById(id)
            .orElseThrow { throw AdminBadRequestException("ID ${id}에 해당하는 데이터를 찾을 수 없습니다.") }
            .details else emptyList()

        return TableDTO.from(classInfo, entities)
    }
}