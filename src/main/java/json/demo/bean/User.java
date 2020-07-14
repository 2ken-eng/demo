package json.demo.bean;

import java.util.Date;

/**
 * Create By C on 2020-07-02
 *
 * @author changtao
 */


public class User {


    private Integer id;


    //    @Size(max=32,message="username is null")
    private String username;


    private String address;


    //    @JsonFormat(pattern = "yyyy/MM/dd HH/mm/ss")
    private Date birthday;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
