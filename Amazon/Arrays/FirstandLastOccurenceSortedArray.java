package Maang_Preparation.Amazon.Arrays;

public class FirstandLastOccurenceSortedArray {

  public static int[] firstandFinal(int[] nums, int target){
    int[] result = {-1, -1};

    result[0] = findFirst(nums, target);
    result[1] = findLast(nums, target);

    return result;
   }


  private static int findFirst(int[] nums, int target){
    int left = 0, right = nums.length - 1;
    int fistOccurence = -1;

    while(left <= right){
      int mid = left + (right - left) / 2;

      if(nums[mid] == target){
          fistOccurence = mid;
          right = mid - 1;
      }else if (nums[mid] < target) {
        left = mid + 1;
        
      }else{
        right = mid - 1;
      }
    }
    return fistOccurence;

  }


  private static int findLast(int[] nums, int target){
    int left = 0, right = nums.length - 1;
    int lastOccurence = -1;

    while(left <= right){
      int mid = right + (left - right) / 2;
      
      if(nums[mid] == target){
        lastOccurence = mid;
        left = mid + 1;
      }else if (nums[mid] < target) {
        left = mid + 1;
      }else{
        right = mid - 1;
      }
    }
    return lastOccurence;
  }

  public static void main(String[] args) {
    int[] lists = {5, 7, 7, 8, 8, 10};
    int target = 8;

    int[] result = firstandFinal(lists, target);
    System.out.println("First occurence of"+ target + ": "+result[0]);
    System.out.println("Lirst occurence of"+ target + ": "+result[1]);

  }

}
