package clases;


public class Consumer implements Runnable{
    private Buffer buffer;
    
    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }
    public void run() {
        int value = 0;
        do{
            synchronized(buffer){
                value = buffer.consume();
                System.out.println(Thread.currentThread().getName() +  " consumio: " + value);
            }
        }while(value != 10);
         
    }
}
