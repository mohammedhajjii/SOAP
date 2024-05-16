
package hajji.mohammed.proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the hajji.mohammed.proxy package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _Account_QNAME = new QName("http://mohammed.hajji/", "account");
    private static final QName _ConvertEuroToDH_QNAME = new QName("http://mohammed.hajji/", "convertEuroToDH");
    private static final QName _ConvertEuroToDHResponse_QNAME = new QName("http://mohammed.hajji/", "convertEuroToDHResponse");
    private static final QName _GetAccountList_QNAME = new QName("http://mohammed.hajji/", "getAccountList");
    private static final QName _GetAccountListResponse_QNAME = new QName("http://mohammed.hajji/", "getAccountListResponse");
    private static final QName _GetCompte_QNAME = new QName("http://mohammed.hajji/", "getCompte");
    private static final QName _GetCompteResponse_QNAME = new QName("http://mohammed.hajji/", "getCompteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: hajji.mohammed.proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Account }
     * 
     * @return
     *     the new instance of {@link Account }
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link ConvertEuroToDH }
     * 
     * @return
     *     the new instance of {@link ConvertEuroToDH }
     */
    public ConvertEuroToDH createConvertEuroToDH() {
        return new ConvertEuroToDH();
    }

    /**
     * Create an instance of {@link ConvertEuroToDHResponse }
     * 
     * @return
     *     the new instance of {@link ConvertEuroToDHResponse }
     */
    public ConvertEuroToDHResponse createConvertEuroToDHResponse() {
        return new ConvertEuroToDHResponse();
    }

    /**
     * Create an instance of {@link GetAccountList }
     * 
     * @return
     *     the new instance of {@link GetAccountList }
     */
    public GetAccountList createGetAccountList() {
        return new GetAccountList();
    }

    /**
     * Create an instance of {@link GetAccountListResponse }
     * 
     * @return
     *     the new instance of {@link GetAccountListResponse }
     */
    public GetAccountListResponse createGetAccountListResponse() {
        return new GetAccountListResponse();
    }

    /**
     * Create an instance of {@link GetCompte }
     * 
     * @return
     *     the new instance of {@link GetCompte }
     */
    public GetCompte createGetCompte() {
        return new GetCompte();
    }

    /**
     * Create an instance of {@link GetCompteResponse }
     * 
     * @return
     *     the new instance of {@link GetCompteResponse }
     */
    public GetCompteResponse createGetCompteResponse() {
        return new GetCompteResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Account }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Account }{@code >}
     */
    @XmlElementDecl(namespace = "http://mohammed.hajji/", name = "account")
    public JAXBElement<Account> createAccount(Account value) {
        return new JAXBElement<>(_Account_QNAME, Account.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertEuroToDH }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConvertEuroToDH }{@code >}
     */
    @XmlElementDecl(namespace = "http://mohammed.hajji/", name = "convertEuroToDH")
    public JAXBElement<ConvertEuroToDH> createConvertEuroToDH(ConvertEuroToDH value) {
        return new JAXBElement<>(_ConvertEuroToDH_QNAME, ConvertEuroToDH.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertEuroToDHResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConvertEuroToDHResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://mohammed.hajji/", name = "convertEuroToDHResponse")
    public JAXBElement<ConvertEuroToDHResponse> createConvertEuroToDHResponse(ConvertEuroToDHResponse value) {
        return new JAXBElement<>(_ConvertEuroToDHResponse_QNAME, ConvertEuroToDHResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAccountList }{@code >}
     */
    @XmlElementDecl(namespace = "http://mohammed.hajji/", name = "getAccountList")
    public JAXBElement<GetAccountList> createGetAccountList(GetAccountList value) {
        return new JAXBElement<>(_GetAccountList_QNAME, GetAccountList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAccountListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://mohammed.hajji/", name = "getAccountListResponse")
    public JAXBElement<GetAccountListResponse> createGetAccountListResponse(GetAccountListResponse value) {
        return new JAXBElement<>(_GetAccountListResponse_QNAME, GetAccountListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCompte }{@code >}
     */
    @XmlElementDecl(namespace = "http://mohammed.hajji/", name = "getCompte")
    public JAXBElement<GetCompte> createGetCompte(GetCompte value) {
        return new JAXBElement<>(_GetCompte_QNAME, GetCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCompteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://mohammed.hajji/", name = "getCompteResponse")
    public JAXBElement<GetCompteResponse> createGetCompteResponse(GetCompteResponse value) {
        return new JAXBElement<>(_GetCompteResponse_QNAME, GetCompteResponse.class, null, value);
    }

}
