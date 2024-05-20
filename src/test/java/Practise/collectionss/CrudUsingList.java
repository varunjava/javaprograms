package Practise.collectionss;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;
import java.util.function.DoubleToIntFunction;

public class CrudUsingList
{
    public static void main(String[] args)
    {
        arrayList();
        System.out.println("===============");
        linkedList();
        System.out.println("===============");
        vectorList();
        System.out.println("===============");
        stack();


    }

    public static void arrayList()
    {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(10);
        al.add(30);
        al.add(20);
        al.add(50);

//        Forward
        for (int i=0; i< al.size(); i++)
        {
            System.out.println(al.get(i));
        }
        System.out.println("===============");

//        Reverse
        for (int i=al.size()-1; i>=0; i--)
        {
            System.out.println(al.get(i));
        }

        ArrayList<Integer> al2=new ArrayList<>();
        al2.add(50);
        al2.add(10);
        al2.add(40);

        al.addAll(0,al2);
        System.out.println("al==="+al);

        boolean ele=al.containsAll(al2);
        System.out.println(ele);

        System.out.println(al.remove((Object)10));

        System.out.println(al);

        System.out.println(al.retainAll(al2));


    }

    public static void linkedList()
    {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(20);
        ll.add(10);
        ll.add(50);
        ll.add(40);

//        forward
        for (int i=0; i<ll.size(); i++)
        {
            System.out.println(ll.get(i));
        }

        System.out.println("===============");
//        reverse
        for (int i= ll.size()-1; i>=0; i--)
        {
            System.out.println(ll.get(i));
        }

        boolean searching=ll.contains(10);
        System.out.println(searching);

        System.out.println(ll.remove((Object)20));
    }

    public static void vectorList()
    {

        Vector<Integer> vl=new Vector<>();
        vl.add(20);
        vl.add(10);
        vl.add(50);
        vl.add(60);
        for (int i=0; i<vl.size(); i++)
        {
            System.out.println(vl.get(i));
        }

        System.out.println("===============");
//        reverse
        for (int i=vl.size()-1; i>=0; i--)
        {
            System.out.println(vl.get(i));
        }
    }

    public static void stack()
    {
        Stack<Integer> sl=new Stack<>();
        sl.add(20);
        sl.add(10);
        sl.add(50);
        sl.add(60);
        System.out.println("===============");
        while(!sl.empty())
        {
            System.out.println(sl.peek());
            System.out.println(sl.pop());
        }
    }
}
