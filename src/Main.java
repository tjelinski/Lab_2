// tjelinski@student.wsb-nlu.edu.pl
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //wprowadzanie zmiennych

        System.out.println("Enter 'int' vaule");
        int intVal = scanner.nextInt();
        System.out.println("Enter 'double' value");
        double doubleVal = scanner.nextDouble();
        System.out.println("Enter 'char' symbol");
        /*wprowadzanie char przy pomocy scanner
        https://stackoverflow.com/questions/13370053/how-to-read-an-input-file-char-by-char-using-a-scanner/13370154#13370154
         */
        char charSym = scanner.next().charAt(0);
        System.out.println("Set 'boolean' true or false");
        boolean booleanSet = scanner.nextBoolean();

        scanner.close();

        //wyswietlanie wprowadzonych zmiennych

        System.out.println("Your 'int': " + intVal);
        System.out.println("Your 'double': " + doubleVal);
        System.out.println("Your 'char': " + charSym);
        System.out.println("Your 'int': " + booleanSet);

        /*konwersja
        double na int*/

        System.out.println("Converting 'double' to 'int'");
        int conInt = (int) doubleVal;
        System.out.println("Result: " + conInt);

        //int na double

        System.out.println("Converting 'int' to 'double'");
        double conDouble = (double) intVal;
        System.out.println("Result: " + conDouble);

        //char na int

        System.out.println("Converting 'char' to 'int'");
        int conChar = (int) charSym;
        System.out.println("Result: " + conChar);

        //boolean na string

        System.out.println("Converting 'boolean' to 'string'");
        String conBoolean = String.valueOf(Boolean.parseBoolean(Boolean.toString(booleanSet)));
        System.out.println("Result: " + conBoolean);

        int [] firstTab= { 5, 3, 7, 21, 37};
        int [] secondTab= { 73, 12, 10, 8, 73};

        int sumFirstTab = Arrays.stream(firstTab).sum();
        int sumSecondTab = Arrays.stream(secondTab).sum();
        OptionalDouble avgFirstTab = Arrays.stream(firstTab).average();
        OptionalDouble avgSecondTab = Arrays.stream(secondTab).average();
        System.out.println("Sum first tab: " + sumFirstTab);
        System.out.println("Sum second tab: " + sumSecondTab);
        System.out.println("Agv first tab: " + avgFirstTab);
        System.out.println("Avg second tab: " + avgSecondTab);

        OptionalInt minFirstTab = Arrays.stream(firstTab).min();
        OptionalInt maxFirstTab = Arrays.stream(firstTab).max();
        System.out.println("Min value of first array :" + minFirstTab);
        System.out.println("Min value of first array :" + maxFirstTab);

        OptionalInt minSecondTab = Arrays.stream(secondTab).min();
        OptionalInt maxSecondTab = Arrays.stream(secondTab).max();
        System.out.println("Min value of second array :" + minSecondTab);
        System.out.println("Min value of second array :" + maxSecondTab);

        System.out.println("Clone of first array named third array");
        //https://stackoverflow.com/questions/5785745/make-copy-of-an-array
        int [] thirdTab = firstTab.clone();
        System.out.println("Clone array :" + Arrays.toString(thirdTab)); //wyświetlenie sklonowanej tablicy do ''stringa





    }
}