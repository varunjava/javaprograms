package Practise.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class TechionQue
{

    public static void main(String[] args)
    {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        leftToRight(a, 2);
        rightToLeft(a, 2);
    }

    public static void leftToRight(int[] a, int iteration)
    {
        int temp;

        for (int i = 0; i < iteration; i++)
        {
            temp = a[0];
            for (int j = 0; j < a.length - 1; j++)
            {
                a[j] = a[j + 1];
            }
            a[a.length - 1] = temp;

        }
        System.out.println(Arrays.toString(a));
    }


    public static void rightToLeft(int[] a, int iteration)
    {
        for (int i = 0; i < iteration; i++)
        {
            int temp = a[a.length - 1];
            for (int j = a.length - 1; j > 0; j--)
            {
                a[j] = a[j - 1];
            }
            a[0] = temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
