
package hajji.mohammed.proxy;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.2
 * Generated source version: 3.0
 * 
 */
@WebService(name = "BanqueService", targetNamespace = "http://mohammed.hajji/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BanqueService {


    /**
     * 
     * @return
     *     returns java.util.List<hajji.mohammed.proxy.Account>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAccountList", targetNamespace = "http://mohammed.hajji/", className = "hajji.mohammed.proxy.GetAccountList")
    @ResponseWrapper(localName = "getAccountListResponse", targetNamespace = "http://mohammed.hajji/", className = "hajji.mohammed.proxy.GetAccountListResponse")
    @Action(input = "http://mohammed.hajji/BanqueService/getAccountListRequest", output = "http://mohammed.hajji/BanqueService/getAccountListResponse")
    public List<Account> getAccountList();

    /**
     * 
     * @param amount
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "convertEuroToDH", targetNamespace = "http://mohammed.hajji/", className = "hajji.mohammed.proxy.ConvertEuroToDH")
    @ResponseWrapper(localName = "convertEuroToDHResponse", targetNamespace = "http://mohammed.hajji/", className = "hajji.mohammed.proxy.ConvertEuroToDHResponse")
    @Action(input = "http://mohammed.hajji/BanqueService/convertEuroToDHRequest", output = "http://mohammed.hajji/BanqueService/convertEuroToDHResponse")
    public double convertEuroToDH(
        @WebParam(name = "amount", targetNamespace = "")
        double amount);

    /**
     * 
     * @param code
     * @return
     *     returns hajji.mohammed.proxy.Account
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCompte", targetNamespace = "http://mohammed.hajji/", className = "hajji.mohammed.proxy.GetCompte")
    @ResponseWrapper(localName = "getCompteResponse", targetNamespace = "http://mohammed.hajji/", className = "hajji.mohammed.proxy.GetCompteResponse")
    @Action(input = "http://mohammed.hajji/BanqueService/getCompteRequest", output = "http://mohammed.hajji/BanqueService/getCompteResponse")
    public Account getCompte(
        @WebParam(name = "code", targetNamespace = "")
        int code);

}