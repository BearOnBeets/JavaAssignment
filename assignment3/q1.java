import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
public class q1
{
    public static void main(String [] args)
    {
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(11, "qw");
        hmap.put(2, "er");
        hmap.put(33, "ty");
        hmap.put(9, "ui");
        hmap.put(3, "xy");
        System.out.println("For Loop:");
        for (Map.Entry me : hmap.entrySet()) {
          System.out.println("Key: "+me.getKey() + " & Value: " + me.getValue());
        }

        System.out.println("While Loop:");
        Iterator iterator = hmap.entrySet().iterator();
        while (iterator.hasNext()) {
             Map.Entry me2 = (Map.Entry) iterator.next();
          System.out.println("Key: "+me2.getKey() + " & Value: " + me2.getValue());
        } 
    }
}