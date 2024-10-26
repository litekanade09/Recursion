import java.util.Scanner;
public class sum {
    public static int number(int n){
        if(n == 1){
            return 1;
        }
        int fmm = number(n - 1);
        int fn = n + number(n - 1);
        return fn;
    }
    public static void main(String[] args) {
        System.out.println(number(5));
    }
}