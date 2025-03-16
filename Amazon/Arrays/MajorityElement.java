package Maang_Preparation.Amazon.Arrays;

import java.util.HashMap;


public class MajorityElement {


    public int majorityElements(int[] nums){

        HashMap<Integer, Integer> countMap = new HashMap<>();

        int n = nums.length;

        for(int num : nums){
            countMap.put(num, countMap.getOrDefault(num, 0)+1);

            if (countMap.get(num) > n / 2) {
                return num;
            }
        }

        return -1;

    }


    public static void main(String[] args){

        
        int[] nums = {3, 2, 3, 2, 2};
        MajorityElement ele = new MajorityElement();
        int majority = ele.majorityElements(nums);
        System.out.println("Majority of the element is: "+majority);
        
    }

}
