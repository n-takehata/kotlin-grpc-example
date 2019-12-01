package com.example.grpc.kotlin.kotlingrpcexample.client.controller

import com.example.grpc.kotlin.kotlingrpcexample.client.form.RestCreateMessageRequest
import com.example.grpc.kotlin.kotlingrpcexample.client.interceptor.MetadataClientInterceptor
import com.example.grpc.kotlingrpcexample.proto.*
import io.grpc.ManagedChannelBuilder
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * gRPCで通信するクライアント(REST API)
 */
@RestController
class ExampleClientController {
    @RequestMapping("/createmessage")
    fun createMessage(@RequestBody request: RestCreateMessageRequest): String {
        val createMessageRequest = CreateMessageRequest.newBuilder().setName(request.name).build()
        val channel = ManagedChannelBuilder.forAddress("localhost", 6565)
                .intercept(MetadataClientInterceptor())
                .usePlaintext().build()
        val stub = ExampleGrpc.newBlockingStub(channel)
        val response = stub.createMessage(createMessageRequest)

        return response.message.text
    }
}