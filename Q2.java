@FunctionalInterface
interface AddTwo
{
    int add(int a, int b);
}

public class Q2 {
    public static void main(String[] args) {
        int a = 56, b=88;
        AddTwo at = (int x, int y) -> x+y;
        int res = at.add(a,b);
        System.out.println("Result: " + res);
    }
}
