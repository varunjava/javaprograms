package Practise.Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo
{
    public static void main(String[] args)
    {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("rcb",18);
        map.put("csk",7);
        map.put("kkr",5);
        System.out.println(map);
        System.out.println(map.size());
        map.put("lsg",7);
        System.out.println(map);
        System.out.println(map.size());
        map.put("kkr",7);
        System.out.println(map);
        System.out.println(map.size());
        map.remove("csk");
        map.remove("csk",5);
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get("kkr"));
        System.out.println(map.containsKey("lsg"));
        System.out.println(map.containsValue(5));

        Collection<Integer> values = map.values();
        System.out.println(values);

        Set<String> keys = map.keySet();
        System.out.println(keys);
        for(String k:keys)
        {
            System.out.println(k);
        }

        HashMap<String,Integer>map2=new HashMap<>();
        map2.putAll(map);
        System.out.println(map2);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for(Map.Entry<String,Integer> entry:entries)
        {
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
