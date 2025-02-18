import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

import static Tasks.learn_algebra.taskAlgebra;
import static Tasks.multiplication_table.MultiplicationTable;
import static Tasks.typeName.whatIsYourName;
import static Tasks.yourLanguage.studentLanguage;

public class Main {
    public static void main(String[] args) {
        Scanner typeTask = new Scanner(System.in);
        int answer = 9;

        System.out.println("Enter the number of tasks you want to perform.\n" +
                "Task 1: What is your name\n" +
                "Task 2: Multiplication table\n" +
                "Task 3: Your language\n" +
                "Task 4: Learn algebra");

        Set<Integer> validValues = new HashSet<>();
        validValues.add(0);

        while (!validValues.contains(answer)) {
            System.out.print("Please enter a number: 1 or 2 or 3 or 4.\n" +
                    "For exit press 0: ");

            if (typeTask.hasNextInt()) {
                answer = typeTask.nextInt();
                switch (answer) {
                    case 1 -> whatIsYourName();
                    case 2 -> MultiplicationTable();
                    case 3 -> studentLanguage();
                    case 4 -> taskAlgebra(0);
                }
            }
            else {
                typeTask.next();
                System.out.println("You entered an incorrect value.\n" +
                        "Please try again.");
            }
        }
    }
}