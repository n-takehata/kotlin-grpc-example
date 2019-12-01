package com.example.grpc.kotlin.kotlingrpcexample.service.impl

import com.example.grpc.kotlin.kotlingrpcexample.service.ExampleService
import org.springframework.stereotype.Service

@Service
class ExampleServiceImpl : ExampleService {
    override fun creteMessageText(name: String): String {
        return "Hello $name"
    }
}