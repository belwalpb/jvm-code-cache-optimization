/**
 * The PrimeNumberGenerator class generates a specified number of prime numbers.
 */
public class PrimeNumberGenerator {

    /**
     * The main method of the PrimeNumberGenerator class.
     * It takes a command-line argument specifying the total number of prime numbers to generate.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        int numbersToGenerate = Integer.parseInt(args[0]);
        generateNumbers(numbersToGenerate);
    }

    /**
     * Generates the specified number of prime numbers.
     *
     * @param totalNumbers The total number of prime numbers to generate.
     */
    private static void generateNumbers(int totalNumbers) {
        int totalPrimesGenerated = 1;
        int next = 2;
        while (totalPrimesGenerated <= totalNumbers) {
            next = getNextPrimeAbove(next);
            System.out.println("Next Prime Number: "+ next);
            totalPrimesGenerated++;
        }
    }

    /**
     * Finds the next prime number greater than the given previous number.
     *
     * @param previous The previous number.
     * @return The next prime number.
     */
    private static int getNextPrimeAbove(int previous) {
        Integer testNumber = previous + 1;
        while (!isPrime(testNumber)) {
            testNumber++;
        }
        return testNumber;
    }

    /**
     * Checks if the given number is prime.
     *
     * @param testNumber The number to test.
     * @return True if the number is prime, false otherwise.
     */
    private static boolean isPrime(Integer testNumber) {
        for (int i = 2; i < testNumber; i++) {
            if (testNumber % i == 0) return false;
        }
        return true;
    }
}
