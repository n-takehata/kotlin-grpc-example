package com.example.grpc.kotlin.kotlingrpcexample.client.interceptor

import io.grpc.*
import io.grpc.ForwardingClientCall.SimpleForwardingClientCall
import io.grpc.ForwardingClientCallListener.SimpleForwardingClientCallListener
import org.slf4j.LoggerFactory

/**
 * クライアント側のgRPCインターセプター
 */
class MetadataClientInterceptor : ClientInterceptor {
    companion object {
        private val log = LoggerFactory.getLogger(MetadataClientInterceptor::class.java)
    }

    override fun <ReqT, RespT> interceptCall(method: MethodDescriptor<ReqT, RespT>?,
                                             callOptions: CallOptions?, next: Channel): ClientCall<ReqT, RespT>? {
        return object : SimpleForwardingClientCall<ReqT, RespT>(next.newCall(method, callOptions)) {
            override fun start(responseListener: Listener<RespT>?, headers: Metadata) {
                // サーバーへ送信するヘッダの値を設定
                headers.put(Metadata.Key.of("example_header", Metadata.ASCII_STRING_MARSHALLER), "Example Header")
                super.start(MetadataClientCallListener(responseListener), headers)
            }
        }
    }

    internal class MetadataClientCallListener<RespT>(responseListener: ClientCall.Listener<RespT>?) : SimpleForwardingClientCallListener<RespT>(responseListener) {
        // クライアント側の後処理の定義
        override fun onClose(status: Status?, trailers: Metadata?) {
            try {
                // サーバーから受信したトレーラーの値を取得
                val exampleTrailer = trailers?.get(Metadata.Key.of("example_trailer", Metadata.ASCII_STRING_MARSHALLER))
                log.info("trailer=$exampleTrailer")
            } finally {
                super.onClose(status, trailers)
            }
        }
    }
}