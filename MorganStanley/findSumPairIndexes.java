package MorganStanley;

import java.util.HashMap;
import java.util.Map;

public class findSumPairIndexes {

    public static int pairSumFinder(int arr, int targetSum){
        if (arr == null || arr.length < 2) {
            System.out.println("Array is so small or null to find pairs");
            return;
        }

        Map<Integer, Integer> numMap = new HashMap<>();
        
        for(int i=0; i<arr.length; i++){
            int currentNum = arr[i];
            int complement = targetSum - currentNum;


            if(numMap.containsKey(complement)){
                System.out.println("Found pair: (Indexes " + numMap.get(complement) + " and " + i + ") because " + complement + " + " + currentNum + " = " + targetSum);
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int targetSum = 10;

        pairSumFinder(arr, targetSum);
        System.out.println("--------");
    }


}
