import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.LinkedHashMap;
import java.util.function.Function;
public class q6 {

    public static void main(String[] args) {
        String str="bbcsdnvs";
        Map<Character, Long> collect =  str.chars().mapToObj(i -> (char)i).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        // collect.forEach( (x,y) -> System.out.println( "Key: " + x + " Val: " + y));

        Optional<Character> firstNonRepeat = collect.entrySet().stream().filter( (e) -> e.getValue() == 1).map(e -> e.getKey()).findFirst();
        // if(firstNonRepeat.isPresent()) {
        //     System.out.println("First non repeating:" + firstNonRepeat.get());
        // }
        Optional<Character> firstRepeat = collect.entrySet().stream().filter( (e) -> e.getValue() > 1).map(e -> e.getKey()).findFirst();
        System.out.println("First repeating:" + firstRepeat.orElse(null));
    }
}