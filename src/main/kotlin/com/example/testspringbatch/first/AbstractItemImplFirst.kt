package com.example.testspringbatch.first

import com.example.testspringbatch.common.AbstractItem
import com.example.testspringbatch.common.CommonData

data class AbstractItemImplFirst(
    val name: String,
    val age: Int,
    val height: Int
):  AbstractItem{
    override fun getCommonData(): CommonData {
        return CommonData(
            name = name,
            age = age
        )
    }

}
