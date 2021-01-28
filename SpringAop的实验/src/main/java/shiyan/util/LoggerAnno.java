package shiyan.util;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component("logger")
@Aspect
public class LoggerAnno {
    @Pointcut("execution(* shiyan.Car.*.*(..))")
    private void pt1() {}
    @Before("pt1()")
    public void beforePrint() {
        System.out.println("前置通知： 车头被加强了");
    }
    @AfterReturning("pt1()")
    public void afterPrint() {
        System.out.println("后置通知： 车尾被加强了");

    }
    @AfterThrowing("pt1()")
    public void throwingPrint() {
        System.out.println("异常通知：　车辆出现异常");
    }
@After("pt1()")
    public void finallyPrint() {
        System.out.println("最后通知： 车辆到达终点");
    }

    public void aroundPringlog(ProceedingJoinPoint pjp) {
        try {
//            获取方法执行的参数
            Object[] args = pjp.getArgs();
            System.out.println("这里是前置方法");
            pjp.proceed(args);
            System.out.println("这里是后置方法");


        } catch (Throwable throwable) {
            System.out.println("这里是异常方法");
            throwable.printStackTrace();
        } finally {
            System.out.println("这里是最后方法");
        }

    }
}
