package day1;

public class DataTypeDemo {
    public static void main(String[] args) {
        short S1=181;

        byte B2=(byte) S1;

       // System.out.println(B2);
        //type conversion
        //Prefix 0 means convert to octal number

       // int k=077;
       // System.out.println(k);
        //prefix 0x convert to hexadecimal
       // int k=0x89;
       // System.out.println(k);
        //prefix ob convert to binary
        int k=0b10;
        System.out.println(k);
    }
}
