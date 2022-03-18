class Student{
    private int sid;
    private String sname;
    private int sage;

    //Getter and Setter methods
    public int getsid(){
        return sid;
    }

    public String getsname(){
        return sname;
    }

    public int getsage(){
        return sage;
    }

    public void setsage(int newValue){
        sage = newValue;
    }

    public void setsname(String newValue){
        sname = newValue;
    }

    public void setsid(int newValue){
        sid = newValue;
    }
}
public class q2{
    public static void main(String args[]){
         Student obj = new Student();
         obj.setsname("keyur");
         obj.setsage(21);
         obj.setsid(181937);
         System.out.println("Employee Name: " + obj.getsname());
         System.out.println("Employee sid: " + obj.getsid());
         System.out.println("Employee Age: " + obj.getsage());
    } 
}