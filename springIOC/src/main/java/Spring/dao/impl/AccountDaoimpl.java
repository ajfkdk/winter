package Spring.dao.impl;

import Spring.dao.accountDao;
import org.springframework.stereotype.Component;

@Component
public class AccountDaoimpl implements accountDao {

    public void saveAccount() {
        System.out.println("here are Spring.dao's method");
    }
}
