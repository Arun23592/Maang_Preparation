package Siemens;

public class SumOfElementsInArray {

  public static void main(String[] args) {
    int[] array = {2, 4, 6, 8};
    int sum = 0;

    for(int num: array){
      sum += num;
    }

    System.out.println(sum);
  }

}
