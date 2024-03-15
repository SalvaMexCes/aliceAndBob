package bobAndAlice;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
//Create a program that accepts one parameter and prints "Welcome Alice " or "Welcome Bob"
//If the name entered is Alice  then print "Welcome Alice "
//If the name entered is Bob  then print "Welcome Bob "
//If the name entered is NOT Alice or Bob..then keep asking for their name. USE A SCANNNER

        Scanner scanner = new Scanner(System.in);
        String name;

        do {
            System.out.println("What is your name?");
            name = scanner.nextLine();

            if (name.equalsIgnoreCase("Bob")) {
                System.out.println("Welcome Bob.");
                break;
            } else if ((name.equalsIgnoreCase("Alice"))) {
                System.out.println("Welcome Alice.");
                break;
                } else{
                System.out.println("Please try again. Wrong answer.");

            }
            }while (true) ;
        scanner.close();
    }
}
