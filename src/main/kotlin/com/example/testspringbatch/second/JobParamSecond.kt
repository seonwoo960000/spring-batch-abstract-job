package com.example.testspringbatch.second

import org.springframework.batch.core.configuration.annotation.JobScope
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.stereotype.Component

@Component
@JobScope
@ConditionalOnProperty(name = ["spring.batch.job.name"], havingValue = "second-job")
data class JobParamSecond(
    @Value("#{jobParameters[\"gender\"]}")
    val gender: String
)
