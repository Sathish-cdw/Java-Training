package task1;

class Singleton 
{
    static Singleton singleton;

    public  Singleton() {}

    public static Singleton createInstance() 
    {
        if(singleton == null)
            singleton = new Singleton();
        return singleton;
    }
    
    public void testPrint() 
    {
        System.out.println("In singleton class.");
    }
}

public class SingletonDemo
{
    public static void main(String[] args)
    {
        Singleton singleton = Singleton.createInstance();
        singleton.testPrint();
    }
}