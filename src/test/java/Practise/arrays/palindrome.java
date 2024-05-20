package Practise.arrays;

import java.util.Arrays;

public class palindrome
{
    public static void main(String[] args)
    {
        int[] a={22, 98, 212, 414};
//        palindromeBwRange(100,1001);
//        bonusArray(a);
//        System.out.println(sum(12570));
//        evenOddArray(a);
//        System.out.println(Arrays.toString(a));
        firstSecond(a);
    }

    public static boolean isPalindrome(int num)
    {
        int temp=num;
        int rev=0;
        while (temp>0)
        {
            int last=temp%10;
            rev=rev*10+last;
            temp=temp/10;
        }
        if (rev==num)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void palindromeBwRange(int m,int n)
    {
        for (int i=m; i<=n; i++)
        {
            if (isPalindrome(i))
            {
                System.out.println(i);
            }
        }
    }

    public static void bonusArray(int[] a)
    {
        for (int i=0; i<a.length; i++)
        {
            int num=a[i];
            int bonus=0;
            if (isPalindrome(num))
            {
                bonus+=5;
            }
            if (  sum(num)< 5)
            {
                bonus+=3;
            }
            if (num%2==0)
            {
                bonus+=2;
            }
            if (bonus>6)
            {
                System.out.println(bonus + " is the bonus of " + num);
            }
        }
    }

    public static int sum(int num)
    {
        int add=0;
        while (num>0)
        {
            int last=num%10;
            add=add+last;
            num=num/10;
        }
        return add;
    }

    public static void evenOddArray(int[] a)
    {
        for (int i=0; i<a.length; i++)
        {
            int num=a[i];
            if (num%2==0)
            {
                a[i]=num+10;
            }
            else
            {
                a[i]=num*10;
            }
        }
    }

    public static void firstSecond(int[] a)
    {
        int firstSum=0;
        int lastSum=0;
        for (int i=0; i<a.length; i++)
        {
            if (i<=(a.length-1)/2)
            {
                firstSum=a[i]+firstSum;
            }
            else
            {
                lastSum=a[i]+lastSum;
            }
        }
        System.out.println(firstSum);
        System.out.println(lastSum);
        if (firstSum>lastSum)
        {
            System.out.println("hi");
        }
        else
            System.out.println("bye");
    }
}
