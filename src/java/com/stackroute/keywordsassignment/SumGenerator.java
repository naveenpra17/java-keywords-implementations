package com.stackroute.keywordsassignment;
import java.util.Scanner;

/**
 * this classes uses the method of objects and classes class
 * by creating the object of object and classes class we can use that method
 *  class is a template definition of the method s and variable s in a particular kind of object
 *  an object is a specific instance of a class
 */
public class SumGenerator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the two values");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        ObjectAndClasses objectAndClasses=new ObjectAndClasses();//we use new keyword to create an object
       int result= objectAndClasses.sumCalculator(num1,num2);
       //conditional statements
        if(result>10)   //if result is greater than 10 run this
        System.out.println("great");
        else if(result>5 && result<10)//if result is greater than 5 and less than 10 run this
            System.out.println("not bad");
        else        //else
            System.out.println("bad");

    }
}

