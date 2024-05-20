package Practise.arrays;

public class SortedArray
{
    public static void main(String[] args)
    {
        int[] a={1, 4, 8, 9,12};
        missingNumberInSortedArray(a);
    }

    public static void numberBwRange(int m,int n)
    {
        for (int i=m; i<=n;i++)
        {
            System.out.println(i);
        }
    }

    public static void missingNumberInSortedArray(int[] a)
    {
        for (int i=0;i<a.length-1; i++)
        {
            numberBwRange(a[i]+1, a[i+1]-1);
        }
    }
}
