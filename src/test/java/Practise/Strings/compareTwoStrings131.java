package Practise.Strings;

import java.util.Arrays;

public class compareTwoStrings131
{
    public static void main(String[] args)
    {
        compareString("MAdAM", "MADAM");
        anagram("the eyes", "they see");

    }

    public static void compareString(String str1,String str2)
    {
        if (str1.length()==str2.length())
        {
            str1=str1.toLowerCase();
            str2=str2.toLowerCase();
            for (int i=0; i<str1.length(); i++)
            {
                if (str1.charAt(i)!=str2.charAt(i))
                {
                    System.out.println(str1+" and "+str2+" both are not same");
                    return;
                }
            }
            System.out.println(str1+" and "+str2+" both are same");
        }
        else
            System.out.println(str1+" and "+str2+" both are not same");

    }

    public static void anagram(String str1, String str2)
    {

//         Remove space and covert into lower case
        str1=str1.replace(" ","").toLowerCase();
        str2=str2.replace(" ","").toLowerCase();

//        convert into chararray
        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();

//        sorting the array
        Arrays.sort(ch1);
        Arrays.sort(ch2);

//        converting array into string
        str1=String.valueOf(ch1);
        str2=String.valueOf(ch2);

        System.out.println(str1);
//        compare both Strings
        if (str1.equals(str2))
        {
            System.out.println(" Given Strings Are Anagram");
        }
        else
            System.out.println(" Given Strings Are Not Anagram");
    }
}
