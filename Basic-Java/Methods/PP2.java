import java.util.ArrayList;
import java.util.List;
public class Solution{
    public static List< Integer > printDivisors(int n) {
        // Write your code here
        List <Integer> result= new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            if (n%i==0) {
                result.add(i);
            }
        }
        return result;
    }
}