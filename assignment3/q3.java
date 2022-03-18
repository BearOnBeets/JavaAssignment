
import java.util.*;
 
class q3 {

    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8,9);
        System.out.println("For Loop:");
        for (int i = 0; i < numbers.size(); i++)
            System.out.print(numbers.get(i) + " ");

        System.out.println("\nWhile Loop:");
        int i = 0;
        while (i < numbers.size())
            System.out.print(numbers.get(i++) + " ");

        System.out.println("\nAdvance For Loop:");
        for (Integer num : numbers)
            System.out.print(num + " ");
    }
}