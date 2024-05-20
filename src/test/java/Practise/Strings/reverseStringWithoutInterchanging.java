package Practise.Strings;

import java.util.Arrays;

public class reverseStringWithoutInterchanging
{
    public static void main(String[] args)
    {
//        reverseStringSb("java class");
//        String s=reverseWord("Test Yantra");
//        System.out.println(s);
        reverseWordsSentence("Test Yantra Company");
//        reverseUsingStringBuilder("Test Yantra Company");

    }

    public static void reverseStringSb(String str)
    {
        String[] words=str.split(" ");
        System.out.println(Arrays.toString(words));
        for (int i=0; i<words.length; i++)
        {
            words[i]= new StringBuilder(words[i]).reverse().toString();
//            taking word from array
//            String word=words[i];
//            Reversing word
//            StringBuilder sb=new StringBuilder(word);
//            String rev=sb.reverse().toString();
//            System.out.println(rev);
//            String rev=reverseWord(word);

//            Storing reversed word back to Array
//            words[i]=rev;
        }
        str=String.join(" ",words);
        System.out.println(str);
    }

    public static String reverseWord(String str)
    {
        char[] ch=str.toCharArray();
        char temp;
        for (int i=0, j=ch.length-1; i<j; i++,j--)
        {
            temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
        }
        String s=String.valueOf(ch);
        return s;
    }

    public static void reverseWordsSentence(String str)
    {
        String[] s=str.split(" ");
        String rev="";
        for (int i=0; i<s.length; i++)
        {
            char[] ch=s[i].toCharArray();
            for (int j=ch.length-1; j>=0; j--)
            {
                rev=rev+ch[j];
            }
            rev=rev+" ";
        }
        System.out.println(rev);
    }

    public static void reverseUsingStringBuilder(String str)
    {
     String[] s=str.split(" ");
     for (int i=0; i<s.length; i++)
     {
         s[i]=new StringBuilder(s[i]).reverse().toString();
//         =sb.reverse().toString();
//         System.out.print(s[i]+" ");
     }
        str=String.join(" ",s);
        System.out.println(str);
    }
}
