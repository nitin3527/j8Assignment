@FunctionalInterface
interface IncreaseByOne
{
    int calculate(int x);
}

public class Q1_2 {
    public static void main(String[] args) {
        int a = 5;
        IncreaseByOne ib = (int x) -> x+1;
        System.out.println("Result is: " + ib.calculate(a));
    }
}
