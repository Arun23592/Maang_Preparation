package Amazon.TwoPointers;

public class MoveEvenOdd {

  public static void evenOddshift(int[] num){
    int left = 0;
    int right = num.length-1;

    while (left < right) {
      // Move left pointer until an odd number is found
      while (left < right && num[left] % 2 == 0) {
        left++;
      }
      // Move right pointer until an even number is found
      while (left < right && num[right] % 2 == 1) {
        right--;
      }
      
      
// Swap odd number on left with even number on right
      if(left < right){
        int temp = num[left];
        num[left] = num[right];
        num[right] = temp;

        left++;
        right--;
      }
    }
  }

  public static void main(String[] args) {
    int[] num = {1, 3, 2, 5, 7, 4, 6, 8};
    evenOddshift(num);

    for(int n : num){
      System.out.print(n+ " ");
    }

  }

}

/*
 * Approach: Two-Pointer Technique
Maintain two pointers:

left starting from 0

right starting from end of array

Move the left pointer until you find an odd number.

Move the right pointer until you find an even number.

Swap them.

Continue until left >= right.

  ✅ Complexity Analysis
Complexity	Result
Time Complexity	O(n) — We scan the array at most once.
Space Complexity	O(1) — In-place swaps, no additional array used.


⚡️Why This Is Efficient
Single pass through array

Works in place

Doesn’t disturb the relative order constraints (although order within the partition isn’t preserved)


🧠 Interview Tip
If asked, you can also mention:

Alternate approach: Use an auxiliary array (easier, but O(n) space).

Clarify constraints: Do we need to maintain relative order?

If required, we must use a stable partition approach, which may cost more space.

  
 * 
 * 
 */