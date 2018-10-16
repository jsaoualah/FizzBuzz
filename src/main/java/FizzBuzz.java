import java.util.Map;
import java.util.HashMap;

public class FizzBuzz {

    public String fizzBuzz(int input) {

        if (devidedBy3(input) && devidedBy5(input)) {
            return "FizzBuzz";
        }
        if (devidedBy3(input)) {
            return "Fizz";
        }
        if (devidedBy5(input)) {
            return "Buzz";
        }

        return Integer.toString(input);
    }

    public String fizzBuzzStr(int input) {

        StringBuilder result = new StringBuilder();
        if (devidedBy3(input)) {
            result.append("Fizz");
        }
        if (devidedBy5(input)) {
            result.append("Buzz");
        }
        if (isNotDevidedby3and5(result)) {
            result.append(Integer.toString(input));
        }

        return result.toString();

    }


    public String fizzBuzzGeneric(int input) {

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
        if (isNotDevidedby3and5(result)) {
            result.append(Integer.toString(input));
        }

        return result.toString();
    }

    private boolean devidedBy5(int input) {
        return input % 5 == 0;
    }

    private boolean devidedBy3(int input) {
        return input % 3 == 0;
    }

    private boolean isNotDevidedby3and5(StringBuilder result) {
        return result.length() == 0;
    }


}
