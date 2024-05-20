package Practise.collectionss;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class PrintReadArrayList
{
      public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        HashSet<Integer> numbers = new HashSet<>();
        boolean repeat =true ;
        while(repeat)
        {
            System.out.println("Select Option");
            System.out.println("=============");
            System.out.println("1.add NUmber");
            System.out.println("2.remove NUmber");
            System.out.println("3.display NUmbers");
            System.out.println("4.Exit");
            int chioce = sc.nextInt() ;
            switch (chioce)
            {
                case 1 :
                    System.out.println("Enter number ");
                    int num = sc.nextInt() ;
                    numbers.add(num) ;
                    System.out.println( num + " is added");
                    break;
                case 2:
                    System.out.println("Enter number to be removed ");
                     num = sc.nextInt() ;
                    numbers.remove((Object)num);
                    System.out.println( num + " is removed"); break;
                case  3 :
                    System.out.println(numbers); break;
                case 4: repeat = false ;
                default:
                    System.out.println("Invalid input");
            }
        }

    }

}
