package Tasks;

import java.util.Scanner;

public class yourLanguage {
    public static void studentLanguage() {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        var userName = input.nextLine();
        System.out.println(userName + ", what language are you using?");
        var language = input.nextLine();
        switch (language) {
            case "English" -> System.out.println("Your teacher Mr.Smith");
            case "Spanish" -> System.out.println("Your teacher Mr.Mart");
            case "Arabic" -> System.out.println("Your teacher Mr.Johns");
            case "Chinese" -> System.out.println("Your teacher Ms.Lee");
            case "Russian" -> System.out.println("Your teacher Ms.Anna");
            case "Ukrainian" -> System.out.println("Your teacher Ms.Hanna");
            case "French" -> System.out.println("Your teacher Mr.Deep");
            case "Italian" -> System.out.println("Your teacher Mr.Antonio");
            case "Turkish" -> System.out.println("Your teacher Mr.Aslan");
            case "German" -> System.out.println("Your teacher Mr.Becker");
            default -> System.out.println("Sorry, but we don't have teacher for your language");
        }
    }
}
