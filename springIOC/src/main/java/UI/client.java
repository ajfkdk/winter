package UI;

import Spring.Config.Configuration;
import Spring.dao.impl.AccountDaoimpl;
import Spring.service.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import Spring.service.impl.IAccountServiceimpl;
import Spring.service.impl.testService2;

public class client {
    static ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configuration.class);
    public static void main(String[] args) {
        test07();
    }
    public static void test01() {

        IAccountServiceimpl service = applicationContext.getBean("Spring.service", IAccountServiceimpl.class);
        AccountDaoimpl daoimpl = applicationContext.getBean("Spring.dao", AccountDaoimpl.class);
        service.saveAccount();
        IAccountServiceimpl accountService = applicationContext.getBean("accountService", IAccountServiceimpl.class);

        System.out.println("static factory method");
        accountService.saveAccount();


        IAccountServiceimpl service2 = applicationContext.getBean("accountService2", IAccountServiceimpl.class);
        System.out.println("instance factory method:");
        service2.saveAccount();
    }
    public static void test02() {
        testService testservice1 = applicationContext.getBean("testService1", testService.class);
        testservice1.showData();

    }
    public static void test03() {
        testService2 service = applicationContext.getBean("testService2", testService2.class);
        service.show_data();
    }
    public static void test04() {
        testService3 service3 = applicationContext.getBean("testService3", testService3.class);
        service3.showdata();

    }
    public static void test05() {
        testService4 service4 = applicationContext.getBean("testService4", testService4.class);
        service4.runfunction();

    }

    public static void test06() {
        testService5 service5 = applicationContext.getBean("testService5", testService5.class);
        service5.showdate();
    }
    public static void test07() {
        testService6 service6 = applicationContext.getBean("testService6", testService6.class);
        service6.showjdbcProperties();
    }
}
