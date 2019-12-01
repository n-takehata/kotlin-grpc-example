package com.example.grpc.kotlin.kotlingrpcexample.grpcservice

import com.example.grpc.kotlin.kotlingrpcexample.interceptor.MessageInterceptor
import com.example.grpc.kotlin.kotlingrpcexample.service.ExampleService
import com.example.grpc.kotlingrpcexample.proto.*
import org.lognet.springboot.grpc.GRpcService
import io.grpc.stub.StreamObserver
import org.slf4j.LoggerFactory

/**
 * gRPCの通信のインターフェースとなるメソッドが定義されたクラス
 */
@GRpcService(interceptors = [MessageInterceptor::class])
class ExampleGrpcService(
        private val exampleService: ExampleService
) : ExampleGrpc.ExampleImplBase() {
    companion object {
        private val log = LoggerFactory.getLogger(ExampleGrpcService::class.java)
    }

    override fun createMessage(request: CreateMessageRequest, responseObserver: StreamObserver<CreateMessageResponse>) {
        val text = exampleService.creteMessageText(request.name)
        val message = Message.newBuilder()
                .setText(text)
                .setLength(text.length)
                .build()
        val responseBuilder = CreateMessageResponse.newBuilder()
                .setMessage(message)
                .setType(MessageType.NORMAL)

        log.info("execute createMessage")

        responseObserver.onNext(responseBuilder.build())
        responseObserver.onCompleted()
    }
}