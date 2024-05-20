package Practise.Strings;

import java.util.Scanner;

public class StringPrograms
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The String");
        String str=sc.next();
//        countUpperLowerDigitsSpChar(str);
//        System.out.println("=======");
//        sumDigitsInString(str);
//        System.out.println("======");
//        if (isPalindrome(str)==true)
//        {
//            System.out.println(str+" is a palindrome");
//        }else
//            System.out.println(str+" is not palindrome");
//        toUpperCase(str);
//        toLowerCase(str);
//        lastUpper(str);
//        vowelsUpperRemainingLower(str);
//        swapFirstLastChar(str);
//        verifyLastChar(str,'c');
//        frequencyOfString(str);
//        vowelsConsonant(str);
//        subString(str,1,4);
//        replaceChar(str,'e', 'o');
//        contains(str,"est");
        replaceString(str, "est", "oct");
//        countChar(str);
//        frequencyOfStringInFormat(str);
    }


    public static void countUpperLowerDigitsSpChar(String str)
    {
        int upperCase=0;
        int lowerCase=0;
        int digits=0;
        int spChar=0;
        char[] ch=str.toCharArray();
        for (int i=0; i<str.length(); i++)
        {
            if (ch[i]>='A' && ch[i]<= 'Z')
            {
                upperCase++;
            } else if (ch[i]>='a' && ch[i]<= 'z')
            {
                lowerCase++;
            } else if (ch[i]>='0' && ch[i]<= '9')
            {
                digits++;
            } else
            {
                spChar++;
            }
        }
        System.out.println("In Given String we have"+upperCase+" upper case, "+lowerCase+" lower case, "+digits+" digits and "+spChar+" special characters are present");
    }

    public static void sumDigitsInString(String str)
    {
        int sum=0;
        for (int i=0; i<str.length(); i++)
        {
//            if (str.charAt(i)>='0' && str.charAt(i)<='9')
            if (Character.isDigit(str.charAt(i)))
            {
                sum+=(str.charAt(i)-48);
            }
        }
        System.out.println(sum+" is the sum of digits in String");
    }

    public static boolean isPalindrome(String str)
    {
        for (int i=0, j=str.length()-1; i<j; i++,j--)
        {
            if (str.charAt(i)!=str.charAt(j))
            {
                return false;
            }
        }
        return true;
    }

    public static void toUpperCase(String str)
    {
        char[] ch=str.toCharArray();
        for (int i=0; i<ch.length; i++)
        {
            if (ch[i]>='a' && ch[i]<='z')
            {
                ch[i]= (char) (ch[i]-32);
            }
        }
        System.out.println(ch);
//        String upperCase = "";
//        for (char ch: str.toCharArray())
//        {
//            if (ch>='a' && ch<='z')
//            {
//                upperCase= upperCase+((char)(ch-32));
//            }
//            else upperCase= upperCase+ch;
//
//        }
//        System.out.println(upperCase);
    }

    public static void toLowerCase(String str)
    {
        char[] ch=str.toCharArray();
        for (int i=0; i<ch.length; i++)
        {
            if (ch[i]>='A' && ch[i]<='Z')
            {
                ch[i]= (char) (ch[i]+32);
            }
        }
        System.out.println(ch);
    }

    public static void lastUpper(String str)
    {
        char[] ch=str.toCharArray();
        for (int i=0; i<ch.length; i++)
        {
            if (i==ch.length-1 && ch[i] >= 'a' && ch[i] <= 'z')
            {
                ch[i]= (char) (ch[i]-32);
            }
            else if(ch[i]>='A' && ch[i]<='Z')
            {
                ch[i]= (char) (ch[i]+32);
            }
        }
        str=String.valueOf(ch);
        System.out.println(str);
    }

    public static void vowelsUpperRemainingLower(String str)
    {
        char[] ch=str.toCharArray();
        for (int i=0; i<ch.length; i++)
        {
            switch (ch[i])
            {
                case 'a', 'e', 'i', 'o', 'u' : ch[i]= (char) (ch[i]-32); break;
                case 'A', 'E', 'I', 'O', 'U' : break;

                default:
                    if (Character.isUpperCase(ch[i]) )
                    {
                        ch[i]= (char) (ch[i]+32);
                    }
            }
        }
        System.out.println(String.valueOf(ch));
    }

    public static void swapFirstLastChar(String str)
    {
        char[] ch=str.toCharArray();
        char temp=ch[0];
        ch[0]=ch[ch.length-1];
        ch[ch.length-1]=temp;
        System.out.println(String.valueOf(ch));
    }

    public static void verifyLastChar(String str,char c)
    {
        if (str.charAt(str.length()-1)==c)
        {
            System.out.println(str+" is ending with given char "+c);
        }
        else
            System.out.println(str+" is not ending with given char "+c);
    }

    public static void frequencyOfString(String s)
    {
        char[] ch=s.toCharArray();
        boolean[] visited=new boolean[ch.length];

        for (int i=0; i<ch.length; i++)
        {
            if (visited[i]==false)
            {
                int count=1;
                for (int j=i+1; j<ch.length; j++)
                {
                    if (ch[i]==ch[j])
                    {
                        count++;
                        visited[j]=true;
                    }
                }
                System.out.println(ch[i]+" is repeated "+count+" times");
            }
        }
    }

    public static void vowelsConsonant(String s)
    {
        int vowels=0;
        int consonants=0;
        for (char ch:s.toCharArray())
        {
            if ((ch>='A' && ch<='Z') || (ch>='a' && ch<= 'z'))
            {
                switch (ch)
                {
                    case 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u':
                        vowels++;
                        break;
                    default:
                        consonants++;
                }
            }
        }
        System.out.println(vowels+" vowels and "+consonants+" consonants");
    }

    public static void subString(String s,int startIndex, int endIndex)
    {
        StringBuilder sb=new StringBuilder();
        if (s==null || startIndex<0 || endIndex>s.length() || startIndex>=endIndex)
        {
            System.out.println("inValid Input or index or argument");
            return;
        }
        for (int i=startIndex; i<endIndex; i++)
        {
            sb.append(s.charAt(i));
        }
        s=sb.toString();
        System.out.println(s);
    }

    public static void contains(String text,String pat)
    {
        char[] ch=text.toCharArray();
       outer: for (int i=0; i<ch.length; i++)
        {
            int k=i;
            int j = 0;
            while (j<pat.length() && k<ch.length && ch[k]==pat.charAt(j))
            {
                j++;
                k++;
            }
//           inner: for (; j<pat.length() && k<ch.length ; j++,k++)
//            {
//                if (ch[k]!=pat.charAt(j))
//                {
//                    break inner;
//                }
//            }
            if (j==pat.length())
            {
                System.out.println(pat+" is at "+i+","+(k-1)+" is present in "+text); return;
            }
        }
        System.out.println(pat+" is not present");
    }


    public static void replaceChar(String str, char oldChar, char newChar)
    {
        char[] ch=str.toCharArray();
        for (int i=0; i<ch.length; i++)
        {
            if (ch[i]==oldChar)
            {
                ch[i]=newChar;
            }
        }
        String newStr=String.valueOf(ch);
        System.out.println(newStr);
    }

    public static void replaceString(String str, String oldChar, String newChar)
    {
        StringBuilder sb=new StringBuilder();
        for (int i=0; i<str.length(); i++)
        {
            int k=i;
            int j = 0;
            while (j<oldChar.length() && k<str.length() && str.charAt(k)==oldChar.charAt(j))
            {
                j++;
                k++;
            }
            if (j==oldChar.length())
            {
                for (int m=0; m<str.length(); m++ )
                {
                    if (m==i)
                    {
                        sb.append(newChar);
                    }
                    else if (m<i || m>k)
                    {
                        sb.append(str.charAt(m));
                    }
                }
                System.out.println(sb.toString()); return;
            }
        }
    }

    public static void countChar(String str)
    {
        StringBuilder sb=new StringBuilder();
        char[] ch=str.toCharArray();
        for (int i=0; i<ch.length; i++)
        {
            int count=0;
           for (int j=0; j< ch.length; j++)
           {
               if (ch[i]==ch[j])
               {
                   count++;
               }
           }
            sb.append(ch[i]+""+count);
        }
    }

    public static void frequencyOfStringInFormat(String s)
    {
        char[] ch=s.toCharArray();
        boolean[] visited=new boolean[ch.length];

        for (int i=0; i<ch.length; i++)
        {
            if (visited[i]==false)
            {
                int count=1;
                for (int j=i+1; j<ch.length; j++)
                {
                    if (ch[i]==ch[j])
                    {
                        count++;
                        visited[j]=true;
                    }
                }
                System.out.print(String.valueOf(ch[i])+count);
            }
        }
    }
}











