package Java;
//
//public class OrderOfOccurance {
//
//    public static void occurance(String str)
//    {
//        char[] ch=str.toCharArray();
//        boolean[] b=new boolean[ch.length];
//        for (int i=0; i< ch.length; i++)
//        {
//            int count=0;
//            if (!b[i])
//            {
//                for (int j = 0; j < ch.length; j++) {
//                    if (ch[i] == ch[j])
//                    {
//                        count++;
//                        b[j]=true;
//                    }
//                }
//                System.out.println(ch[i]+"="+count);
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        String s="aaabbcddddefff!";
//        occurance(s);
//    }
//
//
//
//}
//


import java.util.HashMap;
import java.util.LinkedHashMap;

class OrderOfOccurance {

    public static void main(String[] args) {
        String inputString = "Hello, World!";
        LinkedHashMap<Character, Integer> charOccurrences = new LinkedHashMap<>();

        // Remove spaces and punctuation marks
        inputString = inputString.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Iterate through the string and count occurrences of each character
        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            if (charOccurrences.containsKey(currentChar)) {
                // Increment the occurrence count for the character
                charOccurrences.put(currentChar, charOccurrences.get(currentChar) + 1);
            } else {
                // Add the character to the map with occurrence count as 1
                charOccurrences.put(currentChar, 1);
            }
        }

        // Display the order of occurrence for each character
        System.out.println("Order of occurrence for every character:");
        for (char key : charOccurrences.keySet()) {
            System.out.println("'" + key + "': " + charOccurrences.get(key));
        }
    }
}
