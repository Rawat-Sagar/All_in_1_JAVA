package com.company;

class Base{
    Base(){
        System.out.println("I am a base class Constructor");
    }
    Base(int x){
        System.out.println("I am a base class Constructor with value of a :"+x);
    }

}

class Derived extends Base{
    Derived(){
//        super(8);
        System.out.println("I am derived class constructors");
    }

     Derived(int x , int y){
        super(x);
        System.out.println("I am derived class constructors with value of b as :"+y);
    }

}

class derived1 extends Derived{
    derived1(){
        System.out.println("I am a child of derived class ");
    }
    derived1(int x,int y,int z){
        super(x,y);
        System.out.println("I am a child of derived class with value of z :"+z);
    }
}

public class cwh_45_inheritance {
    public static void main(String[] args) {
        // Creating an Object of base class
        Base b = new Base();

        System.out.println("************************************************");

        // Creating an object of derived class
        Derived dd = new Derived();
        System.out.println("**");
        Derived d = new Derived(4,9);

        System.out.println("*************************************************");

        // Creating an object of child of derived class
        derived1 d1 = new derived1();
        System.out.println("**");
        derived1 d2 = new derived1(12,52,63);




    }
}



// Answer
I am a base class Constructor
************************************************
I am a base class Constructor
I am derived class constructors
**
I am a base class Constructor with value of a :4
I am derived class constructors with value of b as :9
*************************************************
I am a base class Constructor
I am derived class constructors
I am a child of derived class 
**
I am a base class Constructor with value of a :12
I am derived class constructors with value of b as :52
I am a child of derived class with value of z :63
