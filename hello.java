import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get input int
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        System.out.println("Number entered :" + number);

        // Get input text
        System.out.print("Enter text: ");
        String myString = input.next();
        System.out.println("Text entered : " + myString);

        // close scanner object
        input.close();

    }

}