import java.util.Arrays;
import java.util.List;


public class Q1_MoveUnit {


  public static int moveUnits(List<Integer> population, String unit){
      int n = population.size();

      //Tracks city is already protected

      boolean[] protectedCity = new boolean[n];

      //Transverse the city
      for(int i=0; i<n; i++){

        //check if current city has security unit
        if(unit.charAt(i) == '1'){

          //First city cannnot move left 
            if(i == 0){
              protectedCity[i] = true;
            }else {
              //if left city is already not protected
              //and left city's population is greater than or equal to current city
              if(!protectedCity[i - 1] && population.get(i - 1) >= population.get(i)){
                protectedCity[i - 1] = true;
              }else{

                //otherwise keep the unit in the current city
                protectedCity[i] = true;
              }
            }
        }
      }


      //Calculate total protected population
      int total = 0;

      for(int i=0; i<n; i++){
        if(protectedCity[i]){
          total += population.get(i);
        }
      }

      return total;
  }

  public static void main(String[] args) {
    System.out.println(moveUnits(Arrays.asList(10, 5, 8, 9, 6), "01101"));  
    // Expected: 27
    System.out.println(moveUnits(Arrays.asList(20, 10, 9, 30, 20, 19), "011011"));
        // Expected: 80

        System.out.println(moveUnits(Arrays.asList(5, 4, 5, 1), "0111"));
        // Expected: 14

        System.out.println(moveUnits(Arrays.asList(5), "1"));
        // Expected: 5

        System.out.println(moveUnits(Arrays.asList(1, 100), "01"));
        // Expected: 100

        System.out.println(moveUnits(Arrays.asList(100, 1), "10"));
        // Expected: 100

        System.out.println(moveUnits(Arrays.asList(1, 2, 3, 4), "1111")); 
        // Expected: 10
  }

}

/***
 * 
 * Problem 1: Move Units to Maximize Protected Population

Problem Statement (Beginner Friendly)

You have:
	•	A list of city populations
	•	A string of 0s and 1s

Example:

population = [10, 5, 8, 9, 6]
unit = "01101"

Meaning:
	•	0 means no security unit in that city
	•	1 means there is a security unit in that city

Rules:
	•	A security unit can stay in its current city
	•	Or it can move only one step to the left
	•	A city can only be protected once

Goal:
Maximize the total population of protected cities.

⸻

Example

population = [10, 5, 8, 9, 6]
unit = "01101"

Cities:

Index	Population	Unit
0	10	0
1	5	1
2	8	1
3	9	0
4	6	1

We decide:
	•	Unit at index 1 can move left to city 0 (population 10 instead of 5)
	•	Unit at index 2 stays at city 2
	•	Unit at index 4 moves left to city 3 (population 9 instead of 6)

Protected populations:

10 + 8 + 9 = 27

Answer = 27

⸻

Approach Used

We use a greedy approach.

For every city containing a unit:
	1.	Check whether moving left gives a better population
	2.	Make sure the left city is not already protected
	3.	Otherwise, keep the unit in the current city

⸻

Time Complexity

O(n)

Because we traverse the list only once.

Space Complexity

O(n)

Because we use an extra boolean array to track protected cities.

⸻

Code with Step-by-Step Comments

import java.util.*;

public class MoveUnitsPractice {

    public static int moveUnits(List<Integer> population, String unit) {
        int n = population.size();

        // Tracks whether a city is already protected
        boolean[] protectedCity = new boolean[n];

        // Traverse each city
        for (int i = 0; i < n; i++) {

            // Check if current city has a security unit
            if (unit.charAt(i) == '1') {

                // First city cannot move left
                if (i == 0) {
                    protectedCity[i] = true;
                } else {

                    // If left city is not already protected
                    // and left city's population is greater than or equal to current city
                    if (!protectedCity[i - 1] && population.get(i - 1) >= population.get(i)) {
                        protectedCity[i - 1] = true;
                    } else {
                        // Otherwise keep the unit in current city
                        protectedCity[i] = true;
                    }
                }
            }
        }

        // Calculate total protected population
        int total = 0;
        for (int i = 0; i < n; i++) {
            if (protectedCity[i]) {
                total += population.get(i);
            }
        }

        return total;
    }
}


⸻


 * 
 * 
 */