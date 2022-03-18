public class q3 {
    public static void main(String[] args){
        Thread t1 = new Thread(new fetchData(), "t1-FetchData");
        Thread t2 = new processData("t2-ProcessData");
        t1.start();
        try
        {
            t1.join();
        }
        catch(Exception ex)
        {
            System.out.println("Exception has " +
                                "been caught" + ex);
        }
        t2.start();
        try
        {
            t2.join();
        }
  
        catch(Exception ex)
        {
            System.out.println("Exception has been" +
                                    " caught" + ex);
        }
    }
    
}

class fetchData implements Runnable {

    @Override
    synchronized public void run() {
        System.out.println("STARTING "+Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("ENDING "+Thread.currentThread().getName());
    }
}


class processData extends Thread {

    public processData(String name) {
        super(name);
    }

    @Override
    synchronized public void run() {
        System.out.println("STARTING "+Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("ENDING "+Thread.currentThread().getName());
    }
    
}


