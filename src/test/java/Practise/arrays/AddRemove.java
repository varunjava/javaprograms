package Practise.arrays;

import java.util.Arrays;

public class AddRemove
{
    public static void main(String[] args)
    {
        int[] a={5,6,4,6,3,2};
        System.out.println(maxNum(a));
        System.out.println(minNum(a));
        repeat(a,2);
        searchElement(a,222);
        a=addIndexElement(a, 88, 1);
        System.out.println(Arrays.toString(a));
        a=removeElement(a, 2);
        System.out.println(a);
        a=removeIndexElement(a, 3);
        System.out.println(Arrays.toString(a));
        secondMax(a);
    }

    public static void addElement(int[] a,int n)
    {
        for (int i=0; i<a.length; i++)
        {
            if (i==2)
            {
                a[i+1]=a[i];
                a[i]=n;
            }
        }
    }

    public static int maxNum(int[] a)
    {
        int max=Integer.MIN_VALUE;
        for (int i=0; i<a.length; i++)
        {
            if (max < a[i])
            {
                max=a[i];
            }
        }
        return max;
    }

    public static int minNum(int[] a)
    {
        int min=Integer.MAX_VALUE;
        for (int i=0; i<a.length; i++)
        {
            if (min > a[i])
            {
                min=a[i];
            }
        }
        return min;
    }

    public static void repeat(int[] a, int n)
    {
        int count=0;
        for (int i=0; i<a.length; i++)
        {
            if (a[i]==n)
                {
                      count++;
                }
        }
        System.out.println("the number of times "+n+" repeated is "+count);
    }

    public static void searchElement(int[] a,int n)
    {
        for (int i=0; i<a.length; i++)
        {
             if (a[i]==n)
             {
                 System.out.println(n+" is present in array in "+i+" index"); return;
             }
        }
            System.out.println(n+" is not present in array ");
    }

    public static int[] removeElement(int[] a, int ele)
    {
        int[] temp=new int[a.length-1];
        boolean flag=false;
      for (int i=0, j=0; i<a.length; i++)
     {
         if (a[i]!=ele || flag)
         {
             temp[j]=a[i];
             j++;
         }
         else
             flag=true;
     }
        return temp;
    }

    public static int[] removeIndexElement(int[] a, int index)
    {
        int[] temp=new int[a.length-1];
        for (int i=0, j=0; i<a.length; i++)
        {
            if (i!=index)
            {
                temp[j]=a[i];
                j++;
            }
        }
        return temp;
    }

    public static int[] addIndexElement(int[] a, int ele,int index)
    {
        int[] temp=new int[a.length+1];
        for (int i=0, j=0; i<temp.length; i++)
        {
            if (i==index)
            {
              temp[i]=ele;
            }
            else
            {
                temp[i]=a[j];
                j++;
            }
        }
        return temp;
    }

    public static void secondMax(int[] a)
    {
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        int thirdMax=Integer.MIN_VALUE;
//        for (int i=0; i<a.length; i++)
//        {
//            if (max<a[i])
//            {
//                max=a[i];
//            }
//        }
//        for (int i=0; i<a.length; i++)
//        {
//
//            if (secondMax<a[i] && a[i]<max)
//            {
//                secondMax=a[i];
//            }
//        }
        for (int i=0; i<a.length; i++)
        {
            if (max<a[i])
            {
                thirdMax=secondMax;
                secondMax=max;
                max=a[i];
            }
            else if (secondMax<a[i] && a[i]<max)
            {
                thirdMax=secondMax;
                secondMax=a[i];
            }
            else if (thirdMax<a[i] && a[i]<secondMax)
            {
                thirdMax=a[i];
            }
        }
        System.out.println(max);
        System.out.println(secondMax);
        System.out.println(thirdMax);
    }
}
