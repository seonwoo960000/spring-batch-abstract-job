package com.example.testspringbatch.second

import com.example.testspringbatch.common.CommonMetricsExtractable
import com.example.testspringbatch.common.CommonMetricsWriter

open class CommonMetricsWriterImplSecond : CommonMetricsWriter() {
    override fun writeCustomMetrics(items: MutableList<out CommonMetricsExtractable>) {
        println("AbstractWriterImplSecond writing")
        println(items)
    }
}
