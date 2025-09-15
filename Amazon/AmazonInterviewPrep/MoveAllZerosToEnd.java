package Amazon.AmazonInterviewPrep;

import java.util.Arrays;

public class MoveAllZerosToEnd {


  public static int[] moveZerosToEnd(int[] nums){

    int position = 0;

    for(int i=0; i<nums.length; i++){
      if(nums[i] != 0){
        int temp = nums[i];
        nums[i] = nums[position];
        nums[position] = temp;
        position++;
      }
    }
    return nums;
  }


  public static void main(String[] args) {
    int[] nums = {1, 0, 2, 0, 3, 0};

    MoveAllZerosToEnd move = new MoveAllZerosToEnd();
    move.moveZerosToEnd(nums);
    System.out.println(Arrays.toString(nums));
  }

}
