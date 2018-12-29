package com.patterns.structural.decorator.concrete;

import com.patterns.structural.decorator.abstracts.Shape;

public class Rectangle implements Shape {

   @Override
   public void draw() {
      System.out.println("Shape: Rectangle");
   }
}