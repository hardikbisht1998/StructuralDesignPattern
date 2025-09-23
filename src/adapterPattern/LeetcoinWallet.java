package adapterPattern;


public class LeetcoinWallet implements LeetcoinBalance {
    int leetCoins;

    public LeetcoinWallet() {
    }

    @Override
    public int getLeetCoins() {
        //fetch the value from database
        leetCoins = 10;
        return 10;
    }
}
