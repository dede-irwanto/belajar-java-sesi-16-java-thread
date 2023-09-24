package programmer.zaman.now.thread;

public class SynchcronizedCounter {
    private Long value = 0L;

    public void increment() {
        synchronized (this) {
            value++;
        }
    }

    public Long getValue() {
        return value;
    }
}
