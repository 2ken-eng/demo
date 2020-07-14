package json.demo.JsonModel;

import java.util.List;

/**
 * Create By C on 2020-07-03
 */
public class Query {
    private String sortfied;

    private List<Condition> condition;

    private String sortedtype;

    private String pagesize;

    private String pageno;

    public void setSortfied(String sortfied) {
        this.sortfied = sortfied;
    }

    public String getSortfied() {
        return this.sortfied;
    }

    public void setCondition(List<Condition> condition) {
        this.condition = condition;
    }

    public List<Condition> getCondition() {
        return this.condition;
    }

    public void setSortedtype(String sortedtype) {
        this.sortedtype = sortedtype;
    }

    public String getSortedtype() {
        return this.sortedtype;
    }

    public void setPagesize(String pagesize) {
        this.pagesize = pagesize;
    }

    public String getPagesize() {
        return this.pagesize;
    }

    public void setPageno(String pageno) {
        this.pageno = pageno;
    }

    public String getPageno() {
        return this.pageno;
    }
}
