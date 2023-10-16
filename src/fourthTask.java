import java.util.Scanner;
public class fourthTask {
    public static void main (String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter one number:");
        int numberOne=scanner.nextInt();

        System.out.println("Enter second number:");
        int numberTwo=scanner.nextInt();

        long result=numberOne+numberTwo;
        System.out.println("Sum of the two numbers is:"  +result);

        scanner.close();


    }
}
