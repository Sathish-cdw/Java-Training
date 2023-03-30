package Patterns;

public class FlyWeight {
	   private static final String colors[] = { "red", "white", "green", "blue", "pink" };
	   public static void main(String[] args) {

	      for(int i=0; i < 10; ++i) {
	         Names  colors= (Names)ShapeFactory.getCircle(getRandomColor());
	         colors.setX(getRandomX());
	         colors.setY(getRandomY());
	         colors.setRadius(100);
	         colors.draw();
	      }
	   }
	   private static String getRandomColor() {
	      return colors[(int)(Math.random()*colors.length)];
	   }
	   private static int getRandomX() {
	      return (int)(Math.random()*100 );
	   }
	   private static int getRandomY() {
	      return (int)(Math.random()*100);
	   }
	}