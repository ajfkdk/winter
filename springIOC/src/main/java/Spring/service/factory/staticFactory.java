package Spring.service.factory;

import Spring.service.impl.IAccountServiceimpl;

public class staticFactory {
    public static IAccountServiceimpl createAccountService(){
        return new IAccountServiceimpl();

    }

}
