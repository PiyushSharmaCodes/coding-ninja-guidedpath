import java.util.* ;
import java.io.*; 
import java.util.Scanner;

class CountPrime {
	
	// Write your totalPrime function here
	public static int totalPrime(int s,int e){
		int count=0;
		for (int i = s; i <= e; i++) {
			int flag=0;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i%j==0) {
					flag=1;
					break;
				}
			}
			if (flag==0) {
				count++;
			}
		}
		return count;
	}
}

class Solution {
	public static void main(String args[]) {
		
		CountPrime obj = new CountPrime();
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		System.out.println(obj.totalPrime(s, e));
	}
}
		
			