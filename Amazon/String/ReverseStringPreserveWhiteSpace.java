package Amazon.String;

public class ReverseStringPreserveWhiteSpace {

    public static String reversePreserveWithWhiteSpace(String input){
        char[] inputArr = input.toCharArray();   // Convert input to char array for indexed access
        char[] result = new char[inputArr.length]; // Result array of same length to build the output

        // 1) Copy whitespace characters to same positions in result
        for(int i = 0; i<inputArr.length; i++){
            if(Character.isWhitespace(inputArr[i])){
                result[i] = inputArr[i];
            }
        }

        // 2) Fill non-whitespace positions in result with characters from the end of input
        int j = inputArr.length - 1;
        for(int i=0; i<inputArr.length; i++){
            if(!Character.isWhitespace(inputArr[i])){
                while (j >= 0 && Character.isWhitespace(inputArr[j])) {
                    j--;
                }
                result[i] = inputArr[j];
                j--;
            }
        }
        return new String(result);  // 2) Fill non-whitespace positions in result with characters from the end of input
    }

    public static void main(String[] args) {
        String input = "a b c d e";
        String output = reversePreserveWithWhiteSpace(input);
        System.out.println("Original: \""+ input + "\"");
        System.out.println("Original: \""+ output + "\"");
    }

}



/*
 * 
 * 
 * Approach implemented (high level)

Create an output char array of same length as input.

First pass: copy whitespace characters from input to the same indices in result.

Second pass: iterate left-to-right over input; for each non-whitespace position i in input, pick the next non-whitespace character from the end of input (using pointer j) and place it into result[i].

Convert result to a String and return.

This guarantees whitespace characters remain at their original indices, while non-whitespace characters appear in reverse order.


Step-by-step example

Input: "a b c d e"
Indices: 0:a 1:space 2:b 3:space 4:c 5:space 6:d 7:space 8:e

After first loop (copy spaces): result = [ , ' ', , ' ', , ' ', , ' ', ]

Second loop fills non-space indices from the end (j starts at 8):

i=0 → result[0] = input[8] = 'e' → j=7

i=2 → skip whitespace at i=1; result[2] = input[6] = 'd' → j=5

i=4 → result[4] = input[4] = 'c' → j=3

i=6 → result[6] = input[2] = 'b' → j=1

i=8 → result[8] = input[0] = 'a' → j=-1

Final result: "e b d c a"


Time and space complexity

Time Complexity: O(n) where n is input.length()

First loop: O(n)

Second loop: O(n) overall — the inner while(j >= 0 && isWhitespace(...)) is amortized O(n) because j only moves left up to n times total.

Space Complexity: O(n) due to the result char array. (Plus O(n) to build the returned String.)

Edge cases to watch for

input == null → current code will throw NullPointerException. Add a null check if needed.

Empty string "" → returns "".

All whitespace → returned string equals input (no non-whitespace chars to reverse).

No whitespace (e.g., "abc") → standard full reverse: "cba".

Mixed whitespace types — Character.isWhitespace handles spaces, tabs, newlines, and many Unicode whitespace characters.

Unicode surrogate pairs (emoji): reversing by char can break surrogate pairs — if the input may contain such characters and you need to preserve them, use int[] codePoints = input.codePoints().toArray() and operate on code points instead of char (more on this below).


Interview follow-ups you should be ready to discuss

Can this be done in-place (O(1) extra space)?
Yes — using a two-pointer swap that only touches non-whitespace indices. See alternative below.

Why is the inner while not making this O(n²)?
Because j only moves leftwards across the array once; each character gets examined at most twice overall — so amortized O(n).

How to handle Unicode code points (surrogate pairs)?
Use int[] cps = input.codePoints().toArray() and treat those ints as units to reverse (so you don't split surrogate pairs).

What if you must preserve other characters (like punctuation) while reversing only letters or digits?
Change the Character.isWhitespace checks to desired predicates (e.g., Character.isLetterOrDigit).

Alternative approach — in-place two-pointer (O(1) extra)

You can perform the reversal in-place on a char[] by swapping non-whitespace characters from both ends. This avoids a separate result array.

Key idea: maintain two pointers l=0 and r=n-1.
Advance l to the next non-whitespace index; advance r to the previous non-whitespace index. Swap the characters at l and r while l < r. This preserves white spaces because you only swap characters at non-whitespace positions.

In-place implementation (annotated)
public static String reverseInPlacePreserveWhitespace(String input) {
    if (input == null) return null;
    char[] arr = input.toCharArray();
    int l = 0, r = arr.length - 1;

    while (l < r) {
        // move l to next non-whitespace
        while (l < r && Character.isWhitespace(arr[l])) l++;
        // move r to previous non-whitespace
        while (l < r && Character.isWhitespace(arr[r])) r--;

        if (l < r) {
            // swap non-whitespace characters
            char tmp = arr[l];
            arr[l] = arr[r];
            arr[r] = tmp;
            l++;
            r--;
        }
    }
    return new String(arr);
}


Time: O(n)

Space: O(1) extra (in-place), plus O(n) for returned string object.

This in-place solution is slightly simpler and more memory efficient (useful in tight-memory contexts). It's also easy to explain in interviews: two pointers approach with skipping.

Final notes (what to say in an interview)

Explain the two-pass approach: mark positions of whitespace, then fill non-whitespace characters from the end — O(n) time and O(n) space.

Mention the in-place two-pointer alternative (O(1) extra space).

Bring up Unicode caveat if interviewer cares about emoji / surrogate pairs.

Show a short dry run (like "a b c d e") to convince them your solution works.
 * 
 * 
 */