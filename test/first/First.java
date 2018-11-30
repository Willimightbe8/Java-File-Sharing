package first;

import java.util.*;
import java.io.*;
public class First {    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       System.out.println("Input first number");
       int myint = keyboard.nextInt();
       System.out.println("Input second number");
       int mySndInt;
       mySndInt = keyboard.nextInt();
       
        // TODO code application logic here
       System.out.println("Your Answer:"+myint*mySndInt);
    }
}