package com.example.testspringbatch.common

import org.springframework.batch.item.ItemWriter


abstract class CommonMetricsWriter : ItemWriter<CommonMetricsExtractable> {
    override fun write(items: MutableList<out CommonMetricsExtractable>) {
        println("AbstractItemWriter writing data")
        writeCustomMetrics(items)
    }

    abstract fun writeCustomMetrics(items: MutableList<out CommonMetricsExtractable>)
}
