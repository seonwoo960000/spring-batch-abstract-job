package com.example.testspringbatch.second

import com.example.testspringbatch.common.AbstractItem
import com.example.testspringbatch.common.AbstractItemReader

open class AbstractItemReaderImplSecond(jobParam: JobParamSecond) : AbstractItemReader() {

    init {
        println("Job parameter: $jobParam, ${jobParam.gender}")
    }
    var i = 0
    override fun read(): AbstractItem? {
        println("AbstractItemReaderImplSecond reading")

        if (i == 50) return null
        return AbstractItemImplSecond(
            name = "second item",
            age = i++,
            handsome = i % 2 == 0
        )
    }
}
