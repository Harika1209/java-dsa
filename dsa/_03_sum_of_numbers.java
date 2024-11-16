import java.util.Scanner;
public class _03_sum_of_numbers{
    public static void main(String[] args){

        // this is code for sum of two numbers
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("give  a b values: ");
        a=sc.nextInt();
        b=sc.nextInt();
        int sum=a+b;
        System.out.println("sum of two numbers is:"+sum);
        sc.close();
        /*int harika;
        Scanner sc=new Scanner(System.in);
        System.out.println("give harika value:");
        harika=sc.nextInt();
        System.out.println(harika);
        sc.close();*/
        // Scanner sc=new Scanner (System.in);
        // System.out.print("enter your name: ");
        // String name=sc.nextLine();
        // System.out.print("enter your age: ");
        // int age=sc.nextInt();
        // System.out.println("enter your height (in meters): ");
        // double height=sc.nextDouble();
        // System.out.println("hello,"+name+"!");
        // System.out.println("age is:"+age);
        // System.out.println("height:"+height+"meters");
        // sc.close();
    }
}