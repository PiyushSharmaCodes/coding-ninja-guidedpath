import java.util.Scanner;

class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int location=-1;
		int n  =sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int t=sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==t){
				location=i;
				break;
			}
		}
		System.out.println(location);
	}
}