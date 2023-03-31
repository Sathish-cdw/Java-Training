package Pattern;

import java.util.Scanner;

public class FactoryPattern {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a shape");
		String a = sc.next();
		Shape shape1 = shapeFactory.getShape(a);
		shape1.draw();
		sc.close();
	}
}

class ShapeFactory {
	public Shape getShape(String shapeType) {
		if (shapeType.equalsIgnoreCase("rectangle")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("square")) {
			return new Square();
		} else if (shapeType.equalsIgnoreCase("triangle")) {
			return new Triangle();
		}
		return null;
	}
}

abstract class Shape {
	abstract void draw();
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("Rectangle is drawn");
	}

}

class Square extends Shape {
	void draw() {
		System.out.println("Square is drawn");
	}
}

class Triangle extends Shape {
	void draw() {
		System.out.println("Triangle is drawn");
	}
}