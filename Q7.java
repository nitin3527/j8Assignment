interface inter7 {
    public default void display(){
        System.out.println("Inside interface");
    }
}
public class Q7 implements inter7{
    @Override
    public void display() {
        System.out.println("Default function is overridden");
    }
    public static void main(String[] args) {
        Q7 q7 = new Q7();
        q7.display();
    }
}
