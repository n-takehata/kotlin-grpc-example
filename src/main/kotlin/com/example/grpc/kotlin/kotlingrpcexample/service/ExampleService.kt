package com.example.grpc.kotlin.kotlingrpcexample.service

interface ExampleService {
    fun creteMessageText(name: String): String
}