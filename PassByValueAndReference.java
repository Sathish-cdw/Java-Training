package task1;


import java.util.Arrays;

public class PassByValueAndReference
{
    
    public static void main(String[] args) 
    {
        int n = 2;
        float f = 5.0f;
     
        int []array = {12, 4, 36, 82, 10};
        System.out.println("Values of n and f before function call : "+n+", "+f);
        forPrimitive(n, f);
        System.out.println("Values of n and f after function call : "+n+", "+f);
        System.out.println("Array values before function call:"+Arrays.toString(array));
        forArray(array);
        System.out.println("Array values after function call:"+Arrays.toString(array));

    }

    public static void forPrimitive(int n, float f)
    {
        n += 10;
        f -= 2.5f;
    }

    public static void forArray(int []array)
    {
        for(int i=0; i<array.length; i++)
            array[i] += 2;
    }

}
