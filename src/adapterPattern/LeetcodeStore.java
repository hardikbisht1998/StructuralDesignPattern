package adapterPattern;

import org.apache.commons.lang3.tuple.Pair;

import java.util.HashMap;
import java.util.Map;

//service
public class LeetcodeStore {

    Map<Integer, Pair<String, Integer>> productIdToProduct = new HashMap<>();

    public LeetcodeStore() {
        productIdToProduct.put(1, Pair.of("Hoody", 8000));
        productIdToProduct.put(2, Pair.of("Shirt", 6000));
        productIdToProduct.put(3, Pair.of("CAP", 2000));
        productIdToProduct.put(4, Pair.of("NotePad", 4500));
        productIdToProduct.put(5, Pair.of("Key Chain", 1000));
    }

    boolean checkAvailability(LeetcoinBalance leetcoinWallet, int productId) {
        int value = leetcoinWallet.getLeetCoins();
        if (value > productIdToProduct.get(productId).getValue()) {
            System.out.println("Sufficient Balance for Purchasing :" + productIdToProduct.get(productId).getKey());
        } else {
            System.out.println("Not Sufficient Balance for Purchasing :" + productIdToProduct.get(productId).getKey());
        }
        //check if product id is available or not

        return true;


    }
}
