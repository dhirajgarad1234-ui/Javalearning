package day1;

public class CharDemo {
    public static void main(String[] args) {
        //Ascii--1byte--Ascii chart
      //  char c='v';
       //System.out.println(c);
      //  int k=c;
       // System.out.println(k);
//all char is integer
      //  int n=97; //4byte
       // char d=(char)n;// 1byte

       // System.out.println(d);
        //unicode;2byte--hexadecimal
       char d='\u0927';
       // char h='\u093F';
       System.out.println("" +d +'\u093F'+'\u0930' +'\u091C' +'\u0926'+'\u0946'+'\u0935'+'\u093F'+'\u0926'+'\u093E'+'\u0938'+'\u0917'+'\u0930'+'\u0921');
    }
}
