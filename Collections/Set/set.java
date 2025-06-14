package Collections.Set;

import java.util.HashSet;
import java.util.Set;

public class set {

    public static void main(String[] args) {
        Set<String> sets = new HashSet<>();

        sets.add("Java");
        sets.add("Python");
        sets.add("Java");
        sets.add("C#");

        System.out.println(sets);
    }
}
