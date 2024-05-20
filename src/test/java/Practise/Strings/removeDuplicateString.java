package Practise.Strings;

import org.testng.annotations.IFactoryAnnotation;

public class removeDuplicateString
{
    public static void main(String[] args)
    {
        removeDuplicate("abacad");

    }

    public static void removeDuplicate(String str)
    {
        StringBuilder sb=new StringBuilder();
        char[] ch=str.toCharArray();
        boolean[] visited=new boolean[ch.length];

        for (int i=0; i<ch.length; i++)
        {
            if (!visited[i])
            {
                for (int j = i + 1; j < ch.length; j++)
                {
                    if (ch[i] == ch[j])
                    {
                        visited[j] = true;
                    }
                }
                System.out.print(ch[i] );
//                sb.append(ch[i]);
            }
        }
    }
}
