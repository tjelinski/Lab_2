public class Wallet {
    private double howMuchMoney; // liczba reprezentuje ilość pieniedzy tzn. ilość srodków [cecha]
    private String currency; // waluta w jakiej przechowywane sa środki w portfelu [cecha]

    public Wallet(double howMuchMoney, String currency) {   // konstruktor klasy wallet wywoływany przy tworzeniu nowego obiektu przyjmuje dwa argumenty howMuchMoney oraz currency
        this.howMuchMoney = howMuchMoney;
        this.currency = currency;
    }

    public void addMoney(double amount) { // metoda do dodawania pieniędzy do portfela
        howMuchMoney += amount;
    }

    public void subtractMoney(double amount) { // metoda do odejmowania pieniedzy z portfela
        if (howMuchMoney >= amount) {
            howMuchMoney -= amount;
        } else {
            System.out.println("You do not have enough money, change the amount to be paid out");
        }
    }

    public double getBalance() { // metoda zwracajaca saldo portfela
        System.out.println("Free funds: ");
        return howMuchMoney;
    }

    public String getCurrency() { //metoda zwracajaca walutę środków
        return currency;
    }

    public void newCurrency(String newCurrency) { // metoda pozwala na zmine waluty w portfelu
        currency = newCurrency;
    }

    public static void main(String[] args) {
        Wallet myWallet = new Wallet(0.0, " USD"); //tworzenie nowego obiektu z 0.00 USD
        myWallet.addMoney(50.5); // dodanie 50.5 USD
        myWallet.subtractMoney(32.7); // odjęcie  32.7 USD
        //System.out.println(myWallet.getBalance() + myWallet.getCurrency()); // wyświetlenie salda w atulanej walucie
        myWallet.subtractMoney(40); // odjecie 40 USD
        System.out.println(myWallet.getBalance() + myWallet.getCurrency());
    }
}

/*

// creation of a classroom framework

public class YourClass {
    private double yourVariableOne;
    private String yourVariableTwo;

    public Constructor[named like your class name](double yourVariableOne, String yourVariableTwo) {
        this.yourVariableOne = yourVariableOne;
        this.yourVariableTwo = yourVariableTwo;
    }

    public void methodOne(variableType declarateParameter) {
        yourVariableOne += declarateParameter;
    }

    public variableType methodTwo() {
        System.out.println("something to print if it is necessary: ");
        return yourVariableTwo;
    }

    public static void main(String[] args) {

        //code in method main

    }
}
 */
