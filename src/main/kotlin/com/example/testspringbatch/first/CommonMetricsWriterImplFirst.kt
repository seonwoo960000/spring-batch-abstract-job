package com.example.testspringbatch.first

import com.example.testspringbatch.common.CommonMetricsExtractable
import com.example.testspringbatch.common.CommonMetricsWriter

open class CommonMetricsWriterImplFirst : CommonMetricsWriter() {
    override fun writeCustomMetrics(items: MutableList<out CommonMetricsExtractable>) {
        println("AbstractWriterImplFirst writing")
        println(items)
    }
}
