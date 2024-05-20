package Practise.Strings;

import org.openqa.selenium.WebDriver;

public class StringMethods
{
    public static void main(String[] args)
    {
        String str="Java Class";
        System.out.println( str.length()); //10
        System.out.println( str.charAt(2)); //v
        System.out.println( str.indexOf("v")); //2
        System.out.println(str.substring(1,4)); //ava
        System.out.println(str.substring(6)); //lass
        System.out.println(str.replace('a', 'o'));
        System.out.println(str.replaceAll("[JC]", "*")); //*ava *lass
        System.out.println(str.replaceAll("[A-Z]", "*"));
        System.out.println(str.replaceAll("[^A-Z ]", "*"));
        System.out.println(str.replaceAll("[A-Za-z0-9]", "*"));

        String[] words= str.split(" ");
        System.out.println( words.length);
        System.out.println( words[0]);

    }
}
