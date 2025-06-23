package Amazon.TwoPointers;

public class MoveZerostoLeft {

  public static void moveZerosLeft(int[] nums){
    int left = 0;
    int right = nums.length -1 ;

    while (left < right) {
      if (nums[left] == 0) {
          left--;
      }else{
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
        left--;
        right++;
       }
    }
  }

  public static void main(String[] args) {
    int[] nums = {1, 0, 2, 0, 3, 0, 4, 0};
    moveZerosLeft(nums);
  }

}
