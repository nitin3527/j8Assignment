interface Programmer{
    public default void code(){
        System.out.println("I love coding");
    }
}
interface Gamer{
    public default void games(){
        System.out.println("I love playing games");
    }
}
public class Q8 implements Programmer,Gamer {
    public static void main(String[] args) {
        Q8 carrer = new Q8();
        System.out.println("Multiple inheritance through interface");
        carrer.code();
        carrer.games();
    }
}
