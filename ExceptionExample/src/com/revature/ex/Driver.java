package com.revature.ex;

import java.util.Scanner;

public class Driver {
        public  void main(String[] args) {
            try {
                int[] partyPokemon = {1, 2, 3, 4, 5, 6,};
                System.out.println(partyPokemon[8]);
            }
            catch(Exception e ) {
                System.out.println("a party can only have 6 pokemon");
            }
            finally {
            System.out.println("the finally statement has run successfully");
        }
        Scanner userObj = new Scanner(System.in);
        
        int myInput;
        try {
            System.out.println("what is your favorite number?");
            myInput = userObj.nextInt();
            System.out.println("My favorite number is " + myInput);
        
        }
        catch (Exception e) {
            System.out.println("The data entered is invalid. Please input a number");
        }
        }
    
}
