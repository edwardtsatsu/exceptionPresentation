package com.turntablG14;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws FileNotFoundException { //throws FileNotFoundException
	// write your code here
        //checked exception, and this happens at compiler time !!
        try{
            readFile("myFile.txt");
        }catch (FileNotFoundException npm){
            System.out.println("please input a correct file");
        }


        //unchecked exception
//        String name = "EDWARD";
//        printLength(null);
//        printLength("edwardPearlAlex");
//        printLength(null);

          //creating and list and adding numbers to the list

        // !! QUESTION FOR THE DAY !!
        // What kind of exception is below ?   A. Checked    B. UnChecked
        // C. RunTimeException    D. CompilerTimeException  E. Both B and C are the Same and is Right   F. Both A and D are the same and is Right

//          List<Integer> myNumbers = new ArrayList();
//          myList2.add(6);
//          myList2.add(8);
//          myList2.add(78);
//
//
//          try{
//              System.out.println(myNumbers.get(6));
//          }catch (IndexOutOfBoundsException e){
//              System.out.println("please the list has only 3 members");
//          }

    }


    //checked exception, and this happens at compiler time !!
    public  static void readFile(String fileName) throws FileNotFoundException {// By adding throws decoration in the method signature
       FileReader reader = new FileReader(fileName);

    }


   //unchecked exception
//    public static void printLength(String myString){
//        try {
//            System.out.println(myString.length()); // this line of code prints the length of the input string
//        }catch (NullPointerException npe){
//            System.out.println("String can not be null");
//        }
//    }

}


// how java detect which part to throw exception
// NB: You can add "try catch block" to handle checked exception as you do same for unchecked exception as well !!
// As you???ve seen, there are lots of different things you should consider when you throw or catch an exception. Most of them have the goal to improve the readability of your code or the usability of your API.
//
//Exceptions are most often an error handling mechanism and
// a communication medium at the same time. You should, therefore,
// make sure to discuss the best practices and rules you want to apply
// with your coworkers so that everyone understands the general concepts
// and uses them in the same way.