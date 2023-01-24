import java.util.*;
public class Multiply {
    public static float mulTwoNum(float x,float y){
        float mul=x*y;
         return mul;
     }
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter num1");
         float x=sc.nextFloat();
         System.out.println("enter num 2");
         float y=sc.nextFloat();
       float mul = mulTwoNum(x,y);
       System.out.println("the Multiply of two num is" + mul);
         
     }
    
}
