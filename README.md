# 概要
KotlinでのgRPCサーバー、クライアントの実装サンプル。  

参考:  
https://blog.takehata-engineer.com/entry/server-side-kotlin-grpc-summary-from-project-creation-to-basic-api

# 実行方法
## アプリケーションを起動
プロジェクトルートにて下記のコマンドを実行。

```
$ ./gradlew bootRun
```

もしくはIntelliJ IDEAでGradleビューを開き、```Tasks -> application -> bootRun``` を実行。

## 動作確認
ターミナルから下記のコマンドを実行。

```
$ curl -H 'Content-Type:application/json' -X POST -d '{"name":"Sarina"}' http://localhost:8080/createmessage
```

nameのパラメータで渡した値が埋め込まれたメッセージが返却される。  
この例の場合は「Hello Sarina」。

## Protocol Buffersの定義からファイル生成
ターミナルから下記のコマンドを実行。

```
$ ./gradlew generateProto
```

もしくはIntelliJ IDEAでGradleビューを開き、```Tasks -> other -> generateProto``` を実行。

# 構成
## src/main/kotlin
### com.example.grpc.kotlin.kotlingrpcexample.client配下
ユーザーからの操作を受け付け、gRPCサーバーへ接続するREST API。  
以下のパッケージから成る。

- controller・・・リクエストを受け付けるController。
- form・・・リクエスト、レスポンスのパラメータを保持するデータクラス
- interceptor・・・gRPC通信のクライアント側のインターセプター。

### com.example.grpc.kotlin.kotlingrpcexample配下
gRPCのリクエストを受け付けるサーバー。
以下のパッケージから成る。

- grpcservice・・・gRPCの通信のインターフェースとなるメソッドが定義された層。
- interceptor・・・gRPC通信のサーバー側のインターセプター。
- service・・・サーバー側のビジネスロジックを実装する層。

## src/main/generated
### com.example.grpc.kotlingrpcexample.proto配下
Protocol Buffersの定義から生成されたファイル群。  

## src/main/proto
Protocol Buffersの定義ファイル。

# 処理のフロー
![20191201214924 (1)](https://user-images.githubusercontent.com/4271196/73590572-5b897e80-4527-11ea-942a-e989d0721c6f.png)

Springアプリケーションの中で通常のHTTP通信(8080ポート)とgRPC通信(6565ポート)の接続が両方できるようになっていて、「REST APIへのHTTP通信→gRPCのServiceを実行」という流れで動作確認できるようになっている。  