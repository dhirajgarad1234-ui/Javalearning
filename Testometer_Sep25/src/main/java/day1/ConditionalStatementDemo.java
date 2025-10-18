package day1;

public class ConditionalStatementDemo {
    public static void main(String[] args) {

        int age=20;
        if(age <=18){
            System.out.println("Sandwich");
        } else if (age>18 && age<=30) {
            System.out.println("Paratha");
        } else if (age>26 && age<=45) {
            System.out.println("Poha");
        }
    }
}
