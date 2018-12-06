public class Main {

    public static void main(String[] args) {


        PerfectSquares(1);
        PerfectCubes(1);
        FibonacciSequence(0,1,1);
        PrimeNumbers(1,1);
        TriangleNumbers(1);

    }

    public static void PerfectSquares(int a) {
        while (a <= 10) {

            int output = (int)Math.pow(a, 2);
            System.out.print(output + " ");
            a = a + 1;
            System.out.print("First 10 perfect squares:"  );

        }
    }
    public static void PerfectCubes(int a){

        while (a<=10) {
            int output = (int)Math.pow(a, 3);
            System.out.print(output + " ");
            a = a + 1;
            System.out.print("First 10 perfect cubes:"  );

        }
    }
    public static void FibonacciSequence(int a,int b, int n) {
        while (n<=10){
            int output =a+b;
            System.out.print(output + " ");
            a=b;
            b=output;
            n=n+1;
            System.out.print("First 10 fibonacci sequence:"  );

        }

    }
    public static void PrimeNumbers(int a,int n){

        while(n<=10){
            while (a<30) {
                a++;
                boolean prime = true;
                int x = 1;
                while (x<=a/3) {
                    x=x+1;
                    if (a%x==0) {
                        prime = false;
                        break;
                    }
                }
                if (prime) {
                    System.out.print(a + " ");
                }
            }
            n=n+1;
            System.out.print("First 10 prime numbers:"  );

        }

    }

    public static void TriangleNumbers(int a){
        while (a<=10){
            int output = (a*(a+1))/2;
            System.out.print(output + " ");
            a=a+1;
            System.out.print("First 10 triangle numbers:" );

        }
    }
}