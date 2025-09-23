package adapterPattern;

//Adapter class
public class MoneyWalletAdapter implements LeetcoinBalance {

    MoneyWallet moneyWallet;
    private final double exchangeRatio = 200;

    public MoneyWalletAdapter(MoneyWallet moneyWallet) {
        this.moneyWallet = moneyWallet;
    }

    @Override
    public int getLeetCoins() {
        return (int) exchangeRatio * moneyWallet.getMoney();
    }
}
