package com.turntablG14;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws FileNotFoundException { //throws FileNotFoundException
	// write your code here
        //checked exception
        //readFile("myFile.txt");


        //unchecked exception
//        String name = "EDWARD";
//        printLength(null);
          printLength("edwardPearlAlex");
          printLength(null);

          //creating and list and adding numbers to the list

        // !! QUESTION FOR THE DAY !!
        // What kind of exception is this ?   A. Checked    B. UnChecked
        // C. RunTimeException    D. CompilerTimeException  E. Both B and C are the Same and is Right   F. Both A and D are the same and is Right

          List<Integer> myList2 = new ArrayList();
          myList2.add(6);
          myList2.add(8);
          myList2.add(78);


          try{
              System.out.println(myList2.get(6));
          }catch (IndexOutOfBoundsException e){
              System.out.println("please the list has only 3 members");
          }

    }


    //checked exception
    public  static void readFile(String fileName) throws FileNotFoundException {//throw exception in the method signature
       FileReader reader = new FileReader(fileName);

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
