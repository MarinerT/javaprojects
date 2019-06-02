import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.Arrays;

/*I know the project called 'public static void sieve(int[] array) but I don't know what that means, and Codiva.io didn't accept it. */

public class MarinoProject3 {
  public static void main(String[] args) {
    
    //Asking for user input for an array
    Scanner scan = new Scanner(System.in);
    	System.out.println("Size of Array (from 1 to 1,000,000): ");
    	int n = scan.nextInt();
    	int[] sieveArr = new int[n];
    
    //populating the array
 	sieveArr = IntStream.range(1,sieveArr.length).toArray();
    
    //sieving through the array
    boolean prime[] = new boolean[n+1];
    for(int i=0;i<n;i++) 
            prime[i] = true;
    
    for(int i=2; i<= sieveArr.length; i++) {
            if(sieveArr[i] % i == 0) {
              prime[i] = false;
            }
    	for(int candidate = 2; candidate*candidate <=n; candidate++) 
        { 
          
            if(prime[candidate] == true) 
            { 
                for(i = candidate*2; i <= n; i += candidate) 
                    prime[i] = false; 
            }
        } 
          
        // Print numbers 
        for(i = 2; i <= n; i++) {
            if(prime[i] == true) 
              System.out.print(i + " "); 
        } 
 
//The rest of this is obviously wrong for the Goldbach portion.
    	int count = 0;
    	int n1 = 0, n2 = 0;
       	while (sieveArr[n1] + sieveArr[n2] <= n) {
            if (sieveArr[n1] + sieveArr[n2] == n) {
               System.out.println(n + " = " + sieveArr[n1] + " + " + sieveArr[n2]);
              n1++; 
              n2++;
            }
        }
    
         
    }
  }
  
}