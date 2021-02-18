import java.util.List;

public class Q10 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(15,89,45,5,6,74,26,8,45,66,1,2);
        int n = nums.stream()
                .filter(x -> x>5)
                .reduce(0,(x,y) -> x+y );

        System.out.println("sum is: " + n);
    }
}
