package day1;

public class reversenumber {
    public static void main(String[] args) {
      // int num=34;
       //int lastdigit=num % 10;

       //int reversenumber =0;
      // reversenumber = reversenumber * 10 + lastdigit;//4
      // num=num / 10;//3
      // lastdigit=num % 10;//3
        //reversenumber = reversenumber * 10 + lastdigit;//43
       // System.out.println(reversenumber);

        int num=3456;
        int lastdigit=num % 10;//6

        int reversenumber=0;
        reversenumber= reversenumber * 10 + lastdigit;//6
        num=num / 10;//345

        lastdigit =num % 10;//5
        reversenumber= reversenumber * 10 + lastdigit;//65
        num=num / 10;//34

        lastdigit=num% 10;//4
        reversenumber= reversenumber * 10 + lastdigit;//654
        num=num /10;//3

        lastdigit=num% 10;//3
        reversenumber= reversenumber * 10 + lastdigit;//6543

        System.out.println(reversenumber);



    }
}
