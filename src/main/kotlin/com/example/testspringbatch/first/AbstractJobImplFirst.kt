package com.example.testspringbatch.first

import com.example.testspringbatch.common.AbstractItemReader
import com.example.testspringbatch.common.AbstractItemWriter
import com.example.testspringbatch.common.AbstractJob
import org.springframework.batch.core.Job
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory
import org.springframework.batch.core.configuration.annotation.JobScope
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Lazy

@Configuration
@ConditionalOnProperty(name = ["spring.batch.job.name"], havingValue = "first-job")
class AbstractJobImplFirst(
    jobBuilderFactory: JobBuilderFactory,
    stepBuilderFactory: StepBuilderFactory,
    val jobParam: JobParamFirst
): AbstractJob(
    jobBuilderFactory,
    stepBuilderFactory,
) {

    @Bean
    fun job(): Job {
        return super.abstractJob("first-job")
    }

    override fun abstractReader(): AbstractItemReader {
        return AbstractItemReaderImplFirst(jobParam)
    }

    override fun abstractWriter(): AbstractItemWriter {
        return AbstractItemWriterImplFirst()
    }
}
