package task1;

class A 
{
    A() 
    {
        System.out.println("Constructor of A!");
    }
}

class B
{
    B() 
    {
        System.out.println("Constructor of B!");
    }
}

class C extends A 
{
    B b = new B();

}

public class DefaultConstructor
{
    public static void main(String[] args) 
    {
        C c = new C();
    }
}


