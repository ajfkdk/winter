package Spring.service.factory;

import Spring.service.IAccountService;
import Spring.service.impl.IAccountServiceimpl;

public class InstanceFactory {
    public IAccountService createAccountService() {
        return new IAccountServiceimpl();
    }

}
