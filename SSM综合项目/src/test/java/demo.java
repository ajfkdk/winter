import itheima.dao.IProductDao;
import itheima.domain.Product;
import itheima.service.impl.IProductServiceimpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
}
