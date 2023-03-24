package task1;

class Singleton 
{
    static Singleton singleton;

    public  Singleton() {}

    public static Singleton createInstance() 
    {
        if(singleton == null)
        {
           singleton = new Singleton();
           System.out.println("singletion new class is created ");
        }
        else
        {
        	System.out.println("singletion class is already exist ");
        }
        return singleton;
    }
}

public class SingletonDemo
{
    public static void main(String[] args)
    {
        Singleton singleton = Singleton.createInstance();
    }
}
