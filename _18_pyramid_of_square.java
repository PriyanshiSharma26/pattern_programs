 class PyramidOfSquares {
    public static void main(String[] args) {
        int rows = 4; // Number of rows

        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("1 ");
            }
            System.out.println();
        }
    }
}
 
    
