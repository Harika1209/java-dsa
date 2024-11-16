public class sum_of_digits {
    public static void main(String[] args) {
        int num=87003;
        int sum=0;
        int lastdigit;
        while(num>=1){
            lastdigit=num%10;
            sum=(sum*10)+lastdigit;
            num=num/10;
        }
        System.out.println(sum);
    }
}
