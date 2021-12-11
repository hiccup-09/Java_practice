
//Write a program to print whether a number is even or odd, also take input.
import java.util.*;
public class Qsn1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number !!");
        System.out.println();

        int num = in.nextInt();
        if(num%2 == 0){
            System.out.println("its an even number");
        }else{
            System.out.println("its an odd number");
        }
    }
}

