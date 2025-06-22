package Nagarro;

import java.util.Map;


public class LinkedHashMap {

  

  public static void main(String[] args) {
    
   // Preserve order of test steps
   java.util.LinkedHashMap<String, String> map = new java.util.LinkedHashMap<>();

   // Add elements
   map.put("firstName", "John");
   map.put("lastName", "Doe");
   map.put("email", "john.doe@example.com");

   // Iterate and print
   System.out.println("LinkedHashMap maintains insertion order:");
   for (Map.Entry<String, String> entry : map.entrySet()) {
       System.out.println(entry.getKey() + " = " + entry.getValue());
   }

  }

}
