package com.example.testspringbatch.common

import org.springframework.batch.item.ItemWriter


abstract class AbstractItemWriter : ItemWriter<AbstractItem> {
    override fun write(items: MutableList<out AbstractItem>) {
        println("AbstractItemWriter writing data")
        writeOthers(items)
    }

    abstract fun writeOthers(items: MutableList<out AbstractItem>)
}
