package itheima.domain;

public class menber {
    private Integer id;
    private String NAME;
    private String nickname;
    private String phoneNum;
    private String email;

    @Override
    public String toString() {
        return "menber{" +
                "id=" + id +
                ", NAME='" + NAME + '\'' +
                ", nickname='" + nickname + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public menber() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public menber(Integer id, String NAME, String nickname, String phoneNum, String email) {
        this.id = id;
        this.NAME = NAME;
        this.nickname = nickname;
        this.phoneNum = phoneNum;
        this.email = email;
    }
}
