package Patterns;

import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class Names implements Shape {
	   private String color;
	   private int x;
	   private int y;
	   private int radius;

	   public Names(String color){
	      this.color = color;		
	   }

	   public void setX(int x) {
	      this.x = x;
	   }

	   public void setY(int y) {
	      this.y = y;
	   }

	   public void setRadius(int radius) {
	      this.radius = radius;
	   }

	   public void draw() {
	      System.out.println("Circle: Draw() [Color : " + color + ", x : " + x + ", y :" + y + ", radius :" + radius);
	   }

	
	}