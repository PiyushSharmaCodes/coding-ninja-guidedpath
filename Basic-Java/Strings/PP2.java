import java.util.* ;
import java.io.*; 
class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		for (int i = 0; i < str.length(); i++) {
			
			for (int j = i; j < str.length(); j++) {
				String res ="";
				for (int k = i; k <= j; k++) {
					res+=str.charAt(k);
				}
				System.out.println(res);
			}
		}
		
		
	}
}