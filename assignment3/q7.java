import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.LinkedHashMap;
import java.util.function.Function;
public class q7 {

    public static void main(String[] args) {
        String str="bbsdnvs";
        Map<Character, Long> collect =  str.chars().mapToObj(i -> (char)i).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        Optional<Character> firstNonRepeat = collect.entrySet().stream().filter( (e) -> e.getValue() == 1).map(e -> e.getKey()).findFirst();
        if(firstNonRepeat.isPresent()) {
            System.out.println("First non repeating:" + firstNonRepeat.get());
        }
        else{
            System.out.println("Every Char is repeating");
        }
    }
}