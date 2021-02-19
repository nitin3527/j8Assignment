import java.util.List;
import java.util.Optional;

public class Q12 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(15,89,45,5,6,74,8,35,1,2);
            Optional<Integer> n =  nums.stream()
                .filter(x -> x%2==0 & x>3 )
                .findFirst();
        System.out.println("first even number greater than 3 are: " + n);
    }
}
