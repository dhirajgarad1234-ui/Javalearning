package day1;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        Scanner console=new Scanner(System.in);
       // System.out.println("what is your age");
       // int age= console.nextInt();
        //System.out.println("your age is "  +age);
        System.out.println("provide your number");
        int num=console.nextInt();

      //  int rem=num%10;
        //int div=num/10;
       // System.out.println(rem+div);

        int rem=num%2;
        if(rem==0){
            System.out.println("even");
        }else {
            System.out.println("odd");
        }

    }
}
