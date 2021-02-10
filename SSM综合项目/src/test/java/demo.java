import itheima.dao.IProductDao;
import itheima.domain.Product;
import itheima.domain.orders;
import itheima.service.impl.IProductServiceimpl;
import itheima.service.impl.OrderServiceimpl;
import itheima.util.dataUtil;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
        OrderServiceimpl service = ioc.getBean("orderServiceimpl", OrderServiceimpl.class);

        orders order = service.findByid(2);
        if (order == null) {
            System.out.println("没有找到信息");
        } else {
            System.out.println(order.toString());
        }


    }
}
