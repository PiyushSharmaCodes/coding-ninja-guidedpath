import java.util.* ;
import java.io.*; 
class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
    Scanner sc = new Scanner(System.in);
    float base=sc.nextInt();
    char grade =sc.next().charAt(0);
    float hra= (20*base)/100;
    float da = (50*base)/100;
    float pf = (11*base)/100;
    int allow=0;
    if (grade=='A') {
       allow=1700;
    } else if(grade=='B') {
       allow=1500;
    }else{
       allow=1300;
    }
    int total=(int)Math.round(base+hra+da+allow-pf) ;
    System.out.println(total);
		
	}
}