public class Recursion1 {

    public static void printNum(int n){
        if(n == 0){
            return;
        }

        System.out.println(n);
        printNum(n-1);

    }

    public static void main(String args[]){
        int n = 5;
        printNum(n);
    }
}


//print Factorial of number n

class Recursion21 {

    public static int printFactorial(int n){

        if(n == 1 || n == 0){
            return 1;
        }

        int fact_nm1 = printFactorial(n-1);
        int fact_n = n * fact_nm1;
        return fact_n;
    }

    public static void main(String args[]){

        int n = 5;
        int ans = (printFactorial(n));

        System.out.println(ans);

    }

}


// print fibonacci series 

class Recursion3 {

    public static void printFibonacci(int a, int b, int n){

        if(n == 0){
            return;
        }
        int c = a+b;
        System.out.println(c);
        printFibonacci(b, c, n-1);
    }

    public static void main(String args[]){

        int a = 0, b = 1;

        System.out.println(a);
        System.out.println(b);
        int n = 7;
        printFibonacci(a, b, n-2);


    }

}
