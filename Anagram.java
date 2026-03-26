
import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);

        System.out.print("Enter 1 String : ");
        String s1 = ab.next();

        System.out.print("Enter 2 String : ");
        String s2 = ab.next();

        if (isAnag(s1, s2))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }

    public static boolean isAnag(String s1, String s2) {

        s1 = s1.toLowerCase().replaceAll("\\s", "");
        s2 = s2.toLowerCase().replaceAll("\\s", "");

        if (s1.length() != s2.length())
            return false;

        int count[] = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }

        for (int c : count)
            if (c != 0)
                return false;

        return true;
    }
}
