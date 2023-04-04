package com.example.testspringbatch.first

import com.example.testspringbatch.common.CommonMetricsExtractable
import com.example.testspringbatch.common.CommonMetrics

data class CommonMetricsExtractableImplFirst(
    val name: String,
    val age: Int,
    val height: Int
):  CommonMetricsExtractable{
    override fun getCommonMetrics(): CommonMetrics {
        return CommonMetrics(
            name = name,
            age = age
        )
    }

}
