package json.demo.JsonModel;

/**
 * Create By C on 2020-07-03
 */
public class Auth {
    private String callerid = "15255311009";

    private String macaddr;

    private String ipaddr;

    private String token;

    private String license = "Jmz_HISV12";

    public void setCallerid(String callerid) {
        this.callerid = callerid;
    }

    public String getCallerid() {
        return this.callerid;
    }

    public void setMacaddr(String macaddr) {
        this.macaddr = macaddr;
    }

    public String getMacaddr() {
        return this.macaddr;
    }

    public void setIpaddr(String ipaddr) {
        this.ipaddr = ipaddr;
    }

    public String getIpaddr() {
        return this.ipaddr;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getToken() {
        return this.token;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getLicense() {
        return this.license;
    }
}