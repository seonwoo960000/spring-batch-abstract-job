package com.example.testspringbatch.second

import com.example.testspringbatch.common.AbstractItem
import com.example.testspringbatch.common.CommonData

data class AbstractItemImplSecond(
    val name: String,
    val age: Int,
    val handsome: Boolean
):  AbstractItem{
    override fun getCommonData(): CommonData {
        return CommonData(
            name = name,
            age = age
        )
    }
}
