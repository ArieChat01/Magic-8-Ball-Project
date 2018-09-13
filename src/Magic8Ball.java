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
        explanationGreeting = "Welcome to the Coding Magic 8 Ball! It's simple a question, then give me a number" +
                " and I will will predict your future.";
        userQuestion = "First, ask me a \"yes\" or \"no\"question.";
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
        System.out.println("\\ \\ \\ \\ \\ \\ \\ \\ Results \\ \\ \\ \\ \\ \\ \\ ");
        System.out.println();

        if (userNumber <= 10 && userNumber >= 0){
            System.out.println("1");
        }
       else if (userNumber <= 20 && userNumber >= 11){
            System.out.println("3");
       }
       else if (userNumber <= 30 && userNumber >= 21){
            System.out.println("4");
       }
       else if (userNumber <= 40 && userNumber >= 31){
            System.out.println("5");
       }
       else if (userNumber <= 50 && userNumber >= 41) {
            System.out.println("6");
       }
       else if (userNumber <= 60 && userNumber >= 51) {
            System.out.println("7");
       }
       else if (userNumber <= 70 && userNumber >= 61) {
            System.out.println("8");
       }
       else if (userNumber <= 80 && userNumber >= 71) {
            System.out.println("9");
       }
       else if (userNumber <= 90 && userNumber >= 81) {
            System.out.println("10");
       }
       else if (userNumber <= 100 && userNumber >= 91) {
            System.out.println("11");
       }




        }
    }
