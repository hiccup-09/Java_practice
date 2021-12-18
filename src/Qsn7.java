// 7.To calculate Fibonacci Series up to n numbers.
import java.util.*;
public class Qsn7 {
    public static void main(String[] args) {
        int zero=0 ,one=1 ,fib;
        System.out.println("enter the nth place till when you want the fibonacci serie");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(zero);
        System.out.println(one);
        for (int i=2;i<=n;i++){
            fib =zero+one;
            System.out.println(fib);
            zero=one;
            one=fib;
        }
    }
}
