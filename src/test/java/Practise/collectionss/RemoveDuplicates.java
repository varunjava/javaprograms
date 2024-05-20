package Practise.collectionss;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicates
{
    public static void main(String[] args)
    {
        int[] nums = { 1, 2, 1, 3, 5, 4, 1, 2, 6,4 } ;

        String str = "Programmer" ;

        HashSet<Character> hs = new HashSet<>();
//        LinkedHashSet<Character> hs=new LinkedHashSet<>();

        for( char num : str.toCharArray())
        {
            hs.add(num) ;
        }

        StringBuilder sb = new StringBuilder() ;
        for( char ch : hs )
        {
            sb.append(ch) ;
        }
        System.out.println( sb.toString());

    }
}
