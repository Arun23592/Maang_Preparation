package Maang_Preparation.Amazon.Arrays;

import java.util.Arrays;

class MoveAllZerosEnd {

  public void moveZeros(int[] n){
    
      int start = n.length -1; 
      int end = n.length-1;

      while (end >= 0) {
        if (n[end] == 0) {
            end--;
        }else{
          int temp = n[end];
          n[end] = n[start];
          n[start] = temp;
          end--;
          start--;
        }
        
      
    }

    

  }

  public static void main(String[] args) {
    int[] n = {1, 0, 2, 0, 3, 0, 4};
    MoveAllZerosEnd zeros = new MoveAllZerosEnd();
    zeros.moveZeros(n);
    System.out.println(Arrays.toString(n));

  }
}