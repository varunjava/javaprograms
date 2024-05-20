package Practise.Strings;

public class RemoveExtraSpace130
{
    public static void main(String[] args)
    {
        removeSpace("Dinga Dingi");
        removeMoreSpace("Dinga    Dingi   test");
    }

    public static void removeSpace(String str)
    {
        StringBuilder sb=new StringBuilder();
        char[] ch=str.toCharArray();
        for (int i=0; i<ch.length; i++)
        {
            if (ch[i]!=' ')
            {
                sb.append(ch[i]);
            }
        }
        System.out.println(sb.toString());
    }

    public static void removeMoreSpace(String str)
    {
        StringBuilder sb=new StringBuilder();
        char[] ch=str.toCharArray();
        boolean spaceNotAdded = true;
        for (int i=0; i<ch.length; i++)
        {
            if (ch[i]!=' ')
            {
                sb.append(ch[i]);
                spaceNotAdded=true;
            }
            else if (spaceNotAdded)
            {
                sb.append(ch[i]);
                spaceNotAdded=false;
            }
        }
        System.out.println(sb.toString());
    }
}
