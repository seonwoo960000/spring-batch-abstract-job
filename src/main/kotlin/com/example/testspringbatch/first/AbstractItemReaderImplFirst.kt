package com.example.testspringbatch.first

import com.example.testspringbatch.common.AbstractItem
import com.example.testspringbatch.common.AbstractItemReader

open class AbstractItemReaderImplFirst(jobParam: JobParamFirst) : AbstractItemReader() {

    init {
        println("job param: $jobParam, ${jobParam.name}")
    }
    var i = 0
    override fun read(): AbstractItem? {
        println("AbstractItemReaderImplFirst reading")

        if (i == 50) return null
        return AbstractItemImplFirst(
            name = "first item",
            age = i++,
            height = 180 + i
        )
    }
}
