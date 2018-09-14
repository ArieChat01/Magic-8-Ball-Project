import java.util.Scanner;

public class Magic8Ball {

    public static void main(String[] args) {

        int testing;
        Scanner keyboard;
        int userNumber;
        String userNumberQuestion, userQuestion;
        String userQuestionAnswer;
        String explanationGreeting;
        String magicBallMath;

        keyboard = new Scanner(System.in);
        explanationGreeting = "Welcome to the Coding Magic 8 Ball! It's simple. Ask a question, then give me a number" +
                " and I will will predict the future.";
        userQuestion = "First, ask me a \"yes\" or \"no\" question.";
        userNumberQuestion = "Now enter a number that you feel best relates to the question that you just asked." +
                "\n(Between 0 and 100)";
        magicBallMath = "Now, your future will be predicted...";

        System.out.println(explanationGreeting);
        System.out.println(userQuestion);
        userQuestionAnswer = keyboard.nextLine();
        System.out.println(userNumberQuestion);
        userNumber = keyboard.nextInt();
        System.out.println(magicBallMath);
        System.out.println();
        System.out.println("\\ \\ \\ \\ \\ \\ \\ Results \\ \\ \\ \\ \\ \\ \\");
        System.out.println();
        System.out.println("To your question: " + userQuestionAnswer + "\nThe Magic 8 Ball Predicts:");

        if (userNumber <= 10 && userNumber >= 0) {
            System.out.println("No! Never!");
        } else if (userNumber <= 20 && userNumber >= 11) {
            System.out.println("The odds are in your favor.");
        } else if (userNumber <= 30 && userNumber >= 21) {
            System.out.println("Without a doubt.");
        } else if (userNumber <= 40 && userNumber >= 31) {
            System.out.println("No. Just no. Don't ask. Just no.");
        } else if (userNumber <= 50 && userNumber >= 41) {
            System.out.println("Definitely. Unless it's murder, or drugs. Then no.");
        } else if (userNumber <= 60 && userNumber >= 51) {
            System.out.println("That could never be true.");
        } else if (userNumber <= 70 && userNumber >= 61) {
            System.out.println("The future is cluttered with the word yes. Wonder what that means.");
        } else if (userNumber <= 80 && userNumber >= 71) {
            System.out.println("Not in a million years.");
        } else if (userNumber <= 90 && userNumber >= 81) {
            System.out.println("My sources say no. And my sources are good.");
        } else if (userNumber <= 100 && userNumber >= 91) {
            System.out.println("Signs point to yes. Especially the signs that have yes written on them.");
        }

        else if (userNumber > 100) {
            System.out.println("\nError!Error! \nCannot predict right now (due to your lack of following instructions).");
            System.out.println(explanationGreeting);
            System.out.println("\n Question: " + userQuestionAnswer);
            System.out.println("\n" + userNumberQuestion);
            userNumber = keyboard.nextInt();
            System.out.println(magicBallMath);
            System.out.println();
            System.out.println("\\ \\ \\ \\ \\ \\ \\ Results \\ \\ \\ \\ \\ \\ \\");
            System.out.println();
            System.out.println("To your question: " + userQuestionAnswer + "\nThe Magic 8 Ball Predicts:");
            if (userNumber <= 10 && userNumber >= 0) {
                System.out.println("No! Never!");
            } else if (userNumber <= 20 && userNumber >= 11) {
                System.out.println("The odds are in your favor.");
            } else if (userNumber <= 30 && userNumber >= 21) {
                System.out.println("Without a doubt.");
            } else if (userNumber <= 40 && userNumber >= 31) {
                System.out.println("No. Just no. Don't ask. Just no.");
            } else if (userNumber <= 50 && userNumber >= 41) {
                System.out.println("Definitely. Unless it's murder, or drugs. Then no.");
            } else if (userNumber <= 60 && userNumber >= 51) {
                System.out.println("That could never be true.");
            } else if (userNumber <= 70 && userNumber >= 61) {
                System.out.println("The future is cluttered with the word yes. Wonder what that means.");
            } else if (userNumber <= 80 && userNumber >= 71) {
                System.out.println("Not in a million years.");
            } else if (userNumber <= 90 && userNumber >= 81) {
                System.out.println("My sources say no. And my sources are good.");
            } else if (userNumber <= 100 && userNumber >= 91) {
                System.out.println("Signs point to yes. Especially the signs that have yes written on them.");
            }
        }

        else if (userNumber < 0) {
            System.out.println("\n Error! Error! \nConcentrate (on the directions) and try again.");
            System.out.println(explanationGreeting);
            System.out.println("\n Question:" + userQuestionAnswer);
            System.out.println("\n" + userNumberQuestion);
            userNumber = keyboard.nextInt();
            System.out.println(magicBallMath);
            System.out.println();
            System.out.println("\\ \\ \\ \\ \\ \\ \\ Results \\ \\ \\ \\ \\ \\ \\");
            System.out.println();
            System.out.println("To your question: " + userQuestionAnswer + "\nThe Magic 8 Ball Predicts:");
            if (userNumber <= 10 && userNumber >= 0) {
                System.out.println("No! Never!");
            } else if (userNumber <= 20 && userNumber >= 11) {
                System.out.println("The odds are in your favor.");
            } else if (userNumber <= 30 && userNumber >= 21) {
                System.out.println("Without a doubt.");
            } else if (userNumber <= 40 && userNumber >= 31) {
                System.out.println("No. Just no. Don't ask. Just no.");
            } else if (userNumber <= 50 && userNumber >= 41) {
                System.out.println("Definitely. Unless it's murder, or drugs. Then no.");
            } else if (userNumber <= 60 && userNumber >= 51) {
                System.out.println("That could never be true.");
            } else if (userNumber <= 70 && userNumber >= 61) {
                System.out.println("The future is cluttered with the word yes. Wonder what that means.");
            } else if (userNumber <= 80 && userNumber >= 71) {
                System.out.println("Not in a million years.");
            } else if (userNumber <= 90 && userNumber >= 81) {
                System.out.println("My sources say no. And my sources are good.");
            } else if (userNumber <= 100 && userNumber >= 91) {
                System.out.println("Signs point to yes. Especially the signs that have yes written on them.");
            }

        }


    }
    }