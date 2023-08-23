import java.util.ArrayList;
import java.util.Collections;


public class Solution {
	public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int n, int k) {
		//Write your code here
		 Collections.sort(arr);
		 ArrayList<Integer> result = new ArrayList<Integer>();
		 result.add(arr.get(k-1));
		 result.add(arr.get(n-k));
		 return result;
		
	}
}
