import java.util.List;

public class ArrayList {

    public static void main(String[] args) {

        // Size of ArrayList
        int n = 5;

        // Declaring the List with initial size n
        List<Integer> arrli = new java.util.ArrayList<Integer>(n);

        // Appending the new elements
        // at the end of the list
        for(int i=1; i<=n; i++)
            arrli.add(i);

            // Printing elements
        System.out.println(arrli);

        // Remove element at index 2
        arrli.remove(2);
        System.out.println(arrli);

        // Printing elements one by one
        for(int i = 0; i < arrli.size(); i++){
            System.out.print(arrli.get(i) + "");
        }
    }

}



/*
 * 
 * 
 * An ArrayList class which is implemented in the collection framework provides us with dynamic arrays in Java. 
 * It may be slower than standard arrays but can be helpful in programs where lots of manipulation in the array is needed. 
 * Let's see how to create a list object using this class. 
 * The main advantage of ArrayList is that, unlike normal arrays, we don't need to mention the size when creating ArrayList. It automatically adjusts its capacity as elements are added or removed.
 * 
 * Underlying structure is Dynamic Array
 * O(1) - Fast random access
 * Memory is lower (contiguous memory)
 * Iteration speed is faster
 * Insertion and deletion is slower
 * 
 * 
 */