import java.util.Scanner;
public class lengthofstring {
    public static int lenght(String str){
        if(str.length() == 0){
            return 0;
        }
        return lenght(str.substring(1)) + 1;
    }
    public static void main(String[] args) {
        String str = "abcde";
       System.out.print(lenght(str));
    }
}
