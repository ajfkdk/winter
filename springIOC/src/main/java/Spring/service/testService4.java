package Spring.service;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class testService4 {

    @Resource(name = "testService2")
    public  IAccountService service;
    public void runfunction() {
        service.saveAccount();
    }

}
