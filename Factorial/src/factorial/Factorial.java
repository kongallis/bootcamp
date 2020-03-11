package factorial;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert a number");
        int number = input.nextInt();
        nFactorial(number);
        int product = recursionFactorial(number);
        System.out.println("Recursion Factorial of " + number + ": " + product);
       

    }

    static void nFactorial(int n) {
        int product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        System.out.println("The factorial of " + n + ": " + product);
        System.out.println("***************");
    }

    
    // RECURSION method:
    static int recursionFactorial(int n) {
        
        if (n != 1){
            return  n * recursionFactorial(n - 1);
        }else {
            return 1;
        }
        
        
       
        
       
    }
}
