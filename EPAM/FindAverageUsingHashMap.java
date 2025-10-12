package EPAM;

import java.util.HashMap;
import java.util.Map;

public class FindAverageUsingHashMap {


  public static void main(String[] args){

    Map<String, Integer> data = new HashMap<>();
    data.put("Brain", 21);
    data.put("Lee", 22);
    data.put("Cathe", 45);

    int sum = 0;

    for(int val: data.values()){
      sum += val;
    }

    double average = (double) sum / data.size();

    System.out.println("Average value: "+ average);
  }

}


/*
 * 
 * 11. Write a code using HashMap
      Brian – 21
      Lee – 22
      Cathe – 45
Using key and value and find the average?
 * 
 * 
 * 
 */