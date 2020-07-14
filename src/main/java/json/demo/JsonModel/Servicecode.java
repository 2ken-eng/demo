package json.demo.JsonModel;

/**
 * Create By C on 2020-07-03
 *
 * @author changtao
 */

public class Servicecode {
    private String apiurl;

    private String systemcode;

    private String version;

    private String busscode;

    public void setApiurl(String apiurl) {
        this.apiurl = apiurl;
    }

    public String getApiurl() {
        return this.apiurl;
    }

    public void setSystemcode(String systemcode) {
        this.systemcode = systemcode;
    }

    public String getSystemcode() {
        return this.systemcode;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getVersion() {
        return this.version;
    }

    public void setBusscode(String busscode) {
        this.busscode = busscode;
    }

    public String getBusscode() {
        return this.busscode;
    }
}