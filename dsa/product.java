import java.util.Scanner;
public class product {
    // this is the code for product
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("give a b values: ");
        int a=in.nextInt();
        int b=in.nextInt();
        int product=a*b;
        System.out.println(product);
        in.close();
        // Scanner sc=new Scanner(System.in);
        // System.out.println("give radius:");
        // double radius=sc.nextDouble();
        // double area=3.14*radius*radius;
        // System.out.println("area is:"+area);

        
    }
    
}
