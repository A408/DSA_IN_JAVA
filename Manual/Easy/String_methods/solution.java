import java.util.*;

public class Main {
    public static void main(String[] args) {
      String s = "parul uu";
    System.out.println(s.length());
    char ch = s.charAt(2);
    System.out.println(ch);
    System.out.println(s.indexOf('u'));
    System.out.println(s.substring(0,4));
    System.out.println(s.contains("parul"));
    System.out.println(s.contains("abc"));
    System.out.println(s.toUpperCase());
    System.out.println(s.toLowerCase());
    System.out.println(s.trim());
    System.out.println(s.replace('u','d'));
    System.out.println(s.startsWith("Pa"));
    System.out.println(s.startsWith("pa"));
    System.out.println(s.endsWith("k"));
    System.out.println(s.endsWith("u"));

     // s.equals();
    //   s.concat();


    System.out.println("hello"+10+20);
    System.out.println(10+20+60+"hello"+10+20);

    //ascii values
    System.out.println((int)'A');
    System.out.println((int)'a');
    System.out.println((int)'0');


    char [] w = {'h','e','l','l','o'};
    String v1= String.valueOf(w);
    System.out.println(v1);


        
    String w = "hello";
      for(char c : w.toCharArray()){
        System.out.print(c + " ");

        

    }
}
