import java.util.Scanner;

public class Sum {
    public static int addTwoNum(int x,int y){
       int sum=x+y;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num1");
        int x=sc.nextInt();
        System.out.println("enter num 2");
        int y=sc.nextInt();
      int sum = addTwoNum(x,y);
      System.out.println("the sum of two num is"+sum);
        
    }
    
}
