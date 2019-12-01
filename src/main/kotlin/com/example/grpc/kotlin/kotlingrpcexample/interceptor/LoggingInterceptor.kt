package com.example.grpc.kotlin.kotlingrpcexample.interceptor

import io.grpc.Metadata
import io.grpc.ServerCall
import io.grpc.ServerCallHandler
import io.grpc.ServerInterceptor
import org.lognet.springboot.grpc.GRpcGlobalInterceptor
import org.slf4j.LoggerFactory
import org.springframework.core.annotation.Order

/**
 * ログ出力のインターセプター
 */
@GRpcGlobalInterceptor
@Order(10)
class LoggingInterceptor : ServerInterceptor {
    companion object {
        private val log = LoggerFactory.getLogger(LoggingInterceptor::class.java)
    }

    override fun <ReqT : Any, RespT : Any> interceptCall(call: ServerCall<ReqT, RespT>, headers: Metadata, next: ServerCallHandler<ReqT, RespT>): ServerCall.Listener<ReqT> {
        log.info("method name=${call.methodDescriptor.fullMethodName}")
        return next.startCall(call, headers)
    }
}