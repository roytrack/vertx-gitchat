package com.roytrack.http;

import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServer;

public class MinimalHttpServer {
  public static void main(String[] args) {
    Vertx vertx = Vertx.vertx();
    //创建 httpServer
    HttpServer server = vertx.createHttpServer().requestHandler(req -> {
      req.response()
          .putHeader("content-type", "text/plain")
          .end("Hello from Vert.x!");
    });
    //指定监听端口
    server.listen(8080, res -> {
      if (res.succeeded()) {
        System.out.println("Begin http server !");
      } else {
        System.out.println("Http server occured error " + res.cause());
      }
    });
  }
}
