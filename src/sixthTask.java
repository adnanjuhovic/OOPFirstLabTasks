import java.util.Scanner;
public class sixthTask {
    public static void main (String[] args) {
        Scanner scanner= new Scanner (System.in);
        System.out.println("Enter number one:");
        int numberOne=scanner.nextInt();

        System.out.println("Enter number two:");
        int numberTwo=scanner.nextInt();

        if (numberOne>numberTwo) {
            System.out.println("The first number is greater  " + numberOne);
        }

        else if (numberTwo>numberOne) {
            System.out.println("The second number is greater  " + numberTwo);

        }

        else if (numberOne==numberTwo) {
            System.out.println("The numbers are equal");
        }


    }

}