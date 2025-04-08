
class prime {

    public static void main(String[] args) {
        int primeCount = 0;
        for (int i = 2; i <= 1000; i++) {
            boolean Prime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    Prime = false;
                    break;
                }
            }
            if (Prime) {
                System.out.println(i);
                primeCount++;
            }
        }
        System.out.println("Total number of prime numbers: " + primeCount);
    }
}
