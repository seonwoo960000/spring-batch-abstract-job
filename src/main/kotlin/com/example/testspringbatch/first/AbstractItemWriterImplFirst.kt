package com.example.testspringbatch.first

import com.example.testspringbatch.common.AbstractItem
import com.example.testspringbatch.common.AbstractItemWriter

open class AbstractItemWriterImplFirst : AbstractItemWriter() {
    override fun writeOthers(items: MutableList<out AbstractItem>) {
        println("AbstractWriterImplFirst writing")
        println(items)
    }
}
