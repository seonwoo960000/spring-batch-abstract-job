package com.example.testspringbatch.first

import com.example.testspringbatch.common.CommonMetricsExtractable
import com.example.testspringbatch.common.CommonMetricsReader

open class CommonMetricsReaderImplFirst(jobParam: JobParamFirst) : CommonMetricsReader() {

    init {
        println("job param: $jobParam, ${jobParam.name}")
    }
    var i = 0
    override fun read(): CommonMetricsExtractable? {
        println("AbstractItemReaderImplFirst reading")

        if (i == 50) return null
        return CommonMetricsExtractableImplFirst(
            name = "first item",
            age = i++,
            height = 180 + i
        )
    }
}
