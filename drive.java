import java.util.Scanner;

public class drive {

    public static void main(String[] args) {

        System.out.println("enter user age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(age);
        if (age > 18) {
            System.out.println("he/she can drive");
        } else {
            System.out.println("not able for drive");
        }
    }

}
