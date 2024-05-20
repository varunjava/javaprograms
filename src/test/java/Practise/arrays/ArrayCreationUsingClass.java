package Practise.arrays;

import java.util.Arrays;

public class ArrayCreationUsingClass
{
    public static void main(String[] args)
    {
        int[] i=new int[3];
        double[] d=new double[3];
        char[] c=new char[3];
        i[1]=100;
        d[1]=50;
        c[1]='a';
        print(i);
    }

    public static void print(int[] i){
        for (int j=0;j<i.length;j++)
        {
            System.out.println("Integer Array: "+i[j]);
        }
    }

    public static void print(double[] d){
        for (int j=0;j<d.length;j++){
            System.out.println("Double Array: "+d[j]);
        }
    }

    public static void print(char[] c){
        for (int j=0;j<c.length;j++){
            System.out.println("Char Array: "+c[j]);
        }
    }

}
