package Practise.collectionss;

import java.util.*;

public class SetStructure
{
    public static void main(String[] args)
    {
        hashSet();
        linkedHashSet();
        treeSet();

    }

    public static void hashSet()
    {
        HashSet<Integer> hs=new HashSet<>();
        hs.add(20);
        hs.add(50);
        hs.add(10);
        hs.add(10);
        System.out.println(hs);

        TreeSet<Integer> ts=new TreeSet<>(hs);
        System.out.println(ts);

        ArrayList<Integer> al=new ArrayList<>(hs);
        Collections.sort(al, Collections.reverseOrder());
        System.out.println(al+" sorted");

    }

    public static void linkedHashSet()
    {
        LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
        lhs.add(20);
        lhs.add(50);
        lhs.add(10);
        lhs.add(10);
        System.out.println(lhs);
    }

    public static void treeSet()
    {
        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(20);
        ts.add(50);
        ts.add(10);
        ts.add(10);
        System.out.println(ts);
    }
}
