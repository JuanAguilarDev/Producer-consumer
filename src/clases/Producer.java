package clases;

// import java.util.Random;

public class Producer implements Runnable{
    private Buffer buffer;
    public Producer(Buffer buffer) {
        this.buffer = buffer; 
    } 


    public void run() {
        for (int i = 0; i <= 10; i++) {
            synchronized(buffer){
                buffer.produce(i);
                System.out.println(Thread.currentThread().getName() + " produjo: " + i);        
            }
        } 
    }
}
