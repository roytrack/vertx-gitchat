package com.roytrack.fluent;

import io.vertx.core.json.JsonObject;

public class VertxDemo {
  public static void main(String[] args) {
    JsonObject jsonObject = new JsonObject().put("name", "roy").put("age", "30");
    System.out.println(jsonObject.toString());
  }
}
