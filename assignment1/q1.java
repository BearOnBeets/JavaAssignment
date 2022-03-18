public class q1 {
   public static void main(String args[]) {
      Animal tiger = new Tiger();
      tiger.eat();
      tiger.sleep();
      Cat lion = new Lion();
      lion.eat();
      lion.sleep();
   }
}
interface Animal {
   public void eat();
   public void sleep();
}
class Tiger implements Animal {
   public void eat(){
      System.out.println("Tiger eats");
   }
   public void sleep(){
      System.out.println("Tiger sleeps");
   }

}
abstract class Cat {
abstract public void eat();
public void sleep()
{
    System.out.println("cat sleeps");
}
}

class Lion extends Cat{
   public void eat(){
      System.out.println("Lion eats");
   }
}