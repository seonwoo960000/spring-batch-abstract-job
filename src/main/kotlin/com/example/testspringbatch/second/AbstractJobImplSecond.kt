package com.example.testspringbatch.second

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

    override fun abstractReader(): CommonMetricsReader {
        return CommonMetricsReaderImplSecond(jobParam)
    }

    override fun abstractWriter(): CommonMetricsWriter {
        return CommonMetricsWriterImplSecond()
    }
}
