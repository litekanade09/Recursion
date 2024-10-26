import java.util.Scanner;
public class fibonacci {
    public static int number(int n){
        if(n == 0){
            return 0;
        } else if (n== 1) {
            return 1;
        }else{
            return number(n - 1) + number(n - 2);
        }
    }
    public static void main(String[] args) {
       System.out.print(number(20));
    }
}
