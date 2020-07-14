package json.demo.JsonModel;

/**
 * Create By C on 2020-07-03
 */


public class Root {
    private Message message = new Message();

    public void setMessage(Message message) {
        this.message = message;
    }

    public Message getMessage() {
        return this.message;
    }


    @Override
    public String toString() {
        return "{" +
                "message=" + message +
                '}';
    }
}
