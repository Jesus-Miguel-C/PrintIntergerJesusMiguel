import java.util.Scanner;

public class Main {
  //capture a interger form the keyboard
  public static void main (String[] args){
    //input form standar keyboard
    Scanner reader = new Scanner(System.in);
System.out.print("enter a number: ");
    
  //next declare an int variable to store the number
    float number = reader.nextFloat();

    //print in a line the number we entered
    System.out.println("You entered: " + number);
    reader.close();
  }
}