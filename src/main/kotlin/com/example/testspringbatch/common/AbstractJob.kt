package com.example.testspringbatch.common

import org.springframework.batch.core.Job
import org.springframework.batch.core.Step
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory
import org.springframework.batch.core.configuration.annotation.JobScope
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory
import org.springframework.batch.core.configuration.annotation.StepScope
import org.springframework.context.annotation.Bean

abstract class AbstractJob(
    private val jobBuilderFactory: JobBuilderFactory,
    private val stepBuilderFactory: StepBuilderFactory
) {

    fun abstractJob(jobName: String): Job {
        return jobBuilderFactory.get(jobName)
            .start(abstractStep())
            .build()
    }

    @Bean
    @JobScope
    open fun abstractStep(): Step {
        return stepBuilderFactory.get("step")
            .chunk<CommonMetricsExtractable, CommonMetricsExtractable>(5)
            .reader(abstractReader())
            .writer(abstractWriter())
            .build()
    }

    @Bean
    @StepScope
    abstract fun abstractReader(): CommonMetricsReader

    @Bean
    @StepScope
    abstract fun abstractWriter(): CommonMetricsWriter
}
