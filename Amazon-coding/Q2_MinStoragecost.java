import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q2_MinStoragecost {

  public static int minStorageCost(int N, int encCost, int faltcost, List<Integer> sensitiveFiles){

        final long MOD = 1000000007L;


        //Total number of files = 2 ^ N
        int totalFiles = (int) Math.pow(2, N);

        //Store sensitive files in HashSet for quick lookup
        Set<Integer>  sensitiveSet = new HashSet<>(sensitiveFiles);

        //prefix sum array
        long[] prefix = new long[totalFiles + 1];

        //Build prefix array
        for(int i=1; i<=totalFiles; i++){
          prefix[i] = prefix[i - 1] + (sensitiveSet.contains(i) ? 1 : 0);
        }

        return (int) (solve(1, totalFiles, encCost, faltcost, prefix) % MOD);
  }

  private static long solve(int left, int right, int encCost, int flatCost, long[] prefix){

      //count sensitive files in current range
      long sensitiveCount = prefix[right] - prefix[left - 1];

      //size of your current range
      int size = right - left + 1;

      //if there are no sensitive file, use faltcost
      if(sensitiveCount == 0){
        return flatCost;
      }

      //cost without splitting
      long constwithoutSplit = (long) size * sensitiveCount * encCost;

      //if only one file exists, return direct cost
      if(left == right){
        return constwithoutSplit;
      }

      //spit into two halves
      int mid = (left + right) /2;

      long leftCost = solve(left, mid, encCost, flatCost, prefix);
      long rightCost = solve(mid + 1, right, encCost, flatCost, prefix);

      return Math.min(constwithoutSplit, leftCost + rightCost);



  }

  public static void main(String[] args) {
    System.out.println(minStorageCost(2, 2, 1, Arrays.asList(1, 3)));
    // Expected: 6
    System.out.println(minStorageCost(3, 2, 1, Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8)));
        // Expected: 16

        System.out.println(minStorageCost(3, 2, 1, Arrays.asList(7, 1)));
        // Expected: 8

        System.out.println(minStorageCost(1, 10, 5, Arrays.asList(1)));
        // Expected: 10

        System.out.println(minStorageCost(1, 10, 5, Arrays.asList(2)));
        // Expected: 10

      
  }
}
