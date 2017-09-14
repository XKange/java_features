package designpattern;

public class SingletonTest {
    // 定义私有构造器
    private SingletonTest() {}
    private static SingletonTest test = new SingletonTest();
    public static SingletonTest getTest() {
        return test;
    }
    public static void main(String[] args) {
        SingletonTest.getTest();
    }
}
