package Nagarro;



public class MoveEvenLeftOddRight {

  public static void shiftOddEven(int[] num){
    //1. create an integer array
    int[] temp = new int[num.length];

    //2. initialize the index
    int index = 0;

    //3. copy all the even numbers in order
    for(int n: num){
        if(n % 2 == 0){
          temp[index++] = n; 
        }
    }

    //4. copy all the odd numbers in order
    for(int n : num){
      if(n % 2 != 0){
        temp[index++] = n;
      }
    }

    //copy back to original array
    System.arraycopy(temp, 0, num, 0, num.length);

  }

  public static void main(String[] args) {
    int[] num = {1, 3, 2, 4, 5, 6, 7, 8, 9};
    shiftOddEven(num);

    //print the result
    for(int n : num){
      System.out.print(n+ " ");
    }
  }

}

/*
 * Approach: Use an Auxiliary Array
Although this approach uses O(n) space, it guarantees stability.

✅ Time Complexity
O(n) (one pass to segregate, another pass to fill the array)

✅ Space Complexity
O(n) (for the temporary array)


 * 
 * 
 * 
 */