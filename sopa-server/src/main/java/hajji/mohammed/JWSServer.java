package hajji.mohammed;

import jakarta.xml.ws.Endpoint;

public class JWSServer {

    public static void main(String[] args) {
        String url = "http://localhost:9090/";
        Endpoint.publish(url, new BanqueService());
        System.out.println("server JWS has started on: " + url);
    }
}