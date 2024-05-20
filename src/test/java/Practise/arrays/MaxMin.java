package Practise.arrays;

public class MaxMin
{

    public static void main(String[] args)
    {
        int[] a={10,5,20,15,30,40};
        maxSal(a,1);
    }

    public static void maxSal(int[] a,int n)
    {
        for (int i=0; i<a.length; i++)
        {
            for (int j=i+1; j<a.length; j++)
            {
                if (a[i] < a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }

        System.out.println("The "+n+" st/nd/rd/th  maximum sal is "+a[n-1]);
    }
}
