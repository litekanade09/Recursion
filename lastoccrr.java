import java.util.Scanner;
public class lastoccrr {
    public static int number(int arr[],int key,int i){
        if(i == arr.length){
            return  -1;
        }
        int isFound = number(arr,key,i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,5,8,0};
        int key = 5;
        System.out.print(number(arr,key,0));
    }
}
