package Collections.Map;

import java.util.Hashtable;

public class HashTable {

  public static void main(String[] args) {
      Hashtable<Integer, String> table = new Hashtable<>();
      table.put(1, "Java");
      table.put(2, "python");
      table.put(3, "C#");

      System.out.println(table.get(3));

  }

}


/*
 * 
 * Hashtable is the legacy version of HashMap.
It is synchronized, meaning it is thread-safe — but slower.

🧩 Key Points:

Does not allow null keys or values.

Synchronized, so one thread can access at a time.

Mostly replaced by ConcurrentHashMap in modern Java.

“Earlier, Hashtable was used for thread safety. But it locks the entire table for every operation, which reduces performance.
In modern frameworks, I prefer ConcurrentHashMap for concurrent data access.”
 * 
 * 
 */