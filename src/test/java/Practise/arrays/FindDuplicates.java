package Practise.arrays;

import java.util.Arrays;

public class FindDuplicates
{
    public static void main(String[] args)
    {
//        int[] a={1,5,1,2,1,3,2,4,4,2};
//        duplicates(a);
        int[] b = {1, 2, 3, 4};
//        reverseArray(b);
//        System.out.println(Arrays.toString(b));

        leftRotate(b, 2);
        System.out.println(Arrays.toString(b));
    }

    public static void duplicates(int[] a)
    {
        boolean[] visited=new boolean[a.length];
        for (int i=0; i<a.length; i++)
        {
            if (visited[i]==false)
            {
                int count = 1;
                for (int j = i+1; j < a.length; j++)
                {
                    if (a[i] == a[j])
                    {
                        count++;
                        visited[j]=true;
                    }
                }
                if (count>1)
                {
                    System.out.println(a[i] + "=" + count);
                }
//                System.out.println(a[i] + "=" + count);
            }
        }
    }

    public static void reverseArray(int[] b)
    {
//        int[] r=new int[b.length];
//        for (int i=b.length-1, j=0; i>=0; i--, j++)
//        {
//            r[j]=b[i];
//        }
//        System.out.print(Arrays.toString(r));
        int temp=0;
        for (int i=b.length-1, j=0; i>j; i--, j++)
        {
            temp=b[i];
            b[i]=b[j];
            b[j]=temp;
        }
    }

    public static void leftRotate(int[] a, int n)
    {
        while (n>0)
        {
            int temp = a[0];
            for (int i = 0; i < a.length - 1; i++)
            {
                a[i] = a[i + 1];
            }
            a[a.length - 1] = temp;
            n--;
        }
    }
}