import java.util.Scanner;
public class sortedarray {
    public static boolean sorted(int i,int []arr){
        if(i == arr.length - 1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return sorted(i+1,arr);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        System.out.print(sorted(0,arr));

    }
}
