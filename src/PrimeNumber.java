import java.util.Scanner;

public class PrimeNumber {

    /**
     * You only need to test up to the square root of a number as every composite number has at least one prime 
     * factor less than or equal to its square root
     * @param num
     * @return true if prime.
     */
    static boolean primeCheck(int num){
        if (num <= 1)
            return false;
        if (num <= 3)
            return true;
        
        for(int i=2; i*i<=num;i++){
            if(num%i==0)
                return false;
        }
        return true;
    }

    static void printPrime(int n)
    {
        for (int i = 2; i <= n; i++)
        {
            if (primeCheck(i))
                System.out.print(i + " ");
        }
    }


    public static void main (String[] args)
    {
        Scanner myInput = new Scanner( System.in );
        System.out.print( "Enter integer: " );
        int n = myInput.nextInt();
        printPrime(n);
    }
}
