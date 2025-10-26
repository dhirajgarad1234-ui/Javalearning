package day1;

import javax.xml.namespace.QName;

public class Human {
//Instance variable
   String name;
   int height;
   double weight;
   String colour;

}
class student{
    String name;
    int math;
    int science;
    int arts;
}
class HumanDemo{
    public static void main(String[] args) {
        //object same like datatypes only
       // int i=10;

        //student S1= new student();//Student class ka object bana S1
        //S1.name="Dhiraj";
        //S1.math=45;
        //S1.science=34;
        //S1.arts=35;
        Human h1 = new Human();
        h1.name = "Dhiraj";
        h1.height = 170;
        h1.weight = 80.2;
        h1.colour = "Black";
        System.out.println(h1);


    }
}
