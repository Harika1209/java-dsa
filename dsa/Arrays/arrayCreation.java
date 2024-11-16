
package Arrays;

public class arrayCreation {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        // arr[6]=5;
        changearray(arr);
        for(int i=0;i<=7;i++){
            // arr[i]=1;
            System.out.print(arr[i]+" ");
        } 
    }
    static void changearray(int [] a){
        a[0]=1000;
    }
}
