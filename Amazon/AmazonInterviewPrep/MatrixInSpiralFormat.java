package Amazon.AmazonInterviewPrep;

import java.util.ArrayList;
import java.util.List;

public class MatrixInSpiralFormat {

  public static List<Integer> spiralMatrix(int[][] matrix){

    

    //1. create List
    List<Integer> result = new ArrayList<>();

    //edge case
    if(matrix == null || matrix.length == 0){
      return result;
    }

    //2. implement 4 pointers
    int left = 0;
    int right = matrix[0].length - 1;
    int top = 0;
    int bottom = matrix.length - 1;

    //3. Continue until boundries overlap

    while (top <= bottom && left <= right) {
      
      //on the top: left --> right
      for(int i=left; i<=right; i++){
        result.add(matrix[top][i]);
      }
      top++;

      //on the right: top --> bottom
      for(int i=top; i<=bottom; i++){
        result.add(matrix[i][right]);
      }

      right--;


      //on the bottom: right --> left
      if (top <= bottom) {
        for(int i=right; i>=left; i--){
          result.add(matrix[bottom][i]);
        }
        bottom--;
      }
      

      //on the left: bottom --> top
      if (left <= right) {
        for(int i=bottom; i>=top; i--){
          result.add(matrix[i][left]);
        }
      }
      left++;
      
    }
    return result;
    //4. return result
  }


  public static void main(String[] args) {
    int[][] matrix = {{1, 2, 3},
                      {4, 5, 6},
                      {7, 8, 9}};

        List<Integer> results = spiralMatrix(matrix);
        System.out.println("2X2 spiral matrix are: "+results);
  }

}







/*
 * 
 * 
 * 
 * Write code to print a 2×2 matrix in a spiral format.
 * 
 * Approach: Boundary Traversal using four pointers which is optimal.
 * 
 * ✅ Complexity

Time Complexity: O(M * N) → each element is visited once.

Space Complexity: O(1) (excluding output list).

✅ Edge Cases

Empty matrix → return [].

Single row (1 x N) → just traverse once.

Single column (M x 1) → just traverse once.

Square vs. rectangular matrices → works for both.

✅ Interview Follow-ups

Can you do it in-place without extra list? → Yes, print directly instead of storing.

Can you extend for NxN matrix? → Same code works.

Can you spiral print in reverse (anticlockwise)? → Just change the traversal order.

This 4-pointer approach is the optimal and most interview-friendly way (easy to explain on whiteboard).
 */