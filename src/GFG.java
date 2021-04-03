// A school method based Java program to
// check if a number is prime
import java.util.*;
import java.lang.*;
 
class GFG {
 
    // Check for number prime or not
    static boolean isPrime(int n)
    {
 
        // Check if number is less than
        // equal to 1
        if (n <= 1)
            return false;
 
        // Check if number is 2
        else if (n == 2)
            return true;
 
        // Check if n is a multiple of 2
        else if (n % 2 == 0)
            return false;
 
        // If not, then just check the odds
        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }
 
    // Driver code
    public static void main(String[] args)
    {
        long start = System.currentTimeMillis();
        int maxVal = 1000000;
        List<Integer> primes = new LinkedList<Integer>();
        for(int i=1; i<maxVal; i++) {
            if (isPrime(i)) {
                System.out.println(i + ": true");
                primes.add(i);
            } else {
                System.out.println(i + ": false");
            }
        }

        System.out.println();
        System.out.println("Prime numbers from 1 to " + maxVal + ":");
        for (int val : primes) {
            System.out.println("\t" + val);
        }

        long end = System.currentTimeMillis();
        System.out.println("Run Duration: " + (end-start) + " ms");
    }
}
 
// This code is contributed by Ronak Bhensdadia