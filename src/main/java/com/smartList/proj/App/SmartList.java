package com.smartList.proj.App;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SmartList {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext applicationContext =
        new AnnotationConfigApplicationContext(SmartList.class);
  }
}
