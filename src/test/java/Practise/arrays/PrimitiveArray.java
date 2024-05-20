package Practise.arrays;

import java.sql.SQLOutput;

public class PrimitiveArray
{
    public static void main(String[] args)
    {
        int[] i={1,2,3};
        double[] d={1.1,2.3,4.5};
        char[] c={'a','b','s'};
        printIntArray(i);
        printDoubleArray(d);
        printCharArray(c);
    }

    public static void printIntArray(int[] i){
        for (int j=0;j< i.length;j++)
        {
            System.out.println(i[j]+",");
        }
    }

    public static void printDoubleArray(double[] d)
    {
        for (int j = 0; j < d.length; j++)
        {
            System.out.println(d[j]+",");
        }
    }

    public static void printCharArray(char[] c)
    {
        for (int j = 0; j < c.length; j++)
        {
            System.out.println(c[j]+",");
        }
    }
}
