package InterviewQuestions;

public class PalindromeInString {

    public static void main(String[] args) {

        String  s="aba xyx xxyb";

//        palindromeInString(s);
        palindromeInStringStrBuilder(s);
    }

    public static void palindromeInString(String str)
    {
        String[] sArr=str.split(" ");

        for (int i=0; i<sArr.length; i++)
        {
            String rev="";
            char[] ch=sArr[i].toCharArray();
            for (int j=ch.length-1; j>=0; j--)
            {
                rev=rev+ch[j];
            }
            if (sArr[i].equals(rev))
            {
                System.out.println(sArr[i]+" is a palindrome substr in the given sentence");
            }
        }
    }

    public static void palindromeInStringStrBuilder(String str)
    {
        String[] sArr=str.split(" ");
        for (int i=0; i< sArr.length; i++)
        {
            String rev=new StringBuilder(sArr[i]).reverse().toString();
            if (sArr[i].equals(rev))
            {
                System.out.println(sArr[i]+" is a palindrome substr");
            }
        }
    }
}
