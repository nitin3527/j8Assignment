import java.util.Locale;

@FunctionalInterface
interface UpperCaseStr
{
    String upperCase(String s1);
}

public class Q1_4 {
    public static void main(String[] args) {
        String str = "make this string in uppercase";
        UpperCaseStr up = (String st) -> str.toUpperCase();
        String result = up.upperCase(str);
        System.out.println("result: " + result);
    }
}
