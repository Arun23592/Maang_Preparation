package Maang_Preparation.Amazon.Arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {


    public int majorityElements(int[] nums){

        Map<Integer, Integer> countMap = new HashMap<>();

        int n = nums.length;

        for(int num : nums){
            countMap.put(nums, countMap.getOrDefault(countMap, 0)+1);

            if (countMap.get(num) > n / 2) {
                return num;
            }
        }

        return -1;

    }


    public static void main(String[] args){

        
        int[] nums = {1, 2, 2, 3, 4};
        MajorityElement ele = new MajorityElement();
        int majority = ele.majorityElements(nums);
        System.out.println(majority);
        
    }

}
