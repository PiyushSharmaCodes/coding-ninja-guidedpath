import java.util.Scanner;
import java.util.Stack;

class Solution {

    static String reverseStringWordWise(String input) {
        // Write your code here
        input+=" ";
        Stack<String> stk = new Stack<>();
        String word="";
        for (int i = 0; i < input.length(); i++) {
            word+=input.charAt(i);
            if (input.charAt(i)==' '||i==input.length()-1) {
                stk.push(word);
                word="";
            }
        }
       
        while (!stk.isEmpty()) {
            word+=stk.pop();
        }
        return word;
        
        
        
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = reverseStringWordWise(input);
        System.out.println(ans);
    }
}