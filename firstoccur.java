import java.util.Scanner;
public class firstoccur {
    public static int number(int arr[], int key,int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return number(arr,key,i+1);

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,5,9};
        int key = 5;
        System.out.print(number(arr,key,0));
    }
}
