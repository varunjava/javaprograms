package Practise.Strings;

import java.util.Scanner;

public class InterviewQuestions
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Provide String");
        String str=s.next();
        String RevStr=reverseStringFromHalf(str);
        System.out.println(RevStr);
    }

    public static String reverseStringFromHalf(String str)
    {
        char[] ch=str.toCharArray();
        int mid=ch.length/2;
        for (int i=mid, j=ch.length-1; i<j; i++,j--)
        {
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
        }
        return new String(ch);
    }
}
