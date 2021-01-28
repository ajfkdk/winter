package Spring.service;

import org.springframework.stereotype.Component;

import java.util.Date;
@Component("testService3")

public class testService3 implements IAccountService {
    private Integer age;
    private String name;
    private Date birthday;

    public void showdata() {
        System.out.println(age+"   "+name+"    "+birthday);
    }



    public testService3(Integer age, String name, Date birthday) {
        this.age = age;
        this.name = name;
        this.birthday = birthday;
    }

    public testService3() {
        age=1;
        name = "zhangsan";
        birthday=null;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void saveAccount() {
        System.out.println("testService3333333333333333333333333");
    }
}
