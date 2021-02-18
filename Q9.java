import java.util.List;
import java.util.stream.Collectors;

public class Q9 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(15,89,45,5,6,74,26,8,45,66);
        List<Integer> n = nums.stream()
                .filter(x -> x%2==0)
                .collect(Collectors.toList());

        System.out.println("Even numbers in list are: " + n);
    }
}
