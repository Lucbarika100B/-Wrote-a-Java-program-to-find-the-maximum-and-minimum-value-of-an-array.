//importing the Java Scanner Package;

import java.util.Scanner;

//creating a class that has same name of out file;

public class MaxAndMinArray {

  public static void main(String [] args) {

    //Printing a statement to tell the user to ask a number;

    System.out.print("please enter a number ? ");

    // Declaring a int count in order to use it later;

    int count;


    //Creating a new instance of scanner;

    Scanner scanObj = new Scanner(System.in);


    //User input == integer;
    count = scanObj.nextInt();


    //creating a while loop with a condition that will set array size to 0-15;
    while(count > 15 && count < 1) {
      System.out.print("please enter the numbers to store ? ");
      count = scanObj.nextInt();
    }
    int [] storeUserInput = new int[count];

    for(int i = 0; i < count; i++ ){
      System.out.print("Enter a number: ");

      // storing user input in an array;

      int number = scanObj.nextInt();

      storeUserInput[i] = number;
    }

    int max = storeUserInput[0];
    int min = storeUserInput[0];


    //Creating a forloop to loop over our array and return the max&min to user;

    for(int a = 0; a < count; a++){
      if(storeUserInput[a] > max){
        max = storeUserInput[a];
      }
      if(storeUserInput[a] < min){
        min = storeUserInput[a];
      }
    }

    //printing max & min values for the user;
    System.out.println("the minimum is :" +min);

    System.out.println("the maximum is:" +max);

  }


}

