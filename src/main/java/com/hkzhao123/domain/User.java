package main.java.com.hkzhao123.domain;

import java.io.Serializable;

public class User implements Serializable {
    private String loginname;
    private String password;
    private String username;
    public User(){
        super();
    }
    public String getLoginname(){
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
