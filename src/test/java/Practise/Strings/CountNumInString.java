package Practise.Strings;

public class CountNumInString {

    public static void main(String[] args) {

        String str="ABC123";
        countNum(str);


    }

    public static void countNum(String s)
    {
        char[] ch1=new char[s.length()];
        char[] ch=s.toCharArray();
        int count=0;
        for (int i=0; i<ch.length; i++)
        {
//            if (ch[i] >= '0' && ch[i]<='9')
//            {
////                System.out.println(ch[i]);
//                count+=ch[i]-48;
//            }
            if (ch[i] >= 'A' && ch[i]<='Z')
            {
                ch1[i]=ch[i];
            }
            else
            {
                count+=ch[i]-48;
                char c= (char) ((char)count+48);
            }
        }
        System.out.println(count);

//        StringBuilder sb=new StringBuilder();
//
//        for (int i=0; i<s.length(); i++)
//        {
////            System.out.println(Character.isDigit(s.charAt(i)));
//            if (Character.isDigit(s.charAt(i)))
//            {
//                count+=s.charAt(i)-48;
//            }
//        }
//        System.out.println(count);
    }

}
