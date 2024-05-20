package Practise.Strings;

public class NonRepeatedNumber
{
    public static void main(String[] args)
    {
        String str="aabcdddeff";
        duplicateString(str);
        System.out.println("======");
        nonRepeated(str);
    }

    public static void duplicateString(String str)
    {
        char[] ch=str.toCharArray();
        boolean[] flag=new boolean[str.length()];
        for ( int i=0; i<ch.length; i++)
        {
            if (!flag[i])
            {
                int count = 0;
                for (int j = 0; j < ch.length; j++)
                {
                    if (ch[i] == ch[j])
                    {
                        count++;
                        flag[j]=true;
                    }
                }
                if (count > 1)
                {
                    System.out.println(ch[i] + " is repeated " + count + " times");
                }
            }
        }
    }

    public static void nonRepeated(String str)
    {
        char[] ch=str.toCharArray();
        boolean[] flag=new boolean[str.length()];
        for ( int i=0; i<ch.length; i++)
        {
            if (!flag[i])
            {
                int count = 0;
                for (int j = 0; j < ch.length; j++)
                {
                    if (ch[i] == ch[j])
                    {
                        count++;
                        flag[j]=true;
                    }
                }
                if (count == 1)
                {
                    System.out.println(ch[i] + " is non repeated ");
                }
            }
        }
    }
}
