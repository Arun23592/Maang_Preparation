package wipro;

public class findindex {

  public static int sumandFindIndex(int[] arr){

    //edgecase
    if(arr == null || arr.length == 0){
      return -1;
    }


    int n = arr.length - 1;

    int sumRight = 0;

    for(int i=0; i<n; i++){
      for(int j=i=1; j<n; j++){
        sumRight += arr[j];

        if(arr[i] == sumRight){
          return i;
        }
      }
    }

    return -1;
  }


  public static void main(String[] args) {
    int[] arr = {9, 6, 2, 1};
    int index = sumandFindIndex(arr);
    System.out.println(index);
  }
}


// Q2. Program to return index 'i', where 'x'= sum of all elements that result in 'x' (Example: {9,6,2,1} → index 1; Explanation: 6+2+1 = 9, index = 1)
//compute the sum of the right side (or sum of others) by looping again
//Brute-force (O(n²)) approach