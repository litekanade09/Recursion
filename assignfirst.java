import java.util.Scanner;
public class assignfirst {
    public static void occurences(int arr[],int i,int key){
        //basecase
        if(i == arr.length){
            return ;
        }
        //kaam
        if(arr[i] == key){
            System.out.print(i+"");
        }
         occurences(arr,i+1,key);
    }
    public static void main(String[] args) {
        int arr[] = {3,2,4,5,6,2,7,2,2};
        int key = 2;
        occurences(arr,0,key);
    }
}
