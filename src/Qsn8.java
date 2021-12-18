//    8.To find out whether the given String is Palindrome or not.

//the idea for solution is if we reverse it and store it in another string and
// then compare two string then if two were the same then we can same the string is palindrome.

import java.util.*;
public class Qsn8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("the the string to check palindrome");
        String str ,revStr="";
        str = in.nextLine();
        int length = str.length();
        System.out.println(length);
        for (int i=length-1;i>=0;i--){
            revStr=revStr + str.charAt(i);
        }
        if(str.equals(revStr)){
            System.out.println("the string is  palindrome");
        }else{
            System.out.println("string is not palindrome");
        }


    }
}
