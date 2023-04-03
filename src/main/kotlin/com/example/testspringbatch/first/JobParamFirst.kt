package com.example.testspringbatch.first

import org.springframework.batch.core.configuration.annotation.JobScope
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.stereotype.Component

@Component
@JobScope
@ConditionalOnProperty(name = ["spring.batch.job.name"], havingValue = "first-job")
data class JobParamFirst(
    @Value("#{jobParameters[\"name\"]}")
    val name: String
)
