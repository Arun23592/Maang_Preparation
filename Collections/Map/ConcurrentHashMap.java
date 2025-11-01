package Collections.Map;



public class ConcurrentHashMap {

  public static void main(String[] args) {
    java.util.concurrent.ConcurrentHashMap<Integer, String> concurr = new java.util.concurrent.ConcurrentHashMap<>();

    concurr.put(1, "Test1");
    concurr.put(2, "Test2");

    System.out.println(concurr);
  }

}


/*
 * 
 * 
 * A modern, thread-safe version of HashMap.
Introduced to handle multi-threaded access efficiently.

🧩 Key Points:

Allows concurrent reads and partial writes (no full map locking).

No null keys or values (like Hashtable).

Used heavily in parallel test executions or shared data scenarios.

In my automation framework, when running parallel tests in TestNG,
I use ConcurrentHashMap to store session data (like driver instances or tokens)
to avoid ConcurrentModificationException.
It ensures thread safety without major performance degradation.”
 */