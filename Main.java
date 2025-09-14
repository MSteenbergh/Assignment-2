//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int score = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the capital of Romania?");

        String input = sc.nextLine();
        String correctAnswer = "Bucharest";

        if (input.equals(correctAnswer)) {
            System.out.println("You are correct, the capital of Romania is Bucharest");
            score++;
        } else {
            System.out.println("You are incorrect");
        }


        System.out.println("What is the capital of Vietnam?");
        String input2 = sc.nextLine();

        String correctAnswer2 = "Hanoi";

        if (input2.equals(correctAnswer2))
            System.out.println("Correct! The capital of Vietnam is Hanoi" + score++);
     else {
            System.out.println("You are incorrect");
        }

        System.out.println("What is the capital of Jamaica?");
        String input3 = sc.nextLine();
        String correctAnswer3 = "Kingston";


        if (input3.equals(correctAnswer3))
            System.out.println("Yes, the capital of Jamaica is Kingston" + score++);

        else {
            System.out.println("Sorry but that is incorrect");
        }

        System.out.println("You scored " + score + " out of 3");

sc.close();

    }

//What I learned: Errors appear for the simplest of things, I figured I could put the score++ in the other two statements like the 1st one but apparently that ruined the 2nd and 3rd statements.
}