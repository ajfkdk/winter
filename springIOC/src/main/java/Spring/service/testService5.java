package Spring.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class testService5 {
    @Value("zhan")
    String name;
    @Value("#{12}")
    Integer age;
    public void showdate() {
        System.out.println(name+age);
    }
}
