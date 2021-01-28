package UI;


import Spring.Config.Configuration;
import Spring.dao.impl.AccountDaoimpl;
import Spring.service.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import Spring.service.impl.IAccountServiceimpl;
import Spring.service.impl.testService2;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class client {
    static ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configuration.class);
    public  void test01() {

        IAccountServiceimpl service = applicationContext.getBean("iAccountServiceimpl", IAccountServiceimpl.class);
        AccountDaoimpl daoimpl = applicationContext.getBean("accountDaoimpl", AccountDaoimpl.class);
        service.saveAccount();
        IAccountServiceimpl accountService = applicationContext.getBean("accountService", IAccountServiceimpl.class);

        System.out.println("static factory method");
        accountService.saveAccount();


        IAccountServiceimpl service2 = applicationContext.getBean("accountService2", IAccountServiceimpl.class);
        System.out.println("instance factory method:");
        service2.saveAccount();
    }
    @Test
    public  void test02() {
        testService testservice1 = applicationContext.getBean("testService1", testService.class);
        testservice1.showData();

    }
    public  void test03() {
        testService2 service = applicationContext.getBean("testService2", testService2.class);
        service.show_data();
    }
    public  void test04() {
        testService3 service3 = applicationContext.getBean("testService3", testService3.class);
        service3.showdata();

    }
    @Test
    public  void test05() {
        testService4 service4 = applicationContext.getBean("testService4", testService4.class);
        service4.runfunction();

    }
    public  void test06() {
        testService5 service5 = applicationContext.getBean("testService5", testService5.class);
        service5.showdate();
    }
    public  void test07() {
        testService6 service6 = applicationContext.getBean("testService6", testService6.class);
        service6.showjdbcProperties();
    }
}

