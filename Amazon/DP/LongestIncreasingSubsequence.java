package Maang_Preparation.Amazon.DP;

public class LongestIncreasingSubsequence {

    public int lengthOfLIS(int[] nums){
        
        //create a memorization or initialize int array
        int[] T = new int[nums.length];

        //start main pointer
        for(int i=1; i<nums.length; i++)

            //start second pointer

            for(int j=0; j<i; j++)
                if (nums[i] > nums[j]) 
                    if (T[j]+1 > T[i] ) 
                        T[i] = T[j] + 1;
                    
            int maxIndex = 0;
            for(int i=0; i<T.length; i++)
                if(T[i] > T[maxIndex])
                    maxIndex = i;

            return T[maxIndex]+1;


        

    }


    public static void main(String[] args) {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
        System.out.println(lis.lengthOfLIS(nums));
        
    }

}
