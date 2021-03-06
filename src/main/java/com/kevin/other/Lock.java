package com.kevin.other;

/**
 * @author caonanqing
 * @version 1.0
 * @description     各种锁简介
 * @createDate 2019/12/13
 */
public class Lock {


    /**
     *
     * synchronized
     *      java中的关键字，内部实现为监视器锁，主要是通过对象监视器在对象头中的字段来表明的。synchronized也是可重入锁。
     *      synchronized从旧版本到现在已经做了很多优化了，在运行时会有三种存在方式：偏向锁，轻量级锁，重量级锁。
     *      偏向锁：是指一段同步代码一直被一个线程访问，那么这个线程会自动获取锁，降低获取锁的代价。
     *      轻量级锁：是指当锁是偏向锁时，被另一个线程所访问，偏向锁会升级为轻量级锁，这个线程会通过自旋的方式尝试获取锁，不会阻塞，提高性能。
     *      重量级锁：是指当锁是轻量级锁时，当自旋的线程自旋了一定的次数后，还没有获取到锁，就会进入阻塞状态，该锁升级为重量级锁，重量级锁会使其他线程阻塞，性能降低。
     *
     * CAS
     *      CAS（Compare And Swap）它是一种乐观锁，认为对于同一个数据的并发操作不一定会发生修改，在更新数据的时候，尝试去更新数据，如果失败就不断尝试。
     *
     * volatile
     *      java中的关键字，当多个线程访问同一个变量时，一个线程修改了这个变量的值，其他线程能够立即看得到修改的值。
     *      volatile只保证可见性，不保证原子性，比如 volatile修改的变量 i，针对i++操作，不保证每次结果都正确，因为i++操作是两步操作，相当于 i = i +1，先读取，再加1，这种情况volatile是无法保证的。
     *
     * 自旋锁
     *      自旋锁：是指尝试获取锁的线程不会阻塞，而是循环的方式不断尝试，这样的好处是减少线程的上下文切换带来的开锁，提高性能，缺点是循环会消耗CPU。
     *
     * 分段锁
     *      分段锁：是一种锁的设计思路，它细化了锁的粒度，主要运用在ConcurrentHashMap中，实现高效的并发操作，当操作不需要更新整个数组时，就只锁数组中的一项就可以了。
     *
     * 可重入锁
     *      可重入锁：是指一个线程获取锁之后再尝试获取锁时会自动获取锁，可重入锁的优点是避免死锁。
     *
     *
     *
     */

}

