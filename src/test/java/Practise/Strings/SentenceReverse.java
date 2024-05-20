package Practise.Strings;

import java.util.Arrays;

public class SentenceReverse
{
    public static void main(String[] args)
    {
//        reverseSentence("Test Yantra");
//        reverseCharSentence("Test Yantra");
        System.out.println(spaceRemove("Test Yantra"));
//        System.out.println(spaceRemoveFor("Test yantraaa"));
//        String[] s=removeSpaceSplit("Testing Yantra");
//        System.out.println(Arrays.toString(s));
    }

    public static void reverseSentence(String str)
    {
        String[] words= str.split(" ");
        String rev="";
        for (String st:words)
        {
            rev=st+" "+rev;
        }
        System.out.println(rev+"=======");

    }

    public static void reverseCharSentence(String str)
    {
        char[] strArr=str.toCharArray();
        String rev="";
        for (char c:strArr)
        {
            rev=c+rev;
        }
        System.out.println(rev);
    }

    public static String spaceRemove(String str)
    {
        StringBuilder sb=new StringBuilder();
        for (char ch : str.toCharArray())
        {
            if ( ch!= ' ')
            {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static String spaceRemoveFor(String str)
    {
        StringBuilder sb=new StringBuilder();
        for (int i=0; i<str.length(); i++)
        {
            if (str.charAt(i)!=' ')
            {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String[] removeSpaceSplit(String str)
    {
        String[] s=str.split(" ");
        return s;
    }
}
