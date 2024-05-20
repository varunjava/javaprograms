package Practise.Strings;

public class ReplaceIndex129
{
    public static void main(String[] args)
    {
        replace("Test",0,'H');

    }

    public static void replace(String str,int index,char ch)
    {
        char[] c=str.toCharArray();
        for (int i=0; i<c.length; i++)
        {
            if (i==index)
            {
                c[i]=ch;
            }
        }
        String s=String.valueOf(c);
        System.out.println(s);

    }
}
