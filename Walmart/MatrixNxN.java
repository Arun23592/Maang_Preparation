package Maang_Preparation.Walmart;

import java.util.ArrayList;
import java.util.List;

public class MatrixNxN {

  public static List<Integer> spiralMatrix(int[][] matrix){

    List<Integer> result = new ArrayList<>();

    if(matrix == null || matrix.length == 0){
      return result;
    }

    //left -> right, top -> bottom, right->left, bottom -> top

    int left = 0;
    int right = matrix[0].length - 1;
    int top = 0;
    int bottom = matrix.length - 1;

    
    while (top <= bottom && left <= right) {
      //left - > right
      for(int i = left; i<=right; i++){
        result.add(matrix[top][i]);
      }

      top++;

      //top -> bottom

      for(int i = top; i<=bottom; i++){
        result.add(matrix[i][right]);
      }
      right--;

      //right->left

      if (top <= bottom) {
        for(int i = right; i>= left; i--){
          result.add(matrix[bottom][i]);
        }
        bottom--;
      }

      //bottom -> top
      if (left <= right) {
        for(int i = bottom; i>=top; i--){
          result.add(matrix[i][left]);
        }
        
        left++;
      }

      
      
    }

    return result;
  }

  public static void main(String[] args) {
    int[][] matrix = {{1, 2, 3},
                      {4, 5, 6},
                      {7, 8, 9}};

    
    List<Integer> result =  spiralMatrix(matrix);
    System.out.println(result);

  }

}
