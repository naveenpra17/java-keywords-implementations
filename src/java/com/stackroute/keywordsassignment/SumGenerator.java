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
        int sum=0;
        int i=0;
       for(;;){//for loop runs until i==result
        if(i==result+1)
            break;
        sum=sum+i;
        i++;
        }
        System.out.println(sum);
       int sum1=sum;
        sum=0;
       do{
          if(sum%2==0)
           System.out.println(sum+"is even");
           sum++;
       }while (sum1!=sum);//while loop for interating; if while is false program ends


    }
}

