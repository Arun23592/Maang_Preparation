package MorganStanley;

import java.util.HashMap;
import java.util.Map;

public class findSumPairIndexes {

    public static void pairSumFinder(int[] arr, int targetSum){
        if (arr == null || arr.length < 2) {
            System.out.println("Array is so small or null to find pairs");
            return;
        }

        Map<Integer, Integer> numMap = new HashMap<>();
        
        for(int i=0; i<arr.length; i++){
            int currentNum = arr[i];
            int complement = targetSum - currentNum;


            if(numMap.containsKey(complement)){
                int complementIndex = numMap.get(complement);
                System.out.println("Found pair: (Indexes " + complementIndex + " and " + i + ")");
            }

            numMap.put(currentNum, i);
        }
    }


    public static void main(String[] args) {
        int[] arr = {1, 3};
        int targetSum = 4;

        pairSumFinder(arr, targetSum);
        System.out.println("--------");
    }


}
