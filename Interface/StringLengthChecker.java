
import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {
        Function<String, Integer> lengthChecker = String::length;

        String msg = "Hello Functional Interface";
        System.out.println("Length: " + lengthChecker.apply(msg));
    }
}
