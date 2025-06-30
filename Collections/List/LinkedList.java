
public class LinkedList {

    public static void main(String[] args) {
    

        java.util.LinkedList<String> fruits = new java.util.LinkedList<>();

        fruits.add("Apple");
        fruits.add("Blueberry");
        fruits.add("Goa");
        fruits.addFirst("Pomogranate");
        fruits.addLast("Orange");
        fruits.addLast("Mango");

        //Display list
        System.out.println("Fruits Lists: "+fruits);

        for(String fruit: fruits){
            System.out.println("- "+fruit);
            if (fruit == "apple") {
                fruits.remove();
            
            }
            
        }

    }

}
