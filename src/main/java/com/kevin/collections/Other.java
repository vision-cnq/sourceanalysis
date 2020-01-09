package com.kevin.other;

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
     *
     *
     *
     */

}
