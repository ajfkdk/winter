package Spring.service.impl;

import Spring.service.IAccountService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;
@Component
public class testService2 implements IAccountService {
    @Value("#{12}")
    private Integer age;
    @Value("tianjing")
    private String address;
    @Resource(name = "now")
    private Date birthday;
    public void show_data(){
        System.out.println(age+"   "+address+"   "+ birthday);
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
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

    public void saveAccount() {
        System.out.println("testService2++++++++++++++++");
    }
}
