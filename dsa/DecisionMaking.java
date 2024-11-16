import java.util.Scanner;
public class DecisionMaking {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("give a value: ");
        a=sc.nextInt();
        System.out.println("give b value: ");
        b=sc.nextInt();
        if(a>b){
            System.out.println("a is largest"+a);
        }
        else{
            System.out.println("b is largest "+b);
        }
    }
}
