package com.example.testspringbatch.common

import org.springframework.batch.item.ItemReader


abstract class CommonMetricsReader : ItemReader<CommonMetricsExtractable>
