package Maang_Preparation.Walmart;

public class MatrixDiagonalSum {

    public static int diagonalSum(int[][] mat){
      int sum = 0;

      int n = mat.length;

      for(int i=0; i<n; i++){
        sum += mat[i][i];
        sum += mat[i][n - i - 1];
      }

      if (n % 2 != 0) {
        sum -= mat[n / 2][n / 2];
      }

      return sum;
    }


  public static void main(String[] args) {
    int[][] matrix = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
  };

  System.out.println("output: "+ diagonalSum(matrix));
  

  }

}


/*
 * Approach: We need to calculate the sum of the elements on both primary diagonal and secondary diagonal
 * of a square matrix. However, we need to ensure that if an element is part of both diagonals (i.e., it lies on the center of an odd-dimensioned matrix), it is only counted once.
 * 
 * Time complexity: O(n) -> Where n is the number of rows(or columns) in the matrix. This is because we only iterate
 * through the matrix once to compute the sum of the diagonals.
 * 
 * Space complexity: O(1) -> ince we are using a fixed amount of additional space for the sums and loop variables, regardless of the input matrix size.
 * 
 * Explanation:
 * 1. Initialize sum to 0.
 * 2. Iterate through the matrix. Use a single loop to iterate through each index i from 0 to n-1.
 * Add the element at the primary diagonal position matrix[i][i] to the sum
 * Add the element at the secondary diagonal position matrix[i][n - 1 - i] to the sum.
 * If the current index i is at the center of the matrix (when n is odd and i equals n//2), subtract the central element once to avoid double-counting.
 * 
 *3. Return sum.
 * Test case 1:
 * int[][] mat = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
// Expected Output: 25 (1 + 5 + 9 + 3 + 7)

 * Testcase 2:
 * int[][] mat = {
    {1, 1, 1, 1},
    {1, 1, 1, 1},
    {1, 1, 1, 1},
    {1, 1, 1, 1}
};
// Expected Output: 8 (1 + 1 + 1 + 1 + 1 + 1 + 1 + 1)
 * 
 * Testcase 3;
 * int[][] mat = {
    {5}
};
// Expected Output: 5 (5)
 * 
 * 
 * 
 * Edge case:
 * 1. Empty matrix:
 * int[][] mat = {};
// Expected Output: 0
 * 
 * 
 * 2. Single Element Matrix:
 * 
 * int[][] mat = {
    {5}
};
// Expected Output: 5
 * 
 * 3. Large Matrix:
 * 
 * 
 * 
 * 
 */