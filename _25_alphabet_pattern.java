 class AlphabetPyramid {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (char c = 'A'; c < 'A' + i; c++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}

