import itheima.dao.IProductDao;
import itheima.dao.IUserDao;
import itheima.domain.Product;
import itheima.domain.UserInfo;
import itheima.domain.orders;
import itheima.service.IUserService;
import itheima.service.impl.IProductServiceimpl;
import itheima.service.impl.IUserServiceImpl;
import itheima.service.impl.OrderServiceimpl;
import itheima.util.dataUtil;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class demo {

    @Test
    public void test() throws Exception {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("application.xml");
        IProductServiceimpl service = ioc.getBean("service", IProductServiceimpl.class);
        List<Product> all = service.findAll();
        for (Product product : all) {
            System.out.println(product.toString());
        }
    }
    @Test
    public void test01() throws ParseException {
        dataUtil dataUtil = new dataUtil();
        String dateString = "2021/02/10 - 07:20";
        SimpleDateFormat format = new SimpleDateFormat("yyyy/mm/dd - HH:mm");
        Date parse = format.parse(dateString);
        System.out.println(parse);
    }

    @Test
    public void test02() {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("application.xml");
        IUserDao service = ioc.getBean("iUserdao", IUserDao.class);

        UserInfo order = service.findById(2);
        if (order == null) {
            System.out.println("没有找到信息");
        } else {
            System.out.println(order.toString());
        }


    }

    @Test
    public void test05() {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encode = encoder.encode("123123");
        System.out.println(encode);

    }

}
