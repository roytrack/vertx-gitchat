package com.roytrack.vertx;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;

public class BlockWarningDemo extends AbstractVerticle {


  public static void main(String[] args) {
    Vertx vertx = Vertx.vertx();
    BlockWarningDemo blockWarningDemo = new BlockWarningDemo();
    vertx.deployVerticle(blockWarningDemo);
    vertx.close();
  }

  @Override
  public void start() throws Exception {
    Thread.sleep(3000L);
  }

}
