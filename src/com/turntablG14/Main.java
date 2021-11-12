package com.turntablG14;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws FileNotFoundException { //throws FileNotFoundException
	// write your code here
        //checked exception
        //readFile("myFile.txt");

        //unchecked exception
//        String name = "EDWARD";
//        printLength(null);
          addNumbers(-3,-5);
          printLength("edwardPearlAlex");
          printLength(null);

          //creating and list and adding numbers to the list

         // Question ?
         // What kind of exception is this ?   A. CHECKED    B. UNCHECKED  C. NONE OF THE ABOVE
//          ArrayList<Integer> myList2 = new ArrayList();
//          myList2.add(6);
//          myList2.add(8);
//          myList2.add(78);
//
//          try{
//              System.out.println(myList2.get(6));
//          }catch (IndexOutOfBoundsException e){
//              System.out.println("please the list has only 3 members");
//          }

    }


    //checked exception
    public  static void readFile(String fileName) throws FileNotFoundException {//throw exception in the method signature
       FileReader reader = new FileReader(fileName);

    }

    //checked exception
    public static void addNumbers(Integer num1, Integer num2){
        System.out.println(num1 + num2);
    }



   //unchecked exception
    public static void printLength(String myString){
        try {
            System.out.println(myString.length()); // this line of code prints the length of the input string
        }catch (NullPointerException npe){
            System.out.println("String can not be null");
        }
    }



}

// how java detect which part to throw exception
// there are sub