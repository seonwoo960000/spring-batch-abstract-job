package com.example.testspringbatch.second

import com.example.testspringbatch.common.CommonMetricsExtractable
import com.example.testspringbatch.common.CommonMetrics

data class CommonMetricsExtractableImplSecond(
    val name: String,
    val age: Int,
    val handsome: Boolean
):  CommonMetricsExtractable{
    override fun getCommonMetrics(): CommonMetrics {
        return CommonMetrics(
            name = name,
            age = age
        )
    }
}
