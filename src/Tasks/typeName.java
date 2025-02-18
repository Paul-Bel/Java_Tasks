package Tasks;

import java.util.Scanner;

public class typeName {
    public static void whatIsYourName() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please tell me your name");
        var userName = input.nextLine();
        System.out.println("Thank you, " + userName);
    }
}
