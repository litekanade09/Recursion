import java.util.Scanner;
public class descending {
    public static void number(int n){
        if(n == 1){
            System.out.print(n);
            return;
        }
        System.out.println(n + "");
        number(n - 1);
    }
    public static void main(String[] args) {
        number(10);
    }
}
