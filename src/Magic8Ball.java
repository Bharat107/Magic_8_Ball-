import java.util.Scanner;

public class Magic8Ball {

    public static void main(String[]args){
        //declare
        Scanner keyboard;
        int testing;
        String question;
        boolean play = false;
        String Choice;



        //intialization phase
        keyboard = new Scanner(System.in);
        do {
            System.out.println("Hello, I am the Magic8Ball!\nDo you want to learn your fate?");
            System.out.println("Ask me any yes or no questions and I will answer them!");
            question = keyboard.nextLine();
            testing = (int) (Math.random() * 100);
            System.out.println(question);
            if (testing <= 10 && testing >= 0) {
                System.out.println("Signs point to yes.");
            } else if (testing > 10 && testing < 21) {
                System.out.print("Signs point to no.");
            }
            if (testing > 20 && testing <= 30) {
                System.out.println("It is certain.");
            } else if (testing > 30 && testing <= 40) {
                System.out.println("Don't count on it.");
            }
            if (testing >= 41 && testing <= 50) {
                System.out.println("As I see it, yes.");
            } else if (testing > 50 && testing <= 60) {
                System.out.println("My sources say no.");
            }
            if (testing >= 61 && testing <= 70) {
                System.out.println("Without a doubt.");
            } else if (testing > 70 && testing <= 80) {
                System.out.println("Very doubtful.");
            }
            if (testing >= 81 && testing <= 90) {
                System.out.println("You may rely on it.");
            } else if (testing > 90 && testing <= 100) {
                System.out.println("My reply is no.");
            }
            do {
                System.out.print("Would you like to play again?");
                System.out.print(" Type \"Y or N\"");
                Choice = keyboard.nextLine().toLowerCase();
                if (Choice.equalsIgnoreCase("y")) {
                    play = true;
                } else if (Choice.equalsIgnoreCase("n")) {
                    play = false; }



            } while (!Choice.equalsIgnoreCase("y") && !Choice.equalsIgnoreCase("n"));
        }while(play);
    }









}




