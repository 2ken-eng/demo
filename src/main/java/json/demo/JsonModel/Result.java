package json.demo.JsonModel;

import java.util.List;

/**
 * Create By C on 2020-07-03
 */
public class Result {


    /**
     * 通用返回Root方法
     */
    public static Root getRoot(List<dataset> datasetList) {


        Body body = new Body();


        body.setDataset(datasetList);


        Root root = new Root();


        Message message = new Message();


        message.setBody(body);


        root.setMessage(message);


        return root;

    }


    public static Root getErrorRoot(String errorInfo) {

        Root root = new Root();


        Body body = new Body();


        Servicecode servicecode = new Servicecode();

        servicecode.setBusscode("-9");

        servicecode.setApiurl(errorInfo);
        Header header = new Header();

        header.setServicecode(servicecode);


        Message message = new Message();

        message.setHeader(header);


        root.setMessage(message);


        return root;

    }
}
