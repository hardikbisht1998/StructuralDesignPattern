package proxyPattern;

public class ProxyVault implements Asset {

    Gold gold;


    @Override
    public void evaluate() {
        if (checkAccess()) {
            if (gold == null) {
                gold = new Gold(10, 98);  // Initialize once
            }
            gold.evaluate();
        } else {
            System.out.println("Access denied: Unauthorized user.");
        }
    }

    private boolean checkAccess() {
        System.out.println("Checking owner authentication...");
        // Simulate authentication logic here (return true/false accordingly)

        boolean authenticated = true;
        if (authenticated) {
            System.out.println("Person access is authentic.");
            return true;
        }
        return false;
    }
}


