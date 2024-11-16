public class LargestofThree {
    public static void main(String[] args) {
        int a=10,b=20,c=10;
        // if((a>b) && (a>c)){
        //     System.out.println("a is largest");
        // }
        // if((b>a) && (b>c)){
        //     System.out.println("b is largest");
        // }
        // if((c>b) && (c>a)){
        //     System.out.println("c is largest");
        // }
    
        System.out.println((a>b && a>c)?"a":(b>a && b>c)?"b":(c>a && c>b)?"c":"all are equal");
    }
}         
