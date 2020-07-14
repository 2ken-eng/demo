package json.demo.JsonModel;

import java.util.List;

/**
 * Create By C on 2020-07-03
 */
public class Body {
    private List<dataset> dataset;


    private Query query = new Query();

    public List<json.demo.JsonModel.dataset> getDataset() {
        return dataset;
    }

    public void setDataset(List<json.demo.JsonModel.dataset> dataset) {
        this.dataset = dataset;
    }

    public void setQuery(Query query) {
        this.query = query;
    }

    public Query getQuery() {
        return this.query;
    }
}