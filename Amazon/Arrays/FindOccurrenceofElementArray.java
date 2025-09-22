package Amazon.Arrays;

import java.util.*;

public class FindOccurrenceofElementArray {

  public static Map<Integer, Integer> elementOccurrence(int[] array){
    Map<Integer, Integer> countMap = new HashMap<>();

    for(int element: array){
      if(countMap.containsKey(element)){
        countMap.put(element, countMap.get(element) + 1);
      }else{
        countMap.put(element, 1);
      }
    }

    return countMap;
  }


  public static void main(String[] args) {
    int[] nums = {1, 1, 2, 2, 2, 6, 5, 5, 5};

    Map<Integer, Integer> elementCount = elementOccurrence(nums);
    
    for(Map.Entry<Integer, Integer> eleEntry : elementCount.entrySet()){
      System.out.println(eleEntry.getKey() + "--> " + eleEntry.getValue());
    }
  }

}


/*
 * Approach: The given code finds the occurrences of each element in an array and returns a map where the keys are the elements from the array, and the values are the counts of those elements.
 * Time complexity: O(n) -> The code iterates through the array once, where n is the number of elements in the array.
 * Space complexity: O(n) -> In the worst case, all elements in the array are unique, so the map will store n elements.
 * 
 * Explanation:
 * 1. HashMap is created to store the occurrence of each element in the array.
 * 2. Iterate through each element of the array.
 * 3. If the element is already present in the map, increment its count by 1.
 * 4. If the element is not present in the map, add it with a count of 1.
 * 5. Return the countMap
 * 6. In main method,  Map entries are printed, diplaying each element and its occurrence count.
 * 
 * 
 * Edge Cases: Test with arrays containing only one element, all elements the same, and all unique elements to ensure robustness.
 * 
 * Interview Questions:
 * 1. What is the time complexity of your solution?
 * Answer: The time complexity is O(n) because we are iterating through the array once.
 * 2. What is the space complexity of your solution?
 * Answer: The space complexity is O(n) in the worst case where all elements are unique.
 * 3. How would you optimize the solution if the array is very large?
 * Answer: For very large arrays, we can use techniques such as streaming the data to process it in chunks if memory is a concern.
 * 4. Can you explain the code in simple terms?
 * Answer: The code counts the occurrences of each element in the array and returns a map with the elements as keys
 *  and their counts as values. 
 * 5. How does the HashMap ensure that the put operation is efficient?
 * Answer: The HashMap uses a hash function to map keys to indices of a backing array, allowing for
 *  efficient lookups and insertions.
 * 6. What if the array contains null elements?
 * Answer: The code will handle null elements correctly, treating them as distinct from other null elements.
 * 7. Can you explain the use of the entrySet() method?
 * Answer: The entrySet() method returns a Set view of the mappings contained in this map. It allows us
 *  to iterate over the map entries and access the key-value pairs.
 * 8. How does the code handle duplicate elements?
 * Answer: The code correctly handles duplicate elements by incrementing the count for each occurrence.
 * 9. Can you explain the use of the get() method?
 * Answer: The get() method returns the value for the given key if it exists in the map, otherwise it
 *  returns null.
 * 10. How does the code handle empty arrays?
 * Answer: The code will return an empty map for an empty array.
 * 11. Can you explain the use of the put() method?
 * Answer: The put() method adds a new key-value pair to the map or updates the value for an existing
 * key.
 * 12. How does the code handle arrays with a large number of unique elements?
 * Answer: The code will store all unique elements in the map, resulting in a map with a size equal to
 *  the number of unique elements.
 * 13. What edge cases did you consider while writing this code?
 * Answer: Edge cases include empty arrays, arrays with all elements the same, arrays with all unique elements, and arrays with null or negative values.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */