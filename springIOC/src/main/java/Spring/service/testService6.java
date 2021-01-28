package Spring.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class testService6 {
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.user}")
    private String user;
    @Value("${jdbc.password}")
    private String password;
    public void showjdbcProperties() {
        System.out.println("url: "+url+" user: "+user+" password: "+password);
    }
}
