import java.util.List;
import java.util.stream.Collectors;

public class Q12 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(15,89,45,5,6,74,8,35,1,2);
        List<Integer> n =  nums.stream()
                .filter(x -> x%2==0 & x>3 )
                .collect(Collectors.toList());
        System.out.println("even numbers greater than 3 are: " + n);
    }
}
