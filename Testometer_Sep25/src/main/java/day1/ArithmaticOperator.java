package day1;

public class ArithmaticOperator {
    public static void main(String[] args) {

        //int i = 10;
       // int j = 7;
        //System.out.println(i + j);
        //System.out.println(i - j);
        //System.out.println(i * j);
        //System.out.println((float)i / (float)j);
        //System.out.println(i % j);
//Bodmass rule
        //B → Brackets
        //O → Orders (powers, roots, etc.)
        //D → Division
        //M → Multiplication
        //A → Addition
        //S → Subtraction
       // System.out.println(10/5-3*4);
//even, odd numbers
       // int k=23;
        //k % 2==1 odd number
        //k % 2==0 even number

        //int num=673;
        //System.out.println(num % 10);// last digit of number
       // System.out.println(num / 10);// first two digit of number

        //both number sum 6+7=13
        //int num=67;
        //int rem=num%10;
        //int div=num/10;
        //System.out.println(rem+div);

        //3 digit sum 674=17
         int num=674;
         int sum=0;

         sum=sum+(num%10);//sum=4
         num=num/10;//num=67

        sum=sum+(num%10);//sum=11
        num=num/10;//num=6
        sum=sum+num;
        System.out.println(sum);


    }
}
