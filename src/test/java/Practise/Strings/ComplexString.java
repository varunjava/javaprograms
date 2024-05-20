package Practise.Strings;

public class ComplexString {

    public static void main(String[] args) {

        String str="A2B3C1";
        int index;
        for (int i=0; i<str.length(); i++){
            if (i%2==0)
            {
                index= str.charAt(i+1)-48;
                product(str.charAt(i),index);
            }
        }
    }

    public static void product(char ch,int index)
    {
        while (index>0) {
            System.out.print(ch);
            index--;
        }
    }
}
