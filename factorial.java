import java.util.Scanner;
public class factorial {
    public static int  number(int n){
        if(n == 0){
            return 1;
        }
        int fnm = number(n - 1);
        int ff = n * number(n - 1);

        return ff;

    }
    public static void main(String[] args) {
       System.out.print(number(5));
    }
}
