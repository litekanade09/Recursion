import java.util.Scanner;
public class increasing {
    public static void number(int n){
//        if(n == 10){
//            System.out.print(n);
//            return;
//        }
//        System.out.print(n);
//        number(n + 1);
        if(n == 1){
            System.out.println(n);
            return;
        }
        number(n - 1);
        System.out.println(n);
    }
    public static void main(String[] args) {
//        number(1);
        number(10);
    }
}
