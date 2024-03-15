import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an inyteger: ");
        int number = input.nextInt();
        System.out.println("You entered " + number);

        // close scanner object
        input.close();

    }

}