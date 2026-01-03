class Pattern1 {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) { // Loop for each row
            for (int j = 1; j <= n; j++) { // Loop for printing stars in each row
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}