package com.example.testspringbatch

import org.springframework.batch.core.Job
import org.springframework.batch.core.JobParametersBuilder
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing
import org.springframework.batch.core.launch.JobLauncher
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Component

@SpringBootApplication
@EnableBatchProcessing
class TestSpringBatchApplication

fun main(args: Array<String>) {
    runApplication<TestSpringBatchApplication>(*args)
}

//@Component
//class CLR(
//    private val jobLauncher: JobLauncher,
//    @Qualifier("first-job") private val job: Job
//) : CommandLineRunner {
//    override fun run(vararg args: String?) {
//
//        val jobParams = JobParametersBuilder()
//            .addString("name", "first")
//            .toJobParameters()
//
//        val jobExecution = jobLauncher.run(job, jobParams)
//        println("jobExecution: $jobExecution")
//    }
//}

@Component
class CLR(
    private val jobLauncher: JobLauncher,
    private val job: Job
) : CommandLineRunner {
    override fun run(vararg args: String?) {

        val jobParams = JobParametersBuilder()
            .addString("name", "seon woo")
            .addString("gender", "male")
            .toJobParameters()

        val jobExecution = jobLauncher.run(job, jobParams)
        println("jobExecution: $jobExecution")
    }
}
