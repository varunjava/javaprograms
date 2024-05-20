package Practise.collectionss;

import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;

public class ArrayListVsVector
{
    public static void main(String[] args)
    {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(20);
        al.add(10);
        al.add(30);
        System.out.println("ArrayList :"+ al );

        Vector<Integer> v = new Vector<>();
        v.add(20);
        v.add(10);
        v.add(30);
        System.out.println("Vector : "+ v);

        Stack<Integer> s = new Stack<>();
        s.add(20);
        s.add(10);
        s.add(30);
        System.out.println("Stack : "+ s);
//        Last in first out Order with stack functions help
//        pop() ==> remove
//        peek() ==> to see top element
        while( !s.empty())
        {
            System.out.println( s.pop());
        }
    }
}
