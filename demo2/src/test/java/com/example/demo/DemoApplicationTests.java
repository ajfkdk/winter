package com.example.demo;

import com.example.demo.Car.sai;
import com.example.demo.Configuration.configuration;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(configuration.class);
        sai car = context.getBean("car", sai.class);
        car.carRuning();
    }

}
