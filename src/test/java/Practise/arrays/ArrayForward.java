package Practise.arrays;

public class ArrayForward
{
    public static void main(String[] args)
    {
        int[] a={1,2,3,4,5,6,7};
        forward(a);
        System.out.println("===================");
        reverse(a);
        System.out.println("===================");
        evenIndx(a);
        System.out.println("===================");
        evenNum(a);
        System.out.println("===================");
        sum(a);
        System.out.println("===================");
        avg(a);
        System.out.println("===================");
        firstLast(a);
        System.out.println("===================");
        firstMid(a);
        System.out.println("===================");
        extractMid(a);
    }

    public static void forward(int[] a){
        for (int i=0;i< a.length;i++){
            System.out.println(a[i]);
        }
    }

    public static void reverse(int[] a){
        for (int i=a.length-1; i>=0; i--){
            System.out.println(a[i]);
        }
    }

    public static void evenNum(int[] a){
        for (int i=0;i< a.length;i++)
        {
            if(a[i]%2==0)
            {
                System.out.println(a[i]);
            }
        }
    }

    public static void evenIndx(int[] a){
        for (int i=0;i< a.length;i++)
        {
            if(i%2==0)
            {
                System.out.println(a[i]);
            }
        }
    }

    public static void sum(int[] a)
    {
        int sum=0;
        for (int i=0; i<a.length; i++)
        {
            sum=a[i]+sum;
        }
        System.out.println(sum);
    }

    public static void avg(int[] a)
    {
        double sum=0;
        for (int i=0;i< a.length;i++)
        {
            sum=a[i]+sum;
        }
        double avg=sum/a.length;
        System.out.println(avg);
    }

    public static void firstLast(int[] a){
        for (int i=0, j=a.length-1; i<=j ; i++, j--){
            if(i<j)
            {
                System.out.println(a[i]);
                System.out.println(a[j]);
            }
            else System.out.println(a[i]);
        }
    }

    public static void firstMid(int[] a){
        for (int i=0, j=a.length/2; j<a.length ; i++, j++)
        {
            if (i<a.length/2)
            {
                System.out.println(a[i]);
                System.out.println(a[j]);
            }
            else
            {
                System.out.println(a[j]);
            }
        }
    }

    public static void extractMid(int[] a)
    {
        for (int i=(a.length/2)-1, j=a.length/2; j<a.length ; i--, j++)
        {
            if (i>=0)
            {
                System.out.println(a[i]);
                System.out.println(a[j]);
            }
            else
            {
                System.out.println(a[j]);
            }
        }
    }
}
