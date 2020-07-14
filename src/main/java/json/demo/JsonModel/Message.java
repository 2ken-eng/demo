package json.demo.JsonModel;

/**
 * Create By C on 2020-07-03
 */
public class Message {
    private Extend extend;

    private Header header = new Header();

    private Body body = new Body();

    public void setExtend(Extend extend) {
        this.extend = extend;
    }

    public Extend getExtend() {
        return this.extend;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public Header getHeader() {
        return this.header;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Body getBody() {
        return this.body;
    }
}