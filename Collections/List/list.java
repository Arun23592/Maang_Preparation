import java.util.ArrayList;
import java.util.List;

public class list {

    public static void main(String[] args) {
        List<String> li = new ArrayList<>();

        li.add("Java");
        li.add("Python");
        li.add("C#");
        li.add("JavaScript");

        System.out.println("Elements of the Lists are: ");

        //iterating through list
        for(String s : li){
            System.out.println(s);
        }


        for(int i =0; i<li.size(); i++){
            System.out.println(li.get(i));
        }

        //updating elements
        li.set(1, "DSA");
        System.out.println("Updated list"+ li);

        //removing elements
        li.remove(3);
        System.out.println("removed "+ li);

        
    }

}


/*
 * List is an ordered sequence
 * List allows duplicate elements
 * Elements by their position can be accessed.
 * Multiple null elements can be stored.
 * List implementations are ArrayList, LinkedList, Vector, Stack
 * 
 * 
 * 
 */