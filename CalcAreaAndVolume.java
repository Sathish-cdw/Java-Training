package task1;


interface CalcArea {
    double area();
    double perimeter();
}

interface CalcVolume {
    double surfaceArea();
    double volume();
}

class Circle implements CalcArea 
{
    public  double radius;
    public final double pi = Math.PI;
    
    Circle(double radius)
    {
        this.radius = radius;
    }
    
    public double area()
    {
        return pi * radius * radius;
    }
    
    public double perimeter()
    {
        return 2 * pi * radius;
    }
}

class Square implements CalcArea 
{
    public double side;
    
    Square(double side)
    {
        this.side = side;
    }
    
    public double area()
    {
        return side * side;
    }
    
    public double perimeter()
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
    
    public double area() 
    {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    
    public double perimeter()
    {
        return a + b + c;
    }
}

class Sphere implements CalcArea, CalcVolume
{
    public double radius;
    public final double pi = Math.PI;
    
    Sphere(double radius) 
    {
        this.radius = radius;
    }
    
    public double area()
    {
        return 4 * pi * radius * radius;
    }
    
    public double perimeter() 
    {
        return 2 * pi * radius;
    }
    
    public double surfaceArea() 
    {
        return 4 * pi * radius * radius;
    }
    
    public double volume()
    {
        return (4/3) * pi * radius * radius * radius;
    }
}

class Cuboid implements CalcArea, CalcVolume
{
    public double side;
    
    Cuboid(double side) 
    {
        this.side = side;
    }
    
    public double area()
    {
        return side * side;
    }
    
    public double perimeter() 
    {
        return 4 * side;
    }
    
    public double surfaceArea() 
    {
        return 6 * side * side;
    }
    
    public double volume() 
    {
        return side * side * side;
    }
}

public class CalcAreaAndVolume
{
    public static void main(String[] args)
    {
        Circle circle = new Circle(5.0);
        System.out.println("Circle area : " + circle.area());
        System.out.println("Circle perimeter :  " + circle.perimeter());
        
        Square square = new Square(10.0);
        System.out.println("Square area : " + square.area());
        System.out.println("Square perimeter : " + square.perimeter());
        
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);
        System.out.println("Triangle area : " + triangle.area());
        System.out.println("Triangle perimeter : " + triangle.perimeter());
        
        Sphere sphere = new Sphere(5.0);
        System.out.println("Sphere area : " + sphere.area());
        System.out.println("Sphere perimeter : " + sphere.perimeter());
        System.out.println("Sphere surface area : " + sphere.surfaceArea());
        System.out.println("Sphere volume : " + sphere.volume());

        Cuboid cube = new Cuboid(12.0);
        System.out.println("Cuboid area : " + cube.area());
        System.out.println("Cuboid perimeter : " + cube.perimeter());
        System.out.println("Cuboid surface area : " + cube.surfaceArea());
        System.out.println("Cuboid volume : " + cube.volume());
    }
}
