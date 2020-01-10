package com.kevin.collections;

/**
 * @author caonanqing
 * @version 1.0
 * @description
 * @createDate 2020/1/9
 */
public class Other {

    /**
     * List
     *      ArrayList：（存储结构：数组）
     *          非线程安全。支持随机访问，查询效率高，增删效率慢。 ArrayList代表了List的典型实现
     *
     *      LinkedList：（存储结构：链表Node）
     *          非线程安全。不支持随机访问，查询效率慢，增删效率高。LInkedList代表了Deque的典型实现，同时LinkedList也实现了List。
     *
     *      CopyOnWriteArrayList：（存储结构：数组）
     *          线程安全。它是ArrayList的线程安全版本，内部也是通过数组实现，每次对数组的修改都完全拷贝一份新的数组来修改，
     *                  修改完了再替换掉老数组，这样保证了只阻塞写操作，不阻塞读操作，实现读写分离。
     *
     * Map
     *      HashMap：（存储结构：数组+链表+红黑树）
     *          非线程安全。且不保证元素存储的顺序，采用key/value存储结构，每个key对应唯一的value，查询和修改的速度都很快，能达到O(1)的平均时间复杂度。
     *
     *      LinkedHashMap：（存储结构：数组+单链表+红黑树+双链表）
     *          非线程安全。内部维护了一个双向链表，能保证元素按插入顺序访问，也能以访问顺序访问，可以用来实现LRU缓存策略。
     *                  LinkedHashMap可以看成是HashMap+LinkedList，添加删除元素时需要同时维护在HashMap中的存储，也要维护在LinkedList中的存储，所以性能比HashMap低。
     *
     *      TreeMap：（存储结构：红黑树）
     *          非线程安全。
     *
     *
     *      ConcurrentHashMap：（存储结构：数组+链表+红黑树）
     *          线程安全。是HashMap的线程安全版本，相比于同样线程安全的HashTable来说，效率等各方面都有极大地提高。（HashTable用一个锁，需要阻塞等待等。ConcurrentHashMap使用多种锁，效率提升。）
     *                  如果需要get之后判断是否为null，再put，建议使用putIfAbsent()。
     *
     *      WeakHashMap：（存储结构：数组+链表）
     *          非线程安全。WeakHashMap是一种弱引用map，内部的key会存储为弱引用，当jvm gc的时候，如果这些key没有强引用存在的话，会被gc回收掉，
     *              下一次当我们操作map的时候会把对应的Entry整个删除掉，基于这种特性，WeakHashMap特别适用于缓存处理。
     *              如果需要在多线程中使用：
     *                   WeakHashMap<String, String> weakHashMapintsmaze=new WeakHashMap<String, String>();
     *                   Map<String, String> intsmaze=Collections.synchronizedMap(weakHashMapintsmaze);
     *
     *
     *
     *
     *
     */

}
