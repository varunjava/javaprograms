package Practise.arrays;

import java.util.Arrays;

public class Demo
{

    public static void main(String[] args)
    {
        int num = 1 ;
        int[] nums = {1 } ;

        change( num , nums );

        System.out.println( num ); //
        System.out.println( nums[0] ); //
    }
    static void change( int num , int[] nums)
    {
        num++ ;
        nums[0]++ ;
    }
}
