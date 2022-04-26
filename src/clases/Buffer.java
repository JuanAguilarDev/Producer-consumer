package clases;

public class Buffer {
    private int contents;
    private boolean available;

    public Buffer() {
        this.available = false;
    }

    public synchronized void produce(int value) {
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
                return;
            }
        }
        contents = value;
        available = true;
        notifyAll();
    }

    public synchronized int consume() {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                return -1;
            }
        }
        available = false;
        notifyAll();
        return contents;
    }

}
