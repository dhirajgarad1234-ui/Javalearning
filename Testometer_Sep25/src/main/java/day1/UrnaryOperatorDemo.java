package day1;

public class UrnaryOperatorDemo {
    public static void main(String[] args) {
        int a=10;
        //++a;
        //System.out.println(a);
        //increment and decrement operator
        //pre increment ++a first increase and assign
        //post increment a++ first assign and increase
        int b=++a + a++;
        //    11+11
        System.out.println("a :" +a);
        System.out.println("b :" +b);
    }
}
