package com.kevin.collections;

/**
 * @author caonanqing
 * @version 1.0
 * @description     ConcurrentHashMap源码分析
 * @createDate 2019/12/12
 */
public class ConcurrentHashMapSource {

    /**
     *
     * ConcurrentHashMap是HashMap的线程安全版本，内部也是使用（数组 + 链表 + 红黑树）的结构来存储元素。
     * 相比于同样线程安全的HashTable来说，效率等各方面都有极大地提高。
     *
     * 1、构造方法与HashMap对比：没有了HashMap中的threshold和loadFactor，而是改用了sizeCtl来控制，而且只存储了容量在里面。
     *      sizeCtl：
     *          -1：有线程在进行初始化操作。
     *          -(1+nThreads)：有n个线程正在一起扩容。
     *          0：默认值，在真正初始化时使用默认容量。
     *          >0 ：初始化或扩容完成后下一次的扩容门槛。
     *
     *
     * 存储结构：数组+链表+红黑树
     *
     */

    
}
