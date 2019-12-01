package com.example.grpc.kotlin.kotlingrpcexample.interceptor

import io.grpc.Metadata
import io.grpc.ServerCall
import io.grpc.ServerCallHandler
import io.grpc.ServerInterceptor
import org.slf4j.LoggerFactory
import org.springframework.core.annotation.Order

/**
 * 特定のGrpcService固有のインターセプター
 */
@Order(20)
class MessageInterceptor : ServerInterceptor {
    companion object {
        private val log = LoggerFactory.getLogger(MessageInterceptor::class.java)
    }

    override fun <ReqT : Any, RespT : Any> interceptCall(call: ServerCall<ReqT, RespT>, headers: Metadata, next: ServerCallHandler<ReqT, RespT>): ServerCall.Listener<ReqT> {
        log.info("call createMessage")
        return next.startCall(call, headers)
    }
}