import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q2_MinStoragecost {

  public static int minStorageCost(int N, int encCost, int faltcost, List<Integer> sensitiveFiles){

        final long MOD = 1000000007L;


        //Total number of files = 2 ^ N
        int totalFiles = (int) Math.pow(2, N);

        //Store sensitive files in HashSet for quick lookup
        Set<Integer>  sensitiveSet = new HashSet<>(sensitiveFiles);

        //prefix sum array
        long[] prefix = new long[totalFiles + 1];

        //Build prefix array
        for(int i=1; i<=totalFiles; i++){
          prefix[i] = prefix[i - 1] + (sensitiveSet.contains(i) ? 1 : 0);
        }

        return (int) (solve(1, totalFiles, encCost, faltcost, prefix) % MOD);
  }

  private static long solve(int left, int right, int encCost, int flatCost, long[] prefix){

      //count sensitive files in current range
      long sensitiveCount = prefix[right] - prefix[left - 1];

      //size of your current range
      int size = right - left + 1;

      //if there are no sensitive file, use faltcost
      if(sensitiveCount == 0){
        return flatCost;
      }

      //cost without splitting
      long constwithoutSplit = (long) size * sensitiveCount * encCost;

      //if only one file exists, return direct cost
      if(left == right){
        return constwithoutSplit;
      }

      //spit into two halves
      int mid = (left + right) /2;

      long leftCost = solve(left, mid, encCost, flatCost, prefix);
      long rightCost = solve(mid + 1, right, encCost, flatCost, prefix);

      return Math.min(constwithoutSplit, leftCost + rightCost);



  }

  public static void main(String[] args) {
    System.out.println(minStorageCost(2, 2, 1, Arrays.asList(1, 3)));
    // Expected: 6
    System.out.println(minStorageCost(3, 2, 1, Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8)));
        // Expected: 16

        System.out.println(minStorageCost(3, 2, 1, Arrays.asList(7, 1)));
        // Expected: 8

        System.out.println(minStorageCost(1, 10, 5, Arrays.asList(1)));
        // Expected: 10

        System.out.println(minStorageCost(1, 10, 5, Arrays.asList(2)));
        // Expected: 10

      
  }
}

/***\
 * 
 * ⸻

Problem 2: Minimum Storage Cost

Problem Statement (Beginner Friendly)

You have:
	•	2^N files
	•	Some files are sensitive
	•	You want to calculate the minimum storage cost

There are two storage options:
	1.	Flat Cost
	•	Store an entire range of files with a fixed cost
	2.	Encrypted Cost
	•	Cost depends on:

range size × number of sensitive files × encryption cost



You can split a range into two smaller halves if it becomes cheaper.

Goal:
Find the minimum possible storage cost.

⸻

Example

N = 2
encCost = 2
flatCost = 1
sensitiveFiles = [1, 3]

Since:

2^2 = 4 files

Files are:

[1, 2, 3, 4]

Sensitive files:

1 and 3

We recursively split the range and compare:
	•	Store entire range together
	•	Or split into left half and right half

Final answer:

6


⸻

Approach Used

We use Divide and Conquer recursion.

For every range:
	1.	Count how many sensitive files are inside
	2.	Calculate direct storage cost
	3.	Split into two halves
	4.	Recursively solve left and right
	5.	Return the minimum cost

⸻

Why Prefix Sum is Used

We need to quickly count how many sensitive files are present in any range.

Instead of counting every time, we build a prefix array.

Example:

prefix[i] = number of sensitive files from 1 to i

Then:

Sensitive files in range [L, R]
= prefix[R] - prefix[L - 1]

This makes counting very fast.

⸻

Time Complexity

O(2^N)

Because each range is visited once.

Space Complexity

O(2^N)

For prefix array and recursion stack.

⸻

Code with Step-by-Step Comments

import java.util.*;

public class MinStorageCostPractice {

    public static int minStorageCost(int N, int encCost, int flatCost, List<Integer> sensitiveFiles) {

        final long MOD = 1000000007L;

        // Total number of files = 2^N
        int totalFiles = (int) Math.pow(2, N);

        // Store sensitive files in HashSet for quick lookup
        Set<Integer> sensitiveSet = new HashSet<>(sensitiveFiles);

        // Prefix sum array
        long[] prefix = new long[totalFiles + 1];

        // Build prefix array
        for (int i = 1; i <= totalFiles; i++) {
            prefix[i] = prefix[i - 1] + (sensitiveSet.contains(i) ? 1 : 0);
        }

        return (int) (solve(1, totalFiles, encCost, flatCost, prefix) % MOD);
    }

    private static long solve(int left, int right, int encCost, int flatCost, long[] prefix) {

        // Count sensitive files in current range
        long sensitiveCount = prefix[right] - prefix[left - 1];

        // Size of current range
        int size = right - left + 1;

        // If there are no sensitive files, use flat cost
        if (sensitiveCount == 0) {
            return flatCost;
        }

        // Cost without splitting
        long costWithoutSplit = (long) size * sensitiveCount * encCost;

        // If only one file exists, return direct cost
        if (left == right) {
            return costWithoutSplit;
        }

        // Split into two halves
        int mid = (left + right) / 2;

        long leftCost = solve(left, mid, encCost, flatCost, prefix);
        long rightCost = solve(mid + 1, right, encCost, flatCost, prefix);

        // Return minimum of:
        // 1. Direct cost
        // 2. Split cost
        return Math.min(costWithoutSplit, leftCost + rightCost);
    }
}
 * 
 */