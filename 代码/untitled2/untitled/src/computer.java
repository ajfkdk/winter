//    设计类
public class computer {
    //属性设置
    protected int pirce;
    private Object computer;

    //    方法设置
    public void sayhello() {
        System.out.println("hello !");
    }

    //访问器
    public int getPirce() {
        return pirce;
    }

    //设置器
    public void setPirce(int pirce) {
        this.pirce = pirce;
    }
//构造方法：用于构造一个类的方法


    public computer() {
    }

    public computer(int pirce) {
        this.pirce = pirce;
    }

    interface momo {
        public void momofun();
    }

    public class mobiy extends computer {
        void test() {
        }

        public mobiy() {
        }

        public mobiy(int pirce) {
            super(pirce);
        }
    }

    public void main(String[] args) {
        try {//估计try包括的代码块会异常
            computer computer =new mobiy();
        } catch (Exception e) {
//            发生了，某个异常执行的代码
            e.printStackTrace();
        } finally {
//            最后的结尾工作，关闭流什么的
        }

    }
    private void test() {

    }

}
abstract class 抽象类名{
    abstract void 抽象方法的方法名();

    void 方法名() {
        System.out.println('发');
    }
}
