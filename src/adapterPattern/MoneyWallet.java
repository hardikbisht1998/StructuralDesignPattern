package adapterPattern;

//Adaptee class
public class MoneyWallet {
    int money;

    public MoneyWallet() {
    }

    int getMoney() {
        money = 300;//call to database
        return money;
    }
}
