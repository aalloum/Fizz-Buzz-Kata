import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class FizzBuzz {

    public String process(int input) {

        if (isMultipleOf3(input) && isMultipleOf5(input)) {
            return "FizzBuzz";
        }
        if (isMultipleOf3(input)) {
            return "Fizz";
        }
        if (isMultipleOf5(input)) {
            return "Buzz";
        }

        return Integer.toString(input);
    }

    private boolean isMultipleOf5(int input) {
        return input % 5 == 0;
    }

    private boolean isMultipleOf3(int input) {
        return input % 3 == 0;
    }

    public String processWithString(int input) {

        StringBuilder result = new StringBuilder();
        if (isMultipleOf3(input)) {
            result.append("Fizz");
        }
        if (isMultipleOf5(input)) {
            result.append("Buzz");
        }
        if (isNotMultipleOf3Nor5(result)) {
            result.append(Integer.toString(input));
        }

        return result.toString();

    }

    private boolean isNotMultipleOf3Nor5(StringBuilder result) {
        return result.length() == 0;
    }

    public String processGeneric(int input) {

        StringBuilder result = new StringBuilder();
        Map<Integer, String> map = new HashMap<>();
        map.put(3, "Fizz");
        map.put(5, "Buzz");
        map.put(7, "OLBATI");
        for (Map.Entry<Integer, String> pair : map.entrySet()) {
            if (input % pair.getKey() == 0) {
                result.append(pair.getValue());
            }
        }
        if (isNotMultipleOf3Nor5(result)) {
            result.append(Integer.toString(input));
        }

        return result.toString();
    }

}
