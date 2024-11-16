import java.util.Scanner;
class hello
{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter");
        String str=sc.nextLine();
        System.out.println("you enterd:"+str);
        sc.close();
    }
}