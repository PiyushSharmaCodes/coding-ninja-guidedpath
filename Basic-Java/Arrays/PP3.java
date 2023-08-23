import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        // Write your code here.
        int k = arr.size()+m;
        for (int i = m+1; i <=k/2; i++) {
           Collections.swap(arr, i, k-i);
        }
        
    }
}
