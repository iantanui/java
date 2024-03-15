import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        int number = 1;

        // check if number is greater than 0
        if (number > 0) {
            System.out.println("The number is positive");
        }

        // if number is less than 0
        else if (number < 0) {
            System.out.print("The number is  negative");
        }

        // if both conditio is false
        else {
            System.out.println("The number is 0");
        }
    }

}