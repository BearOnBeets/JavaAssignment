import java.util.*;

public class q1 {

    public static void main(String[] args) {

        List<String> argList = Arrays.asList(args);
        Collections.shuffle(argList);

        argList.stream()
        .forEach(e->System.out.format("%s ",e));
    }
}