package Practise.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CreateStorePrint
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter name");
        String name = s.nextLine();
        System.out.println("Entered name "+ name);

        String expectedName = "Dinga" ;

        if( name.equals(expectedName))
        {
            System.out.println( "Hi, "+ name + " Welcome to home Page");
        }
        else
        {
            System.out.println("Hi, "+ name + " you are invalid user plz register");
        }

    }
}
