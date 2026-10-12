package problem2;

import java.util.Scanner;

public class QuizCorrector {
    public static void main(String[] args) {
        String repeat = "y";
        Scanner scan = new Scanner(System.in);
        while (repeat.equals("y")){
            System.out.println("Enter the number of qsts you want in quiz: ");
            int numQst = scan.nextInt();
            int[] correctAnswers = new int[numQst];
            int numCorrectAnswers=0;
            int answer;
            System.out.println("Enter the correct answer of all" + numQst + " qsts:  ");
            for (int i=0; i < numQst; i++) {
                correctAnswers[i] = scan.nextInt();
            }
            System.out.println("Your answer for all questions" + numQst+ " :  ");
            for (int i=0; i < numQst; i++) {

                answer = scan.nextInt();
                if (answer == correctAnswers[i]){
                    numCorrectAnswers++;
                }
            }

            System.out.println("Number of correct answers is: " + numCorrectAnswers);
            System.out.println("The percent of correct answers is: " + ( ((double) numCorrectAnswers/numQst)*100) + "%");
            System.out.println("Grade another quiz? (y/n)");
            repeat = scan.next();
        }
    }


}

