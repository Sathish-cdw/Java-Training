package task1;

import java.lang.Math.*;

interface CalcArea {
    double getArea();
    double getPerimeter();
}

interface CalcVolume {
    double getSurfaceArea();
    double getVolume();
}

class Circle implements CalcArea 
{
    public  double radius;
    
    Circle(double radius)
    {
        this.radius = radius;
    }
    
    public double getArea()
    {
        return Math.PI * radius * radius;
    }
    
    public double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }
}

class Square implements CalcArea 
{
    public double side;
    
    Square(double side)
    {
        this.side = side;
    }
    
    public double getArea()
    {
        return side * side;
    }
    
    public double getPerimeter()
    {
        return 4 * side;
    }
}

class Triangle implements CalcArea
{
    public double a;
    public double b;
    public double c;
    
    Triangle(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double getArea() 
    {
        //s is said to be semi-perimeter
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    
    public double getPerimeter()
    {
        return a + b + c;
    }
}

class Sphere implements CalcArea, CalcVolume
{
    public double radius;
    
    Sphere(double radius) 
    {
        this.radius = radius;
    }
    
    public double getArea()
    {
        return 4 * Math.PI * radius * radius;
    }
    
    public double getPerimeter() 
    {
        return 2 * Math.PI * radius;
    }
    
    public double getSurfaceArea() 
    {
        return 4 * Math.PI * radius * radius;
    }
    
    public double getVolume()
    {
        return (4/3) * Math.PI * radius * radius * radius;
    }
}

class Cuboid implements CalcArea, CalcVolume
{
    public double side;
    
    Cuboid(double side) 
    {
        this.side = side;
    }
    
    public double getArea()
    {
        return side * side;
    }
    
    public double getPerimeter() 
    {
        return 4 * side;
    }
    
    public double getSurfaceArea() 
    {
        return 6 * side * side;
    }
    
    public double getVolume() 
    {
        return side * side * side;
    }
}

public class CalcAreaAndVolume
{
    public static void main(String[] args)
    {
        Circle circle = new Circle(5.0);
        System.out.println("Circle area : " + circle.getArea());
        System.out.println("Circle perimeter :  " + circle.getPerimeter());
        
        Square square = new Square(10.0);
        System.out.println("Square area : " + square.getArea());
        System.out.println("Square perimeter : " + square.getPerimeter());
        
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);
        System.out.println("Triangle area : " + triangle.getArea());
        System.out.println("Triangle perimeter : " + triangle.getPerimeter());
        
        Sphere sphere = new Sphere(5.0);
        System.out.println("Sphere area : " + sphere.getArea());
        System.out.println("Sphere perimeter : " + sphere.getPerimeter());
        System.out.println("Sphere surface area : " + sphere.getSurfaceArea());
        System.out.println("Sphere volume : " + sphere.getVolume());

        Cuboid cube = new Cuboid(12.0);
        System.out.println("Cuboid area : " + cube.getArea());
        System.out.println("Cuboid perimeter : " + cube.getPerimeter());
        System.out.println("Cuboid surface area : " + cube.getSurfaceArea());
        System.out.println("Cuboid volume : " + cube.getVolume());
    }
}
