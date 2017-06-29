package Controls;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created by X on 29.06.2017.
 */
public class Loop implements Runnable {
    Autoexp autoexp = new Autoexp();
    private volatile boolean cancelled;

    public void run() {
        while (!cancelled) {
            autoexp.exp();
            autoexp.exp2();
            System.out.println("work");
        }
    }

    public void start(){
        cancelled = false;
        run();
    }

    public void stop() {
        cancelled = true;
        run();
    }

}
