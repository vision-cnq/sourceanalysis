package com.kevin.collections;


/**
 * @author caonanqing
 * @version 1.0
 * @description     LinkedHashMapSource源码分析
 * @createDate 2019/12/9
 */
public class LinkedHashMapSource {

    /**
     *
     * LinkedHashMap内部维护了一个双向链表，能保证元素按插入顺序访问，也能以访问顺序访问，可以用来实现LRU缓存策略。
     * LinkedHashMap可以看成是HashMap+LinkedList。
     *
     * 添加删除元素时需要同时维护在HashMap中的存储，也要维护在LinkedList中的存储，所以性能比HashMap低。
     *
     * 1、LinkedHashMap继承自HashMap，具有HashMap的所有特性；
     * 2、LinkedHashMap内部维护了一个双向链表存储所有的元素；
     * 3、如果accessOrder为false，则可以按插入元素的顺序遍历元素；
     * 4、如果accessOrder为true，则可以按访问元素的顺序遍历元素；
     * 5、LinkedHashMap的实现非常精妙，很多方法都是在HashMap中留的钩子（Hook），直接实现这些Hook就可以实现对应的功能了，并不需要再重写put()等方法；
     * 6、默认的LinkedHashMap并不会移除旧元素，如果需要移除旧元素，则需要重写removeEldestEntry()方法设定移除策略；
     * 7、LinkedHashMap可以用来实现LRU缓存淘汰策略；
     *
     * get()
     *      如果查找到了元素，且accessOrder为true，则调用afterNodeAccess()把方法访问的节点移动到双向链表的末尾。
     *
     * afterNodeInsertion()
     *      如果evict为true，且头节点不为空，且确定移除最老的元素，那么就调用HashMap.removeNode()把头节点移除（这里的头节点是双向链表的头节点，而不是某个桶中的第一个元素）；
     *      HashMap.removeNode()从HashMap中把这个节点移除之后，会调用afterNodeRemoval()方法；
     *      afterNodeRemoval()方法在LinkedHashMap中也有实现，用来在移除元素后修改双向链表
     *      默认removeEldestEntry()方法返回false，也就是不删除元素。
     *
     * afterNodeAccess()
     *      在节点访问之后被调用，主要在put()已经存在的元素或get()时被调用，如果accessOrder为true，调用这个方法把访问到的节点移动到双向链表的末尾。
     *
     * put()、remove()
     *      继承使用HashMap的
     *
     *
     * LRU缓存策略(Least Recently Used)：优先淘汰最近最少使用的元素。
     *
     * 存储结构：数组+单链表+红黑树+双链表
     *
     */


}
