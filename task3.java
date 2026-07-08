import java.util.Scanner;

public class AIChatBot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("      Welcome to AI ChatBot");
        System.out.println("Type 'bye' to exit.");
        System.out.println("==================================");

        while (true) {

            System.out.print("\nYou: ");
            String input = sc.nextLine().toLowerCase();

            if (input.equals("bye")) {
                System.out.println("Bot: Goodbye! Have a nice day.");
                break;
            } 
            else if (input.contains("hello") || input.contains("hi")) {
                System.out.println("Bot: Hello! How can I help you?");
            } 
            else if (input.contains("how are you")) {
                System.out.println("Bot: I'm doing great! Thanks for asking.");
            } 
            else if (input.contains("your name")) {
                System.out.println("Bot: My name is Java AI ChatBot.");
            } 
            else if (input.contains("java")) {
                System.out.println("Bot: Java is a powerful object-oriented programming language.");
            } 
            else if (input.contains("time")) {
                System.out.println("Bot: Sorry, I can't tell the current time in this basic version.");
            } 
            else if (input.contains("thank")) {
                System.out.println("Bot: You're welcome!");
            } 
            else if (input.contains("help")) {
                System.out.println("Bot: I can answer simple questions about greetings and Java.");
            } 
            else {
                System.out.println("Bot: Sorry, I didn't understand that.");
            }
        }

        sc.close();
    }
}