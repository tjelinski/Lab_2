public class Wallet {
    private double howMuchMoney;
    private String currency;

    public Wallet(double howMuchMoney, String currency) {
        this.howMuchMoney = howMuchMoney;
        this.currency = currency;
    }

    public void addMoney(double amount) {
        howMuchMoney += amount;
    }

    public void subtractMoney(double amount) {
        if (howMuchMoney >= amount) {
            howMuchMoney -= amount;
        } else {
            System.out.println("You do not have enough money");
        }
    }

    public double getBalance() {
        return howMuchMoney;
    }

    public String getCurrency() {
        return currency;
    }

    public void newCurrency(String newCurrency) {
        currency = newCurrency;
    }

    public static void main(String[] args) {
        Wallet myWallet = new Wallet(0.0, "USD");
        myWallet.addMoney(50.5);
        myWallet.subtractMoney(32.7);
        System.out.println("Your current balance" + myWallet.getBalance() + myWallet.getCurrency());
        myWallet.subtractMoney(40);
        System.out.println(myWallet.getBalance());
    }
}


