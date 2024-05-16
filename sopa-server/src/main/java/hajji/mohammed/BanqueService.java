package hajji.mohammed;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import java.util.Date;
import java.util.List;

@WebService(serviceName = "BWS")
public class BanqueService {

    private final List<Account> accountList;

    public BanqueService() {
        this.accountList = List.of(
                new Account(1, Math.random() * 6000, new Date()),
                new Account(2, Math.random() * 6000, new Date()),
                new Account(3, Math.random() * 6000, new Date())

        );
    }

    @WebMethod(operationName = "convertEuroToDH")
    public double conversion(@WebParam(name = "amount") double amount){
        return amount * 11;
    }


    @WebMethod
    public Account getCompte(@WebParam(name = "code") int code){
        return accountList.stream()
                .filter(account -> account.code == code)
                .findFirst()
                .orElse(null);
    }

    @WebMethod
    public List<Account> getAccountList(){
        return this.accountList;
    }

}
