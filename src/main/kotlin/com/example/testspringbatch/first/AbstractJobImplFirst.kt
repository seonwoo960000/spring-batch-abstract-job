package com.example.testspringbatch.first

import com.example.testspringbatch.common.CommonMetricsReader
import com.example.testspringbatch.common.CommonMetricsWriter
import com.example.testspringbatch.common.AbstractJob
import org.springframework.batch.core.Job
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

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

    override fun abstractReader(): CommonMetricsReader {
        return CommonMetricsReaderImplFirst(jobParam)
    }

    override fun abstractWriter(): CommonMetricsWriter {
        return CommonMetricsWriterImplFirst()
    }
}
