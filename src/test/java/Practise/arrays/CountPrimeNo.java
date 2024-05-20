package Practise.arrays;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;

public class CountPrimeNo
{
    public static void main(String[] args)
    {
        int[] a={10,20,5,3,1};
        System.out.println(isPrime(2));
        System.out.println(primeArray(a));
    }

    public static Boolean isPrime(int a)
    {
        int count=0;
        for (int i=1; i<=a; i++)
        {
            if (a%i==0)
            {
                count++;
            }
        }
        if (count==2)
        {
            return true;
        }
        else
            return false;
    }

    public static int primeArray(int[] a)
    {
        int count=0;
        for (int i=0; i<a.length; i++)
        {
            if (isPrime(a[i]))
            {
                count++;
            }
        }
        return count;
    }
}
