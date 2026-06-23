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

class Recursion2 {

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
