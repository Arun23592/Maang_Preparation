package Collections.Map;
import java.util.HashMap;

public class Hashmap {

  public static void main(String[] args) {

    //create a Hashmap
    HashMap<Integer, String> map = new HashMap<>();

    //Add key-value pairs
    map.put(101, "Arun");
    map.put(102, "priya");
    map.put(104, "Kiran");

    //Access value by key
    System.out.println("Name with Id :"+ map.get(102));

    //Iterate through HashMap
    for(Integer key: map.keySet()){
      System.out.println("key " + key + ", Value: "+ map.get(key));
    }

    //Remove an entry
    map.remove(101);
    System.out.println("After removal: "+ map);
    
  }
  

  
  

}



/*
 * 
 * HashMap is a key-value pair data structure in Java.
It stores data based on hashing and does not maintain any order.

🧩 Key Points:

Allows one null key and multiple null values.

Not synchronized → not thread-safe (used in single-threaded environments).

Very fast for lookups and inserts (O(1) on average).

interview:

“I use HashMap frequently in automation to store dynamic test data, like mapping test case IDs to expected results.
It’s ideal for single-threaded test executions due to its speed and flexibility.”
 * 
 */