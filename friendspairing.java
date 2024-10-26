import java.util.Scanner;
public class friendspairing {
    public static int friends(int n){
        if(n == 1 || n == 2){
            return n;
        }
        //single
        int fnm = friends(n - 1);
        //pairsj
        int fn = friends(n -2);
        int totalways = fnm +fnm * fn;
        return totalways;
    }
    public static void main(String[] args) {
        System.out.print(friends(6));
    }
}
