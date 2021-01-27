package com.company;
import java.util.*;

public class Main {
// VarArgs
    //    Normal way for method declaration
//    static  int sum(int a ,int b){
//        return a+b;
//    }
//
//    static  int sum(int a ,int b ,int c){
//        return a+b+c;
//    }
static int sum(int ...arr){
//    available as int [] arr;
    int result =0;
    for(int a:arr){
        result += a;
    }
    
    
    public static void main(String[] args) {
        // write your code here
//        System.out.println("Papa");
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number 1 :");
//        int a=sc.nextInt();
//        System.out.println("Enter the number 2 :");
//        int b=sc.nextInt();
//        int sum = a+b;
//        System.out.println("The sum of these numbers is : ");
//        System.out.println(sum);
//
//        boolean b1 = sc.hasNextInt();
//        System.out.println(b1);

//        String str = sc.nextLine();
//        System.out.println(str);

//        System.out.println("Enter the marks out of 100 for subject 1 : ");
//        float sub_1 = sc.nextFloat();
//        System.out.println("Enter the marks out of 100 for subject 2 : ");
//        float sub_2 = sc.nextFloat();
//        System.out.println("Enter the marks out of 100 for subject 3 : ");
//        float sub_3 = sc.nextFloat();
//        System.out.println("Enter the marks out of 100 for subject 4 : ");
//        float sub_4 = sc.nextFloat();
//        System.out.println("Enter the marks out of 100 for subject 5 : ");
//        float sub_5 = sc.nextFloat();
//        float Total = sub_1+sub_2+sub_3+sub_4+sub_5;
//        float Percentage = Total/500*100;
//
//        System.out.println("Your Percentage is :");
//        System.out.println(Percentage);


//        System.out.println(2 & 3);

////        Associativity of Operators
//        int a = 6 * 5 - 34 / 2;
//        int b = 6 / 5 - 34 * 2;
//        System.out.println(a);
//        System.out.println(b);
//
//        int x = 4, y = 5;
//        System.out.println(x);
//        System.out.println(y);
//
//        int num = 654 + 6;
//        System.out.println(num++);
//        System.out.println(num);
//        System.out.println(++num);
//        System.out.println(num++);
//        char ch = 'b';
//        System.out.println(++ch);
//
////        Practice Set
////      float num1 = 7/4 * 9/2;
//        float num1 = 7 / 4f * 9 / 2f;
//        System.out.println(num1);
//
//        char grade = 'B';
////        grade = grade+8;
//        grade = (char) (grade + 8);
//        System.out.println(grade);
//
////        Decrypting the grade
//        grade = (char) (grade - 8);
//        System.out.println(grade);

//        Scanner sca = new Scanner(System.in);
//        int in = sca.nextInt();
//        System.out.println(in>8);

//        System.out.println(7 * 94 / 7 + 35 / 7);

//        String Data type

//        String str2 = "Sagar";
//        System.out.printf("This is my name : %s",str2);
//        System.out.format("This is my name : %s",str2);


//        boolean b1 = true;
//        boolean b2 = false;
//
//        if (b1 || b2) {
//            System.out.println("Y");
//        } else {
//            System.out.println("N");
//        }
//
//        if (b1 && b2) {
//            System.out.println("Y");
//        } else {
//            System.out.println("N");
//        }


//        System.out.println("For Logical Not : ");
//        System.out.println("Not(b1) is : ");
//        System.out.println(!b1);


//        long age = 0;
//        if (age > 18) {
//            System.out.println("You can apply for voter card!");
//        } else if (age == 0) {
//            System.out.println("Welcome to world!");
//        } else if (age < 18) {
//            System.out.println("You are not eligible");
//        } else {
//            System.out.println("You are already dead");
//        }

//        String name2 = "Mom";
//        switch (name2) {
//            case "Sagar":
//                System.out.println("You are good boy");
//                break;
//            case "Sanjay":
//                System.out.println("You have new mobile");
//                break;
//            default:
//                System.out.println("God bless you");
//        }

//        int i = 1;
//        while(i<=100){
//            System.out.println(i);
//            i++;
//        }

//        do {
//            System.out.println(i);
//            i++;
//            System.out.println("THE VALUE OF I IS :" + i);
//        } while (i <= 10);
//
//        int ages = 10;
//        do {
//            System.out.println("Age :" + ages);
//        } while (ages < 5);


//        Loop Practice Problem
//        ****
//        ***
//        **
//        *
//        for(int k=4 ; k>0 ; k--){
//            for(int j=0;j<k;j++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

//        Practice Problem 2
//        int sum = 0;
//        int n = 4;
//        for(int i = 0; i<n ; i++){
//            sum = sum + (2*i);
//        }
//        System.out.println(sum);

//        Practice Problem 3
//          Table of 5
//        int n = 5;
//        for (int k = 1; k <= 10; k++) {
//            System.out.printf("%d x %d = %d \n", n, k, n * k);
//        }


//        Practice Problem 4
//          Table of 10 in reverse order.
//        int n = 10;
//        for (int k = 10; k >=1; k--) {
//            System.out.printf("%d x %d = %d \n", n, k, n * k);
//        }

//        Practice Problem 5
//        Factorial of given numbers
//        int n  = 3;
//        int fact = 1;
//        int k = 1;
//        while(k<=n){
//            fact = fact*k;
//            k++;
//        }
//        System.out.println(fact);




//        Practice Problem 6
//        int fact = 1;
//        for (int k = 1; k<=3 ; k++){
//            fact *=k;
//        }
//        System.out.println(fact);



//       Practice Problem 9
//        Table of 5 and its sum
//        int n = 5;
//        int sum = 0;
//        for (int k = 1; k <= 10; k++) {
//            sum = sum + n*k;
//        }
//        System.out.println(sum);
        
        
//         Java Tutorial: Introduction to Arrays
//        An array is a collection of similar types of data.
//

    //        Use Case: Storing marks of 5 students
//        int [] marks = new int[5]; //Declaration + Memory allocation!
//        marks[0] = 10;
//        marks[1] = 20;
//        marks[2] = 30;
//        marks[3] = 40;

        int[] marks = {100,70,80,71,98}; // Declare + Initialize!
        System.out.println(marks[3]);

//        Array indices start from 0 and go till (n-1) where n is the size of the array.
//
//        Array length
//        Arrays have a length property which gives the length of the array.
        System.out.println(marks.length); //Gives 5 if marks is a reference to an array with 5 elements
        
//       Var Args tutorial  
        System.out.println("Welcome to Vargs Tutorial");
        System.out.println("The sum of 4 and 5 is : " + sum(4,5));
        System.out.println("The sum of 4 and 5 is : " + sum(4,5,8));
        System.out.println("The sum of 1 is : " + sum(1));  //ans:1
        System.out.println("The sum of Nothing is : " + sum()); //ans :0

    
// Java Tutorial: Basic Terminologies in Object Oriented Programming
// OOPs Terminology
// 1.Abstraction – Hiding internal details [show only essential info!]
// 2.Encapsulation – The act of putting various components together (in a capsule).
// In Java, encapsulation simply means that sensitive data can be hidden from the users.
// 3.Inheritance – The act of deriving new things from existing things.
//  Rickshaw      →        E-Rickshaw
//  Phone           →        Smart Phone
// 4.Polymorphism – One entity many forms
// Smartphone → Phone                   Smartphone → Calculator




    }
}
