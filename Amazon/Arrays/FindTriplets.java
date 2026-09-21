package Amazon.Arrays;

public class FindTriplets {

  public static void main(String[] args){
    
    int[] arr = {1, 2, 3, 4, 5};
    int target = 9;

    boolean found = false;

    for(int i=0; i<arr.length-2; i++){
      for(int j=i+1; j<arr.length-1; j++){
        for(int k=j+1; k<arr.length; k++){
          if(arr[i] + arr[j] + arr[k] == target){
            System.out.println("Triplet found: " + arr[i] + ", " + arr[j] + ", " + arr[k]);
            found = true;
          }
        }
      }
    }

    if(!found){
      System.out.println("No triplet found");
    }
  }
  
}
