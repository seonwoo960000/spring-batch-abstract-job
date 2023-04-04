package com.example.testspringbatch.second

import com.example.testspringbatch.common.CommonMetricsExtractable
import com.example.testspringbatch.common.CommonMetricsReader

open class CommonMetricsReaderImplSecond(jobParam: JobParamSecond) : CommonMetricsReader() {

    init {
        println("Job parameter: $jobParam, ${jobParam.gender}")
    }
    var i = 0
    override fun read(): CommonMetricsExtractable? {
        println("AbstractItemReaderImplSecond reading")

        if (i == 50) return null
        return CommonMetricsExtractableImplSecond(
            name = "second item",
            age = i++,
            handsome = i % 2 == 0
        )
    }
}
