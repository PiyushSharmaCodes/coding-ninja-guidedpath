import java.util.* ;
import java.io.*; 
class Person {
	private String name;
	private int age;
	
	// Complete the class
	public void setName(String name){
		this.name=name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return this.age;
	}
	public String getName(){
		return this.name;
	}
}

class Solution {
	
	public static void main(String args[]) {
		
		// Write your code here
		Scanner sc = new Scanner(System.in);
		String name=sc.nextLine();
		int age=sc.nextInt();
		Person p = new Person();
		p.setAge(age);
		p.setName(name);
		System.out.println("The name of the person is " + p.getName() + " and the age is " + p.getAge()+".");
	}
}
		