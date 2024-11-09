// Ex3: Find Mersenne Primes with p <= 100

import java.math.BigInteger;

public class MersennePrimes {

    public static void main(String[] args) {
        System.out.printf("%-10s%-30s%n", "p", "2^p - 1");
        System.out.println("---------------------------------------");

        for (int p = 2; p <= 100; p++) {
            BigInteger mersenne = BigInteger.valueOf(2).pow(p).subtract(BigInteger.ONE);

            if (mersenne.isProbablePrime(10)) {
                System.out.printf("%-10d%-30s%n", p, mersenne);
            }
        }
    }
}
    