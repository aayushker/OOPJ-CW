class A{
    int money;
    private int pocketMoney; // private variable pocketMoney


    public int getPocketMoney(){   // getter method to access private variable pocketMoney
        return pocketMoney;
    }

    void fill(int money, int pocketMoney) { // constructor to initialize variables money and pocketMoney
        this.money = money;
        this.pocketMoney = pocketMoney;
    }
}

class B extends A{
    int total;
 
    void sum(){ // method to calculate total money by adding money and pocketMoney of class A
        total = money + getPocketMoney(); // accessing private variable pocketMoney using getter method of class A
    }
    
}

public class Inheritance2 {
    public static void main(String[] args) {
        B subob = new B(); // creating an object of class B
        subob.fill(10,12); // initializing variables money and pocketMoney using fill() method of class A 
        subob.sum(); // calling sum() method to calculate total money 
        System.out.println("Total money: " + subob.total); // printing the value of total money
    }   
}

// In this program, we have a class A with two variables money and pocketMoney. The variable pocketMoney is private, so we cannot access it directly in class B.
// To access the private variable pocketMoney, we have created a getter method getPocketMoney() in class A.
// In class B, we have a method sum() that calculates the total money by adding the money and pocketMoney of class A.
// To access the private variable pocketMoney, we use the getter method getPocketMoney() in the sum() method.
// Finally, in the main() method, we create an object of class B and initialize the variables money and pocketMoney using the fill() method of class A.
// We then call the sum() method to calculate the total money and print the value of total money.
// This program demonstrates how to access a private variable in a superclass from a subclass using a getter method.
// Output:
// Total money: 22
// In this output, the value of total money is 22, which is the sum of money (10) and pocketMoney (12) of class A. The private variable pocketMoney is accessed using the getter method getPocketMoney() in class B.
