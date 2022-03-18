import java.util.*;

public class q3 {
    static void listTrim(List<String> strings) {
        for (ListIterator<String> lit = strings.listIterator(); lit.hasNext(); ) {
            lit.set(lit.next().trim());
        }
    }

    public static void main(String[] args) {
        List<String> l = Arrays.asList(" keyur ", " tejas ", " ojas ");
        listTrim(l);
        for (String s : l) {
            System.out.format("\"%s\"%n", s);
        }
    }
}