import shiyan.Car.FastCar;
import shiyan.Configuration.configuration;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class carRoad {
    private AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(configuration.class);
    @Test
    public void testCar() {

//      get spring ioc context
        FastCar car = context.getBean("car", FastCar.class);
        car.showcar();

    }
//public static void main(String[] args) {
//
//    FastCar car = context.getBean("car", FastCar.class);
//    car.showcar();
//}
}
