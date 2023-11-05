// tjelinski@student.wsb-nlu.edu.pl
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //wprowadzanie zmiennych za pomoca Scanner

        System.out.println("Enter 'int' vaule");
        int intVal = scanner.nextInt();
        System.out.println("Enter 'double' value");
        double doubleVal = scanner.nextDouble();
        System.out.println("Enter 'char' symbol");

        /* wprowadzanie char przy pomocy Scanner
        https://stackoverflow.com/questions/13370053/how-to-read-an-input-file-char-by-char-using-a-scanner/13370154#13370154
        charAt(0) pobranie pierwszego znaku z podanego łancucha, oczekujemy pojedynczego znaku, metoda next() wczyta cały łańcuch,
        .charAt(0) pozwala na pobranie pierwszego znaku a następnie przypisanie do zmiennej charSym. */

        char charSym = scanner.next().charAt(0);
        System.out.println("Set 'boolean' true or false");
        boolean booleanSet = scanner.nextBoolean();

        //scanner.close();

        //wyswietlanie wprowadzonych zmiennych

        System.out.println("Your 'int': " + intVal);
        System.out.println("Your 'double': " + doubleVal);
        System.out.println("Your 'char': " + charSym);
        System.out.println("Your 'int': " + booleanSet);

        //konwersja

        int conInt = (int) doubleVal;
        double conDouble = (double) intVal;
        int conChar = (int) charSym;

        /* Boolean.toString konwertuje zmienna booleanSet do łancuch zanaków string, Boolean.parseBoolean odczytuje łańcuch
        znaków z poprzedniego kroku i konwertuje do wartości logicznej, String.valueOf konwertuje wartość logiczna z poprzedniego
        kroku na stringa; otrzymujemy łańcuch znaków zawierający "true" lub "false" w oparciu o wartość logiczną zmiennej booleanSet
        eliminiując kroki możemy skonwertowaś zmienną bezposrednio
        String conBoolean = String.valueOf(booleanSet); */

        String conBoolean = String.valueOf(Boolean.parseBoolean(Boolean.toString(booleanSet)));

        //wyświetlanie konwertowanych danych

        System.out.println("Converting 'double' to 'int'");
        System.out.println("Result: " + conInt);
        System.out.println("Converting 'int' to 'double'");
        System.out.println("Result: " + conDouble);
        System.out.println("Converting 'char' to 'int'");
        System.out.println("Result: " + conChar);
        System.out.println("Converting 'boolean' to 'string'");
        System.out.println("Result: " + conBoolean);

        //tworzenie i inicjalizacja tablicy wraz z zawartością

        int [] firstTab= { 5, 3, 7, 21, 37};
        int [] secondTab= { 73, 12, 10, 8, 73};

        // wyswietlenie zawartosci tablic jako string

        System.out.println("First array :" + Arrays.toString(firstTab));
        System.out.println("Second array :" + Arrays.toString(secondTab));

        //operacje na tablicach

        int sumFirstTab = Arrays.stream(firstTab).sum(); //suma
        int sumSecondTab = Arrays.stream(secondTab).sum();
        OptionalDouble avgFirstTab = Arrays.stream(firstTab).average(); //średnia
        OptionalDouble avgSecondTab = Arrays.stream(secondTab).average();

        //wyświetlenie wyników operacji

        System.out.println("Sum first tab: " + sumFirstTab);
        System.out.println("Sum second tab: " + sumSecondTab);
        System.out.println("Agv first tab: " + avgFirstTab);
        System.out.println("Avg second tab: " + avgSecondTab);

        OptionalInt minFirstTab = Arrays.stream(firstTab).min();
        OptionalInt maxFirstTab = Arrays.stream(firstTab).max();
        System.out.println("Min value of first array :" + minFirstTab);
        System.out.println("Max value of first array :" + maxFirstTab);

        OptionalInt minSecondTab = Arrays.stream(secondTab).min();
        OptionalInt maxSecondTab = Arrays.stream(secondTab).max();
        System.out.println("Min value of second array :" + minSecondTab);
        System.out.println("Max value of second array :" + maxSecondTab);

        //kopiowani / klonowanie tablic

        System.out.println("Clone/Copy of first array named third array");

        /* https://stackoverflow.com/questions/5785745/make-copy-of-an-array
           https://stackoverflow.com/questions/32806173/copying-arrays-the-right-way */

        int [] thirdTabClone = firstTab.clone();
        int [] thirdTabCopy = Arrays.copyOf(firstTab, firstTab.length);
        System.out.println("Clone array :" + Arrays.toString(thirdTabClone)); //wyświetlenie sklonowanej tablicy do 'stringa'
        System.out.println("Copy array :" + Arrays.toString(thirdTabCopy)); //wyświetlenie kopiowanej tablicy do 'stringa'

        System.out.println("Enter number to compare with numbers in to the arrays: ");

        /* https://stackoverflow.com/questions/56289903/display-number-in-array-greater-than-45-onlyim-a-complete-beginner
           stworzenie strumienia, który pozwala na przekształacanie elementów sekwencyjnie lub równolegle, metoda .filter
           pozwala wybrac element wg okreslonego warunku tutaj elem. i > number po przefiltrowniu strumien konwertowany na
           tablicę za pomoca .toArray()
         */

        int number = scanner.nextInt();
        int [] fourTab = Arrays.stream(firstTab).filter(i -> i > number).toArray();
        System.out.println("Elements of first array greater then your number:" + Arrays.toString(fourTab));
        System.out.println("We have 5 elements in first array, write witch element you want to remove from array: ");
        System.out.println("Our array :" + Arrays.toString(firstTab));

        //usuniecie elementu z tablicy filtrujemy z warunku elem. i != removeElement

        int removeElement = scanner.nextInt();
        int [] fiveTab = Arrays.stream(firstTab).filter(i -> i != removeElement).toArray();
        System.out.println("New array without designated element of main array: " + Arrays.toString(fiveTab));

        // łączenie i wyszukiwnie w tablicach

        int [] mergeArray = new int [firstTab.length + secondTab.length]; //utworzenie nowej tablicy o 'liczbie elementów równej sumie długosci 1 i 2 tablicy'
        System.arraycopy(firstTab, 0 , mergeArray, 0 ,firstTab.length); //kopiowanie 1 tablicy od indeksu 0 do nowej tablicy i długości 1 tablicy
        System.arraycopy(secondTab, 0 , mergeArray,firstTab.length , secondTab.length); // kopiowanie 2 tablicy od indeksu konca 1 tablicy; elem. 2 talicy umieszczane za elem. 1
        Arrays.sort(mergeArray, 0 ,mergeArray.length);   //sortowanie tablicy
        System.out.println("Merge array" + Arrays.toString(mergeArray));
        System.out.println("Find number of appearances of chosen number from merged array, please choose the number: ");

        /* wykorzystanie strumienia do obliczenia liczby wystąpień wybranej liczby findNumber w tablicy mergeArray,
           operacja jest wykonywana poprzez filtrowanie tablicy i zliczenie pasujących elementów */

        int findNumber = scanner.nextInt();
        long counting = Arrays.stream(mergeArray).filter(i -> i == findNumber).count();
        System.out.println("Numbers of apperances of chosen number: " + findNumber + " is " + counting);

        scanner.close();
    }
}

