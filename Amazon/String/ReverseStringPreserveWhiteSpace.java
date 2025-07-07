package Amazon.String;

public class ReverseStringPreserveWhiteSpace {

    public static String reversePreserveWithWhiteSpace(String input){
        char[] inputArr = input.toCharArray();
        char[] result = new char[inputArr.length];

        for(int i = 0; i<inputArr.length; i++){
            if(Character.isWhitespace(inputArr[i])){
                result[i] = inputArr[i];
            }
        }

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
        return new String(result);
    }

    public static void main(String[] args) {
        String input = "a b c d e";
        String output = reversePreserveWithWhiteSpace(input);
        System.out.println("Original: \""+ input + "\"");
        System.out.println("Original: \""+ output + "\"");
    }

}
