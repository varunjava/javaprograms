package Practise.Strings;

public class Regex
{
    public static void main(String[] args)
    {
        String s="05:02:52";
        System.out.println(s.matches("(0[1-9]|1[0-2]):([0-9][1-5]):([0-9][1-5])"));

        String ip="120.8.4.221";


        System.out.println(ip.matches("([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|(25)[0-9]|[1-9][0-9]|1[0-9][0-9])"));
        System.out.println(ip.matches("((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?).){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)"));

        String str3="inbox";
        System.out.println(str3.matches("inbox|inbox\\([1-9]+\\)"));

        String str4="Alphd13722323@gmail.com";
        System.out.println(str4.matches("[a-zA-z][a-zA-Z0-9._$]{3,13}@gmail.com"));
    }
}
