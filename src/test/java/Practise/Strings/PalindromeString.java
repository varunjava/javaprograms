package Practise.Strings;

public class PalindromeString
{
    public static void main(String[] args)
    {
        String str="Malayalam";
        if (isPalindrome(str))
        {
            System.out.println(str+" is palindrome");
        }
        else
            System.out.println(str+" is not palindrome");
    }

    public static boolean isPalindrome(String str)
    {
        String s=str.toLowerCase();
        for (int i=0, j=s.length()-1; i<j; i++,j--)
        {
            if (s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
        }
        return true;
    }
}
