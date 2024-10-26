import java.util.Scanner;
public class numberintoletters {
    static String digits[] =
           {"Zero","One", "Two","Three","Four","Five","Six","Seven","Eight","Nine"};

    public static void printDigits(int n){
        if(n == 0){
            return;
        }
        int lastdigit = n%10;
        printDigits(n/10);
        System.out.print(digits[lastdigit] + "");
    }

    public static void main(String[] args) {
        printDigits(1234);
    }
}
