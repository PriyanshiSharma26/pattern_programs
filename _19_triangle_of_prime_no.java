 class PrimeNumberTriangle {
    public static void main(String[] args) {
        int rows = 4; // Number of rows
        int num = 2; // First prime number

        for (int i = 1; i <= rows; i++) {
            int count = 0;
            while (count < i) {
                if (isPrime(num)) {
                    System.out.print(num + " ");
                    count++;
                }
                num++;
            }
            System.out.println();
        }
    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

