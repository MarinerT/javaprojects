/* 
TODD MARINO
CS 505 851
ONLINE
ID: tm386 
*/

//HEADERS
import java.util.Scanner;
import java.lang.Math;

// SET UP TO RUN THE PROGRAM
public class ToddMarinoProject {
  public static void main(String[] args) {
    	
    //SETTING UP THE PROMPT FOR USER INPUT
    	Scanner tnum = new Scanner(System.in);
      	Double trial;
      	System.out.println("Number of Trials: ");
      	trial = tnum.nextDouble();
    
    //DECLARATIONS
    double pie = Math.PI;
    int tCount = 0;
    double x;
    double y;
    double XXYY;
     
    
    //FOR LOOP TO RUN THROUGH EACH ITERATION OF THE NUMBER OF TRIALS
    for(int i=1; i<trial; i++) { 	
      	x = Math.random();
   		y = Math.random();
      	XXYY = x*x + y*y;
      if (XXYY <= 1) {
       tCount++;   
     }
    }
    //OUTPUT
    System.out.println("The probability that a point will land in the inscribed quarter circle is approximately: " + tCount/trial + " or PI/4.");
    System.out.println("The approximate value of Pi is " + 4*tCount/trial + " based upon the " + trial + " trials conducted within this program.");
    System.out.println("The standard value of Pi is " +pie + ".");
    }
}

