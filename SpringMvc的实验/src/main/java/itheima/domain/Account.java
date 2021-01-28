package itheima.domain;

import java.util.List;
import java.util.Map;

public class Account {
   private String username;
   private String password;
   private String money;
    private List<User> userList;
    private Map<String,User> userMap;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public Map<String, User> getUserMap() {
        return userMap;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", money='" + money + '\'' +
                ", userList=" + userList +
                ", userMap=" + userMap +
                '}';
    }

    public Account(String username, String password, String money, List<User> userList, Map<String, User> userMap) {
        this.username = username;
        this.password = password;
        this.money = money;
        this.userList = userList;
        this.userMap = userMap;
    }

    public Account() {
    }
}
