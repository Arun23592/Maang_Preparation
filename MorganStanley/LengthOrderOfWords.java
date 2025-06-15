package MorganStanley;

import java.util.Arrays;
import java.util.Comparator;

public class LengthOrderOfWords {
    public static void main(String[] args) {
        String str = "This is new";
        String[] words = str.split(" ");

        Arrays.sort(words, Comparator.comparingInt(String::length));
        String result = String.join("", words);
        System.out.println(result);
    }

}
