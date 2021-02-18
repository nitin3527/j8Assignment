interface MyCustomInterface{
    public default void display(){
        System.out.println("this is default method");
    }
    public static void staticMethod(){
        System.out.println("this is static method");
    }
}
public class Q6 implements MyCustomInterface {
    public static void main(String[] args) {
        Q6 inter = new Q6();
        inter.display();
        MyCustomInterface.staticMethod();
    }
}
