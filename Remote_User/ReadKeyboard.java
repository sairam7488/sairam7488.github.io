
private static final Scanner scanner = new Scanner(System.in);

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt(); // Read integer input

    if (n % 2 != 0) {
        // If n is odd
        System.out.println("Weird");
    } else {
        // If n is even
        if (n >= 2 && n <= 5) {
            // Even and in range 2 to 5
            System.out.println("Not Weird");
        } else if (n >= 6 && n <= 20) {
            // Even and in range 6 to 20
            System.out.println("Weird");
        } else if (n > 20) {
            // Even and greater than 20
            System.out.println("Not Weird");
        }
    }

    scanner.close(); // Close the scanner
}