package thread;

import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicInteger;

public class SynchronizedDemo {
    /**
     * Java早期只有内置锁，没有显示锁，好处是方便使用，不用解锁，但是功能也比较弱，不能超时或者设置公平锁。
     * 即使后来Java不停的在Concurrent包中增加新的并发类，但是synchronized依旧是程序员们的首选
     * 当然，C#虽然没有内置锁，但是却有async，await。
     */
    private BigInteger lastNumber = new BigInteger("0");

    public static void main(String[] args) {
        SynchronizedDemo synchronizedDemo = new SynchronizedDemo();
        synchronizedDemo.addNumber();
        synchronizedDemo.addNumber();
    }

    public synchronized void addNumber() {
        lastNumber = lastNumber.add(new BigInteger("1"));
    }
}
