package adapterPattern;

public class AdapterTester {
    public void check() {
        MoneyWalletAdapter moneyWalletAdapter = new MoneyWalletAdapter(new MoneyWallet());
        LeetcodeStore leetcodeStore = new LeetcodeStore();
        leetcodeStore.checkAvailability(moneyWalletAdapter, 1);

        LeetcoinWallet leetcoinWallet = new LeetcoinWallet();
        leetcodeStore.checkAvailability(leetcoinWallet, 2);
    }
}
