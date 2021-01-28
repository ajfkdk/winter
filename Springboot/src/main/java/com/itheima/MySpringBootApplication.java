package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//入口：要加上注解：@SpringBootApplication(表示该类是springboot的引导类)
@SpringBootApplication
public class MySpringBootApplication {
//    main java程序的入口
    public static void main(String[] args) {
//        run方法 表示运行springBoot的引导类，run参数就是SpringBoot引导类的字节码对象
        SpringApplication.run(MySpringBootApplication.class);
    }
}
