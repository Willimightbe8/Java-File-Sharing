/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package first;
import java.util.*;
import java.io.*;
/**
 *
 * @author prudenl
 */
public class CalculatorFirst {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       do
       {
       System.out.println("Which function do you want? 1=Add 2=Subtract 3=Multiply 4=Divide");
       int funcChoice = keyboard.nextInt();
       System.out.println("Choose your first number");
       double firstNum = keyboard.nextDouble();
       System.out.println("Choose your second number");
       double secondNum = keyboard.nextDouble();
       switch (funcChoice)
       {
           case 1:
               System.out.println(firstNum+" plus "+secondNum+"="+(firstNum+secondNum));
               break;
           case 2:
               System.out.println(firstNum+" minus "+secondNum+"="+(firstNum-secondNum));
               break;
           case 3:
               System.out.println(firstNum+" times "+secondNum+"="+(firstNum*secondNum));
               break;
           case 4:
               System.out.println(firstNum+" divided by "+secondNum+"="+(firstNum/secondNum));
               break;
       }
       System.out.println("Press '1' to continue");
       int c= keyboard.nextInt();
       while(c=1);
       }
}