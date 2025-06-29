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
