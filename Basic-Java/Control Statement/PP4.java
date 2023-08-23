import java.util.Scanner;
class Solution{
  public static void main(String arg[]){
    Scanner obj=new Scanner(System.in);
    int x=obj.nextInt();
    int y=obj.nextInt();
    if(x>0 && y>0){
     System.out.println("1st Quadrant");
    }
    else if(x<0 && y>0){
     System.out.println("2nd Quadrant");
    }
    else if(x<0 && y<0){
     System.out.println("3rd Quadrant");
    }
    else if(x>0 && y<0){
     System.out.println("4th Quadrant");
    }
    else if(x!=0 && y==0){
      System.out.println("x axis");
    }
    else if(y!=0 && x==0){
     System.out.println("y axis");
    }
    else{
     System.out.println("Origin");
    }
}
}