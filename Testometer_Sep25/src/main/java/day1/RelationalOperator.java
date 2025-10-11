package day1;

public class RelationalOperator {
    public static void main(String[] args) {

        //comparison --return boolean-- true or false
        //< > >= <= == !=

        int i = 10;
        int j = 7;
        System.out.println(i>j);
        System.out.println(i<j);
        System.out.println(i>=j);
        System.out.println(i<=j);
        System.out.println(i==j);
        System.out.println(i!=j);

        //Condition if else loop
        int age=24;
        if (age<=18){
            System.out.println("child");
        }else{
            System.out.println("adult");
        }


    }

}
