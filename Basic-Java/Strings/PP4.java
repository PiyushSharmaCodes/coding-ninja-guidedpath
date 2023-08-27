import java.util.* ;
import java.io.*; 
class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char ch = sc.next().charAt(0);
		String res="";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)!=ch) {
				res+=str.charAt(i);
			}
		}
		System.out.print(res);

		
	}
}