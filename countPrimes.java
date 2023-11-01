public class countPrimes {
    public static int countPrime(int n) {
        int i = 2;
        int num = 0;


        if (n < 2) {
            return 0;
        }

        
        while (i <= n) {
            boolean isPrime = true;
            int divisor = 2;

            while (divisor < i){
                
                if (i % divisor == 0) {
                    isPrime = false;
                    break;
                }
                divisor++;
            }

            if (isPrime) {
                num++;
            }
            i++;
        }

        return num;
    }
    

    public static void main(String[] args) {
        int primeCount = countPrime(24);
        System.out.println("The number of prime numbers from 2 to 24 is: " + primeCount);
    }
}
