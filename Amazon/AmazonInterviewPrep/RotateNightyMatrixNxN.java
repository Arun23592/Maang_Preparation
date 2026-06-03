package Amazon.AmazonInterviewPrep;

import java.util.Arrays;

public class RotateNightyMatrixNxN {


  public static void rotateNineghtyMatrix(int[][] matrix){

    int n = matrix.length;
    //1. Transpose and swap matrix - row and columns
    for(int i = 0; i< n; i++){
      for(int j=i; j<n; j++){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }
    }

    //2. reverse each row
    for(int i=0; i<n; i++){
      for(int j=0; j<n/2; j++){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[i][n - j - 1];
        matrix[i][n - j - 1] = temp;
      }
    }

  }

  public static void main(String[] args) {
      int[][] matrix = {{1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                      };

    rotateNineghtyMatrix(matrix);

    for(int[] row: matrix){
        System.out.println(Arrays.toString(row));
    }
                      
                      
  }

  



}


/*
 * 
 * 
 * 
 * ✅ Problem

Rotate a given N x N matrix by 90 degrees clockwise in place (without extra space).

Example:
✅ Problem

Rotate a given N x N matrix by 90 degrees clockwise in place (without extra space).

Example:

Input:
1  2  3
4  5  6
7  8  9

Output:
7  4  1
8  5  2
9  6  3


✅ Approach (Optimal: Transpose + Reverse)


The trick is:

Transpose the matrix → Convert rows to columns.

1  2  3       1  4  7
4  5  6  →    2  5  8
7  8  9       3  6  9

Reverse each row → Gives the 90° clockwise rotated matrix.


1  4  7       7  4  1
2  5  8  →    8  5  2
3  6  9       9  6  3



✅ Explanation with Comments

Transpose = Flip across diagonal (matrix[i][j] ↔ matrix[j][i]).

Reverse rows = Swap first and last element of each row.

This combination = 90° clockwise rotation.


📊 Complexity

Time Complexity: O(N^2) → Every element is visited once for transpose + once for reverse.

Space Complexity: O(1) → In-place (no extra matrix needed).

⚠️ Edge Cases

N = 1 → Single element (no change).

Empty matrix → Return as is.

Large matrix (e.g., 1000x1000) → Works fine in O(N²).

💡 Interview Follow-ups

Can you rotate anti-clockwise?

Transpose, then reverse each column instead of row.

Can you do it with extra space (simpler)?

Create a new matrix and set res[j][n-i-1] = matrix[i][j].

Time: O(N²), Space: O(N²). (Not optimal but easier to implement).
 */