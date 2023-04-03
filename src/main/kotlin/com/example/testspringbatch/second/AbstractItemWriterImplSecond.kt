package com.example.testspringbatch.second

import com.example.testspringbatch.common.AbstractItem
import com.example.testspringbatch.common.AbstractItemWriter

open class AbstractItemWriterImplSecond : AbstractItemWriter() {
    override fun writeOthers(items: MutableList<out AbstractItem>) {
        println("AbstractWriterImplSecond writing")
        println(items)
    }
}
