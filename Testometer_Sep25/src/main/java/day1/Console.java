package day1;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        Scanner console=new Scanner(System.in);
        System.out.println("what is your age");
        int age= console.nextInt();
        System.out.println("your age is "  +age);

    }
}
