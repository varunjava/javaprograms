package Practise.collectionss;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;

public class Difference
{
    public static void main(String[] args)
    {
        ArrayList al = new ArrayList() ;
        al.add(40) ;
        al.add(10) ;
        al.add(30) ;
        al.add(20) ;
        al.add(40) ;
        al.add( 1, 888) ;
        for( int i =al.size()-1 ; i >= 0 ; i--)
        {
            System.out.println( al.get(i) );
        }
        HashSet hs = new HashSet() ;
        hs.add(40) ;
        hs.add(10) ;
        hs.add(30) ;
        hs.add(20) ;
        hs.add(40) ;
        System.out.println( "HS : "+ hs);
        for( Object num : hs)
        {
            System.out.println( num);
        }



    }
}
