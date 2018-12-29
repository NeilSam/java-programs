package com.patterns.structural.decorator.concrete;

import com.patterns.structural.decorator.abstracts.Shape;

public class Circle implements Shape {

   @Override
   public void draw() {
      System.out.println("Shape: Circle");
   }
}