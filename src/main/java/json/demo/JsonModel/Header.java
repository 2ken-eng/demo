package json.demo.JsonModel;

/**
 * Create By C on 2020-07-03
 */
public class Header {
    private Servicecode servicecode;

    private Auth auth = new Auth();

    public void setServicecode(Servicecode servicecode) {
        this.servicecode = servicecode;
    }

    public Servicecode getServicecode() {
        return this.servicecode;
    }

    public void setAuth(Auth auth) {
        this.auth = auth;
    }

    public Auth getAuth() {
        return this.auth;
    }
}