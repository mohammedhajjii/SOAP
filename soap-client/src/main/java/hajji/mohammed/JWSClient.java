package hajji.mohammed;

import hajji.mohammed.proxy.BWS;
import hajji.mohammed.proxy.BanqueService;

public class JWSClient {
    public static void main(String[] args) {

        BanqueService banqueService = new BWS().getBanqueServicePort();


        System.out.println("12 Euro to DH: " + banqueService.convertEuroToDH(12));
        System.out.println("--------------getAccount------------------");
        var account = banqueService.getCompte(1);
        System.out.println("code: " + account.getCode());
        System.out.println("amount: " + account.getAmount());
        System.out.println("creation date: " + account.getCreationDate());
        System.out.println("--------------getAccountList------------------");
        banqueService.getAccountList()
                .forEach(acc -> {
                    System.out.println("code: " + acc.getCode());
                    System.out.println("amount: " + acc.getAmount());
                    System.out.println("creation date: " + acc.getCreationDate());
                    System.out.println("---------------------------------");
                });
    }
}