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

        //scanner.close();

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
        System.out.println("First array :" + Arrays.toString(firstTab));
        System.out.println("Second array :" + Arrays.toString(secondTab));

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

        System.out.println("Clone/Copy of first array named third array");
        //https://stackoverflow.com/questions/5785745/make-copy-of-an-array
        int [] thirdTabClone = firstTab.clone();
        System.out.println("Clone array :" + Arrays.toString(thirdTabClone)); //wyświetlenie sklonowanej tablicy do 'stringa'
        // https://stackoverflow.com/questions/32806173/copying-arrays-the-right-way
        int [] thirdTabCopy = Arrays.copyOf(firstTab, firstTab.length);
        System.out.println("Copy array :" + Arrays.toString(thirdTabCopy)); //wyświetlenie kopiowanej tablicy do 'stringa'

        System.out.println("Enter number to compare with numbers in to the arrays: ");
        int number = scanner.nextInt();
        int [] fourTab = Arrays.stream(firstTab).filter(i -> i > number).toArray();
        //https://stackoverflow.com/questions/56289903/display-number-in-array-greater-than-45-onlyim-a-complete-beginner
        System.out.println("Elements of first array greater then your number:" + Arrays.toString(fourTab));

        System.out.println("We have 5 elements in first array, write witch element you want to remove from array: ");
        System.out.println("Our array :" + Arrays.toString(firstTab));
        int removeElement = scanner.nextInt();
        int [] fiveTab = Arrays.stream(firstTab).filter(i -> i != removeElement).toArray();
        System.out.println("New array without designated element of main array: " + Arrays.toString(fiveTab));

        int [] mergeArray = new int [firstTab.length + secondTab.length];
        System.arraycopy(firstTab, 0 , mergeArray, 0 ,firstTab.length);
        System.arraycopy(secondTab, 0 , mergeArray,firstTab.length , secondTab.length);
        Arrays.sort(mergeArray, 0 ,mergeArray.length);
        System.out.println("Merge array" + Arrays.toString(mergeArray));
        System.out.println("Find number of appearances of chosen number from merged array, please choose the number: ");
        int findNumber = scanner.nextInt();
        long counting = Arrays.stream(mergeArray).filter(i -> i == findNumber).count();
        System.out.println("Numbers of apperances of chosen number: " + findNumber + " is " + counting);


        scanner.close();
    }
}