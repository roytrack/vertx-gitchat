package com.roytrack.http;

import io.vertx.core.Vertx;

public class HttpAndWsServer {
  public static void main(String[] args) {
    Vertx vertx = Vertx.vertx();
    //创建 httpServer
    vertx.createHttpServer()
        //增加 websocket服务
        .websocketHandler(ws -> {
          System.out.println("path is " + ws.path());
          if (!ws.path().equals("/ws")) {
            ws.reject();
          }
          ws.textMessageHandler(msg -> {
            ws.writeTextMessage(msg);
          });
        })
        //增加 http服务
        .requestHandler(req -> {
          req.response()
              .putHeader("content-type", "text/plain")
              .end("Hello from Vert.x!");
        })
        //指定监听端口
        .listen(8080, res -> {
          if (res.succeeded()) {
            System.out.println("Begin http server !");
          } else {
            System.out.println("Http server occured error " + res.cause());
          }
        });
  }
}
