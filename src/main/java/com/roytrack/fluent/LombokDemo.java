package com.roytrack.fluent;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class LombokDemo {

  private final String userName;
  private final Integer age;


  public static void main(String[] args) {
    LombokDemo demo = LombokDemo.builder().userName("roy").age(30).build();
    System.out.println(demo);
  }
}
