import clases.*;

// Consideraciones:
// Consumer: if productos != 0, entonces productos--
// Producer: if productos == 10, entonces producer sleep
// Consumer: if productos == 0, entonces prodecer wakeup

public class App {
    public static void main(String[] args) throws Exception {
        Buffer buffer = new Buffer(); 
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer); 
        
        Thread hilo1 = new Thread(producer); 
        Thread hilo2 = new Thread(consumer);
        // Thread hilo3 = new Thread(consumer); s

        hilo1.setName("Juan");
        hilo2.setName("Manuel");
        // hilo3.setName("Edgar");

        hilo1.start();
        hilo2.start();
        // hilo3.start();
    }
}
