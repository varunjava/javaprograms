package Practise.Strings;

public class ReverseString
{
    public static void main(String[] args)
    {
//        reverseString("Dinga");
//        System.out.println();
//        reverseStringArray("Dinga");
//        System.out.println();
//        reverseStringForEach("Dinga");
//        System.out.println();
//        reverseStringForEach("test");
//        System.out.println();
//        palindrome("madam");
//        System.out.println();
        palindromeWithoutObject("malayalam");

//        reverseByStringBuilder("Java");
//        reverseAndUpdate("java");



    }
    public static void reverseByStringBuilder(String str)
    {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println( sb );
    }

    public static void palindromeWithoutObject(String str)
    {
        for (int i=0, j=str.length()-1; i<j; i++,j--)
        {
            if (str.charAt(i)!=str.charAt(j) && str.charAt(i)!=str.charAt(j)-32 && str.charAt(i)-32!=str.charAt(j))
            {
                System.out.println(str+" is not a palindrome");
                return;
            }
        }
        System.out.println(str+" is palindrome");
    }

    public static void reverseString(String s)
    {
        String str=s;
        for (int i=str.length()-1; i>=0; i--)
        {
            System.out.print(str.charAt(i));
        }
    }

    public static void reverseStringArray(String s)
    {
        String str=s;
        char[] ch=str.toCharArray();
        for (int i=ch.length-1; i>=0; i--)
        {
            System.out.print(ch[i]);
        }
    }

    public static void reverseStringForEach(String s)
    {
        String str=s;
        char[] ch=str.toCharArray();
        String rev="";
        for (char c:ch)
        {
            rev=c+rev;
        }
        System.out.println(rev);
    }

    public static void palindrome(String s)
    {
        String str=s;

        String rev="";
        for (int i=str.length()-1; i>=0; i--)
        {
            rev=rev+str.charAt(i);
        }
        if (str.equals(rev))
        {
            System.out.println(str+" is palindrome");
        }
        else
            System.out.println(rev+" is not palindrome");
    }

    public static void reverseAndUpdate(String str)
    {
        String rev="";
        for (int i=str.length()-1; i>=0; i--)
        {
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);


    }


}
