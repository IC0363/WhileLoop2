public class countPrimes {
    public static void main(String[] args) {
        int primeCount = countPrime(24);
        System.out.println("The number of prime numbers from 2 to 24 is: " + primeCount);
    }
    public static int countPrime(int n) {
        int i = 2;
        int num = 0;


        if (n < 2) {
            return 0;
        }

        
        while (i <= n) {
            boolean isPrime = true;
            int e = 2;

            while (e < i){
                
                if (i % n == 0) {
                    isPrime = false;
                    break;
                }
                e++;
            }

            if (isPrime) {
                num++;
            }
            e++;
        }

        return num;
    }
    

    
}
