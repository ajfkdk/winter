package Spring.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

import java.util.Date;

@org.springframework.context.annotation.Configuration
@ComponentScan("Spring")
@PropertySource("classpath:jdbcConfig.properties")
public class Configuration {
    @Bean("now")
 public Date now() {
     return new Date();
 }
}
