class PrimeNumber {
    static boolean isPrime(int n) {

        if (n <= 1)
            return false;
        for (int i = 2; i < n / 2; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    public static void main(String args[]) {
        // System.out.println(isPrime(101));
        if (isPrime(31) == true) {
            System.out.println("prime num");
        } else {
            System.out.println("not prime");
        }
    }
}