package Patterns;

import java.awt.Shape;
import java.util.HashMap;

public class ShapeFactory {

 
   private static final HashMap circleMap = new HashMap();

   public static Shape getCircle(String colorPassed) {
      Names color = (Names)circleMap.get(colorPassed);

      if(color == null) {
         color = new Names(colorPassed);
         circleMap.put(colorPassed, color);
         System.out.println("Creating circle of color : " + colorPassed);
      }
      return color;
   }
}