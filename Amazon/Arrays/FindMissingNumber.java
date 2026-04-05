package Amazon.Arrays;

public class FindMissingNumber {

  public static void main(String[] args) {
    int[] nums = {9,6,4,2,3,5,7,0,1};

    int n = nums.length;

    int expectedSum = n * (n + 1) / 2;

    int actualSum = 0;


    for(int num: nums){
      actualSum += num;
    }

    int totalSum = expectedSum - actualSum;

    System.out.println(totalSum);
  }
}


/***
 * 
 * Approach implemented: Sum-based approach
 * 
 * Complexity:
    Time: O(n)
    Space: O(1)

    Explanation:
    I used the sum formula for numbers from 0 to n. First I calculated the expected sum, then I subtracted the actual array sum. The difference gives the missing number.”
 */