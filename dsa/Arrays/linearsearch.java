package Arrays;

public class linearsearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int target=5;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println(i +" target found");
                break;
            }
        }

    }
}
