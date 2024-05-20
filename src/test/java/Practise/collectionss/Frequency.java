package Practise.collectionss;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class Frequency
{
    public static void main(String[] args)
    {
        String str = "AAAABBBBBBCCCCCCCCC" ;

        LinkedHashMap<Character, Integer> fq = new LinkedHashMap<>();

        for( char num : str.toCharArray())
        {
            if( fq.containsKey(num) ){
                fq.put( num,  1 + fq.get(num));
            }
            else {
                fq.put(num , 1) ;
            }
        }
        for(Map.Entry<Character,Integer> entry : fq.entrySet())
        {
            System.out.print( entry.getKey()+""+ entry.getValue());
        }
    }
}
