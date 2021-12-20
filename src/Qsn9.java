//    9.To find Armstrong Number between two given number.

import java.util.*;
public class Qsn9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int start, end;

        System.out.println("Enter the rage");
        System.out.print("Start Point :");
        start = in.nextInt();
        System.out.print("End point :");
        end = in.nextInt();

        System.out.println("Armstrong Numbers Are in this range : ");
        for (int i = start;i<=end;i++){
            int num = i,count=0;
            while(num!=0){
                num =num/10;
                count++;
            }
            int num2 = i,num3;
            double flag=0;
            while(num2!=0){
                num3=num2%10;
                num2=num2/10;
                flag=Math.pow(num3,count)+ flag;
            }
//            System.out.print(i);
//            System.out.println("\t"+ count);
            if (i==flag){
                System.out.print(i +",\t");
            }
        }

    }
}
