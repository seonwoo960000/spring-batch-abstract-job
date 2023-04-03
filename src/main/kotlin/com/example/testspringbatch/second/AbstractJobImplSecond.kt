package com.example.testspringbatch.second

import com.example.testspringbatch.common.AbstractItemReader
import com.example.testspringbatch.common.AbstractItemWriter
import com.example.testspringbatch.common.AbstractJob
import com.example.testspringbatch.first.JobParamFirst
import org.springframework.batch.core.Job
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory
import org.springframework.batch.core.configuration.annotation.JobScope
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Lazy

@Configuration
@ConditionalOnProperty(name = ["spring.batch.job.name"], havingValue = "second-job")
class AbstractJobImplSecond(
    jobBuilderFactory: JobBuilderFactory,
    stepBuilderFactory: StepBuilderFactory,
    val jobParam: JobParamSecond
): AbstractJob(
    jobBuilderFactory,
    stepBuilderFactory
) {
    @Bean
    fun job(): Job {
        return super.abstractJob("second-job")
    }

    override fun abstractReader(): AbstractItemReader {
        return AbstractItemReaderImplSecond(jobParam)
    }

    override fun abstractWriter(): AbstractItemWriter {
        return AbstractItemWriterImplSecond()
    }
}
