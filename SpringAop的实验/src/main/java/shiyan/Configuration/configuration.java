package shiyan.Configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//告诉spring容器这个类是配置类
@Configuration
//告诉spring容器需要扫描到的包(默认为当前根下全部的包)
@ComponentScan("shiyan")
@EnableAspectJAutoProxy
public class configuration {

}
