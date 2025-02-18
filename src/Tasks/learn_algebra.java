package Tasks;

import java.util.*;

public class learn_algebra {

    public static void taskAlgebra(int attempt) {
        Scanner input = new Scanner(System.in);
        String answerAction = "";

        System.out.println("Enter what you want to learn? \n" +
                "Multiplication, Divide, Addition, Subtraction. \n" +
                "---you can type just first later--");
        String action = input.nextLine().trim().toLowerCase();

        switch (action.charAt(0)) {
            case 'm' -> answerAction = "*";
            case 'd' -> answerAction = "/";
            case 'a' -> answerAction = "+";
            case 's' -> answerAction = "-";
            default -> {
                attempt++;
                System.out.println("Invalid action, try again \n" +
                        "_______________________________");
                if (attempt < 3) taskAlgebra(attempt);
                else {
                    wrongAnswer();
                }
            }
        }
        int number = 0;
        while (number < 2 || number > 10) {
            System.out.println("Choose number from 2 to 10");

            if (input.hasNextInt()) number = input.nextInt();
            else {
                input.next(); // Consume the invalid input
                System.out.println("Enter a number");
            }
        }
        algebraGame(number, answerAction);
    }

    private static void wrongAnswer() {
        Scanner input = new Scanner(System.in);

        System.out.println("WARNING!!! \n" +
                "You are 3 times type a wrong letter.\n" +
                "if you would like to continue type Y or Yes");
        String answer = input.nextLine();

        if (answer.equals("y") || answer.equals("yes")) {
            taskAlgebra(0);
        } else {
            System.out.println("Bay bay.");
            System.exit(0);
        }
    }

    private static void algebraGame(int number, String answerAction) {
        Scanner input = new Scanner(System.in);

        List<Integer> arrayNumbers = new ArrayList<>();
        int i = 0;

        for (int j = 1; j < 11; j++) arrayNumbers.add(j);
        Collections.shuffle(arrayNumbers);

        switch (answerAction) {
            case "*" -> System.out.println("Let's begin multiplication, first question:");
            case "/" -> System.out.println("Let's begin divide, first question:");
            case "+" -> System.out.println("Let's begin addition, first question:");
            case "-" -> System.out.println("Let's begin subtraction, first question: ");
        }

        while (i < arrayNumbers.size()) {
            int result = -1;
            int userAnswer = -1;

            switch (answerAction) {
                case "*": {
                    result = number * arrayNumbers.get(i);
                    System.out.println(number + " " + answerAction + " " + arrayNumbers.get(i) + " = ?");
                }
                break;
                case "/": {
                    result = arrayNumbers.get(i) * number / number;
                    System.out.println((arrayNumbers.get(i) * number) + " " + answerAction + " " + number + " = ?");
                }
                break;
                case "+": {
                    result = number + arrayNumbers.get(i);
                    System.out.println(number + " " + answerAction + " " + arrayNumbers.get(i) + " = ?");
                }
                break;
                case "-": {
                    result = arrayNumbers.get(i) * number - number;
                    System.out.println(arrayNumbers.get(i) * number + " " + answerAction + " " + number + " = ?");
                }
            }

            System.out.print("YOUR ANSWER: ");

            if (input.hasNextInt()) {
                userAnswer = input.nextInt();
            } else {
                input.next(); // Consume the invalid input
            }

            if (result == userAnswer) {
                arrayNumbers.remove(i);

                if (!arrayNumbers.isEmpty()) {
                    System.out.println("Great job! Keep going");
                    System.out.print("Next question: ");
                } else System.out.println("All tasks have been completed! " +
                        "\nCongratulations!");
            } else {
                System.out.println("It is wrong answer :( ");
                Collections.shuffle(arrayNumbers);
            }
        }
        repeatGame(number, answerAction);
    }

    private static void repeatGame(int number, String answerAction) {
        Scanner input = new Scanner(System.in);

        System.out.println("If you want to repeat enter R \n" +
                "If you want to go back Home enter H \n" +
                "If you want to exit enter Q.");

        var answer = input.nextLine().toLowerCase();
        answer = String.valueOf(answer.charAt(0));

        switch (answer) {
            case "r" -> algebraGame(number, answerAction);
            case "h" -> taskAlgebra(0);
            case "q" -> System.out.println("Goodbye!");
            default -> {
                input.next(); // Consume the invalid input
                System.out.println("Try one more time, if your answer will be wrong, game will end");
                repeatGame(number, answerAction);
            }
        }
    }
}
