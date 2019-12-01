package com.example.grpc.kotlin.kotlingrpcexample.interceptor

import io.grpc.*
import org.lognet.springboot.grpc.GRpcGlobalInterceptor
import org.slf4j.LoggerFactory
import org.springframework.core.annotation.Order

/**
 * メタデータを処理するインターセプター
 */
@GRpcGlobalInterceptor
@Order(30)
class MetadataInterceptor : ServerInterceptor {
    companion object {
        private val log = LoggerFactory.getLogger(MetadataInterceptor::class.java)
    }

    override fun <ReqT : Any, RespT : Any> interceptCall(call: ServerCall<ReqT, RespT>, headers: Metadata, next: ServerCallHandler<ReqT, RespT>): ServerCall.Listener<ReqT> {
        // クライアントから受信したヘッダの値を取得
        val exampleHeader = headers.get(Metadata.Key.of("example_header", Metadata.ASCII_STRING_MARSHALLER))
        log.info("header=$exampleHeader")

        return next.startCall(object : ForwardingServerCall.SimpleForwardingServerCall<ReqT, RespT>(call) {
            // サーバー側の後処理の定義
            override fun close(status: Status?, trailers: Metadata) {
                log.info("execute close")

                // クライアントへ送信するトレーラーの値を設定
                trailers.put(Metadata.Key.of("example_trailer", Metadata.ASCII_STRING_MARSHALLER), "Example Trailer")
                super.close(status, trailers)
            }
        }, headers)
    }
}