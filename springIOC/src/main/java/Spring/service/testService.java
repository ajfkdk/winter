package Spring.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;
@Component
public class testService {
    @Value("zhangsan")
    private String name;
    @Value("#{15}")
    private String age;
    @Resource(name = "now")
    private Date birthday;

    public void showData() {
        System.out.println("name: "+name+"age:　"+age+"birthday: "+birthday);
    }
    public testService() {
    }

    public testService(String name, String age, Date birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
