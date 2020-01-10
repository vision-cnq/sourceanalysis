package com.kevin.collections.list;

/**
 * @author caonanqing
 * @version 1.0
 * @description     LinkedList源码分析
 * @createDate 2019/12/2
 */
public class LinkedListSource {

    /**
     *
     * LinkedList是一个以双向链表实现的List，它除了作为List使用，还可以作为队列或者栈来使用。
     *
     * 1、LinkedList是一个以双链表实现的List；
     * 2、LinkedList还是一个双端队列，具有队列、双端队列、栈的特性；
     * 3、LinkedList在队列首尾添加、删除元素非常高效，时间复杂度为O(1)；
     * 4、LinkedList在中间添加、删除元素比较低效，时间复杂度为O(n)；
     * 5、LinkedList不支持随机访问，所以访问非队列首尾的元素比较低效；
     * 6、LinkedList在功能上等于ArrayList + ArrayDeque；
     *
     *
     * ArrayList代表了List的典型实现，LInkedList代表了Deque的典型实现，同时LinkedList也实现了List。
     *
     *
     * add()
     *      检查是否需要扩容，如果elementData等于DEFAULTCAPACITY_EMPTY_ELEMENTDATA则初始化容量大小为DEFAULT_CAPACITY；
     *
     * 存储结构：链表（Node）
     * 不支持随机访问，查询效率慢，增删效率高。
     *
     */
}
