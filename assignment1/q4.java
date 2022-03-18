class Message {
    private String text;
    private boolean isEmpty;

    public synchronized void write(String text) {
        while (isEmpty == false) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.text = text;
        isEmpty = false;
        notifyAll();
    }

    public synchronized String read() {
        while (isEmpty == true) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        String temp = text;
        isEmpty = true;
        notifyAll();
        return temp;
    }
}
class Writer implements Runnable {
    Message message;

    public Writer(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        message.write("Hello");
    }
}

class Reader implements Runnable {
    Message message;

    public Reader(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println(message.read());
    }
}

public class q4 {
    public static void main(String[] args) {
        Message message = new Message();
        Writer writer = new Writer(message);
        Reader reader = new Reader(message);
        Thread writerThread = new Thread(writer);
        Thread readerThread = new Thread(reader);
        writerThread.start();
        readerThread.start();
    }
}