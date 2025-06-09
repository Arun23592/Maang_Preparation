package MorganStanley;

import java.util.Collections;
import java.util.PriorityQueue;

public class LexHighestString {

    public static String repeatLimitedString(String s, int repeatLimit){
        int[] freq = new int[26];

        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<26; i++){
            if(freq[i] > 0){
                maxHeap.add(i);
            }
        }

        StringBuilder result = new StringBuilder();

        while (!maxHeap.isEmpty()) {
            int curr = maxHeap.poll();
            int useCount = Math.min(freq[curr], repeatLimit);


            for(int i=0; i<useCount; i++){
                result.append((char) (curr + 'a'));
            }
            freq[curr] -= useCount;

            if (freq[curr] > 0) {
                if (maxHeap.isEmpty()) break;


                int next  = maxHeap.poll();
                result.append((char) (next + 'a'));
                freq[next]--;

                if (freq[next] > 0) maxHeap.add(next);
                maxHeap.add(curr);
            }
           
        }
        return result.toString();

    }

    public static void main(String[] args) {
        System.out.println(repeatLimitedString("bcaccc", 2));
    }

}
