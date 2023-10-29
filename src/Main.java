// tjelinski@student.wsb-nlu.edu.pl
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 'int' vaule");
        int intVal = scanner.nextInt();
        System.out.println("Enter 'double' value");
        double doubleVal = scanner.nextDouble();
        System.out.println("Enter 'char' symbol");
        char charSym = scanner.next().charAt(0);
        System.out.println("Set 'boolean' true or false");
        boolean booleanSet = scanner.nextBoolean();

        System.out.println("Your 'int': " + intVal);
        System.out.println("Your 'double': " + doubleVal);
        System.out.println("Your 'char': " + charSym);
        System.out.println("Your 'int': " + booleanSet);







    }
}