package com.roytrack.fluent;

import java.util.ArrayList;
import java.util.List;

public class Java8Demo {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList();
    for (int i = 0; i < 100; i++) {
      list.add(i);
    }
    int result = list.stream().map(v->v+1).reduce(0,(v1,v2)->v1+v2);
    System.out.println(result);
  }
}
