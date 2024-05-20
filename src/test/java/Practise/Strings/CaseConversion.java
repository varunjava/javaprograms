package Practise.Strings;

public class CaseConversion
{
    public static void main(String[] args)
    {
        System.out.println(caseConversion("TEST yantra"));

    }

    public static String caseConversion(String str)
    {
        char[] ch=str.toCharArray();
        for (int i=0; i< ch.length; i++)
        {
            if (ch[i]>='A' && ch[i]<='Z')
            {
                ch[i]= (char) (ch[i]+32);
            }
            else if (ch[i]>='a' && ch[i]<='z')
            {
                ch[i]= (char) (ch[i]-32);
            }
        }
        return String.valueOf(ch);
//        return ch;
    }
}
