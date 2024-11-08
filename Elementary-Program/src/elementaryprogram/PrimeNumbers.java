package elementaryprogram;
public class PrimeNumbers { // Test 1: find all prime numbers within n(2≦n≦1000000) 
    public static void main(String[] args) {
        int cnt = 0;
        for (int i = 2; i < 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + "\t");
                cnt++;
            }
        }
        System.out.println("\nThe number of primes is " + cnt);
    }

    public static boolean isPrime(int n) {        
        if (n < 2) return false;
        double sqrtN = Math.sqrt(n);

        for (int i = 2; i <= sqrtN; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

}

