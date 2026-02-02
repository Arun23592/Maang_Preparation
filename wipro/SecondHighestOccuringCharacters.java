package wipro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SecondHighestOccuringCharacters {


  public static char secondHighestOccchar(String str){

    Map<Character, Integer> countMap = new HashMap<>();


    for(char ch: str.toCharArray()){
        countMap.put(ch, countMap.getOrDefault(ch, 0)+1);
    }


    List<Map.Entry<Character, Integer>> list = new ArrayList<>(
      countMap.entrySet()
    );

    list.sort((a, b) -> b.getValue() - a.getValue());

    int highest = list.get(0).getValue();

    for(int i=0; i<list.size(); i++){
      if(list.get(i).getValue() < highest){
        return list.get(i).getKey();
      }
    }
    throw new RuntimeException("no second highest occuring");

  }

  public static void main(String[] args) {
    String str = "aabbbccccc";
    char result = secondHighestOccchar(str);
    System.out.println("Second highest occurring characters is : "+result);

  }

}
