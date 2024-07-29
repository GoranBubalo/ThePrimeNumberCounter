public class Main {

    public static void main(String[] args) {

        System.out.println("0 is " + (isPrime(0) ? "" : "NOT ") + "a prime number" );
        System.out.println("1 is " + (isPrime(1) ? "" : "NOT ") + "a prime number" );
        System.out.println("2 is " + (isPrime(2) ? "" : "NOT ") + "a prime number" );
        System.out.println("3 is " + (isPrime(3) ? "" : "NOT ") + "a prime number" );
        System.out.println("4 is " + (isPrime(4) ? "" : "NOT ") + "a prime number" );
        System.out.println("5 is " + (isPrime(5) ? "" : "NOT ") + "a prime number" );
        System.out.println("6 is " + (isPrime(6) ? "" : "NOT ") + "a prime number" );


    }

    public static boolean isPrime(int wholeNumber){

        //if statement
        if (wholeNumber <=2){
            return (wholeNumber ==2); // telling us that everything smaller than 2 is not a
                                      // prime number
        }


        //for loop
        /*Checks if the whole number is dividable with the divisor*/
        for (int divisor = 2; divisor < wholeNumber / 2 ; divisor++){
            //remainder operator
            if (wholeNumber % divisor ==0){
                return false;
            }
        }

        return true;
    }
}
