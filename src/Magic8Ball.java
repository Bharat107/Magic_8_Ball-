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
            System.out.println("Hello, I am the Magic8Ball!\nWhat answers do you seek from me?");
            System.out.println("Ask me any yes or no question to learn about your fate!");
            question = keyboard.nextLine();
            testing = (int) (Math.random() * 100);
            System.out.println(question);







    }
}



