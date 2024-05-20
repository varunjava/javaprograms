package Practise.arrays;

import java.util.Arrays;

public class Demo2
{
    public static void main(String[] args)
    {
        int[] nums = { 40, 30, 20, 10 } ;

        change(nums);

        System.out.println(Arrays.toString(nums)); //

    }
    public static void change( int[] nums )
    {
        nums = new int[]{ 10, 20, 30, 40} ;

    }
}
