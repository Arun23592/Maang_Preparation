package Amazon.Arrays;

public class SecondLargestElement {

  public static void main(String[] args) {
    int[] arr = {10, 20, 40, 60, 100};

    int largest = 0;
    int second_largest = 0;

    for(int num: arr){
      if(num > largest){
        second_largest = largest;
        largest = num;
      }else if (num > second_largest && num != largest) {
        second_largest = num;
      }
    }

    System.out.println(second_largest);
  }

}
