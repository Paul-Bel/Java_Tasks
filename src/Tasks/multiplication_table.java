package Tasks;

public class multiplication_table {
    public static void MultiplicationTable() {
        // Display the table heading
        System.out.println("       Multiplication Table");

        // Display the number title
        System.out.print("    ");
        for (int j = 9; j <= 15; j++)
            System.out.print("  " + j);

        System.out.println("\n----------------------------------");

        // Print table body
        for (int i = 9; i <= 15; i++) {
            if ( i < 10 ) System.out.print(i + "  | ");
            else System.out.print(i + " | ");
            for (int j = 9; j <= 15; j++) {
                // Display the product and align properly
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
