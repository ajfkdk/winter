package Spring.service.impl;

import Spring.dao.impl.AccountDaoimpl;
import Spring.service.IAccountService;
import org.springframework.stereotype.Service;

@Service
public class IAccountServiceimpl implements IAccountService {
    Spring.dao.accountDao accountDao = new AccountDaoimpl();
    public void saveAccount() {
        accountDao.saveAccount();
    }
}
