package Amazon.AmazonInterviewPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MagicTriplets_BF {

  public static List<List<Integer>> findMagicTriplets(int[] arr){
    //1. use Set --> HashSet to avoid duplicates
    Set<List<Integer>> result = new HashSet<>();
    //2. find the length of the array
    int n = arr.length;

    //3. pick fist element (i)
    for(int i=0; i<n-2; i++){
      //4. pick second element (j)
      for(int j=i+1; j<n-1; j++){
        //5. pick third element (k)
        for(int k=j+1; k<n; k++){
            //6. check if triple sums to zero
            if(arr[i] + arr[j] + arr[k] == 0){
                //Build a triplet list
                List<Integer> triplet = Arrays.asList(arr[i], arr[j], arr[k]);

                //sort the triplets 
                Collections.sort(triplet);

                //Add set to deduplicate
                result.add(triplet);
            }
        }
      }
    }

    //convert set to List for return
    return new ArrayList<>(result);
    
    


  
  }

  public static void main(String[] args) {
    int[] arr = {-1, 0, 1, 2, -1, -4};

    List<List<Integer>> triplets = findMagicTriplets(arr);

    System.out.println("magic triplets: (Sum = 0): ");

    for(List<Integer> triplet : triplets){
      System.out.println(triplet);
    }
  }

}


/*
 * 
 * 🔹 Brute Force Approach
✅ Idea:

Use 3 nested loops.

Check every possible triplet (i, j, k) such that:
arr[i]+arr[j]+arr[k]==0 

Store unique triplets.

Magic Triplets (sum = 0):
[-1, -1, 2]
[-1, 0, 1]


🔹 Time & Space Complexity

Time Complexity: O(n³) (three nested loops).

Space Complexity: O(m) where m is number of unique triplets found (to store results).

🔹 Optimized Approach (Two-pointer, already shown earlier)

Time Complexity: O(n²)

Space Complexity: O(m)


🔹 Interview Strategy

When asked:

Start with Brute Force → explain O(n³) and its limitation.

Then explain Optimized (Two Pointers) → reduce to O(n²).

Mention edge cases:

Empty array → no triplets.

Less than 3 elements → no triplets.

All positive or all negative numbers → no triplets.

Duplicates → need handling.
 * 
 * 
 */