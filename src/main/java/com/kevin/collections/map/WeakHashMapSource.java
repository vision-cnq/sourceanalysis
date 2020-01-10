package com.kevin.collections.map;

/**
 * @author caonanqing
 * @version 1.0
 * @description     WeakHashMap源码分析
 * @createDate 2019/12/12
 */
public class WeakHashMapSource {

    /**
     *
     * WeakHashMap是一种弱引用map，内部的key会存储为弱引用，当jvm gc的时候，如果这些key没有强引用存在的话，会被gc回收掉，
     * 下一次当我们操作map的时候会把对应的Entry整个删除掉，基于这种特性，WeakHashMap特别适用于缓存处理。
     * WeakHashMap没有实现Clone和Serializable接口，所以不具有克隆和序列化的特性。
     *
     * 1、WeakHashMap使用（数组 + 链表）存储结构；
     * 2、WeakHashMap中的key是弱引用，gc的时候会被清除；
     * 3、每次对map的操作都会剔除失效key对应的Entry；
     * 4、使用String作为key时，一定要使用new String()这样的方式声明key，才会失效，其它的基本类型的包装类型是一样的；
     * 5、WeakHashMap常用来作为缓存使用；
     *
     *
     * put()
     *      与HashMap不一样，HashMap是key为空时直接返回0，这里是直接当空对象计算。
     *      HashMap中是大于threshold才扩容，这里等于threshold就开始扩容了。
     *
     * resize()
     *      判断旧容量是否达到最大容量；
     *      新建新桶并把元素全部转移到新桶中；
     *      如果转移后元素个数不到扩容门槛的一半，则把元素再转移回旧桶，继续使用旧桶，说明不需要扩容；
     *      否则使用新桶，并计算新的扩容门槛；
     *      转移元素的过程中会把key为null的元素清除掉，所以size会变小；
     *
     * get()
     *      计算hash值，遍历所在桶对应的链表；
     *      如果找到了就返回元素的value值；
     *      如果没找到就返回空；
     *
     * remove()
     *      计算hash，找到所在的桶，遍历桶对应的链表；
     *      如果找到了就删除该节点，并返回该节点的value值；
     *      如果没找到就返回null；
     *
     * expungeStaleEntries()
     *      当key失效的时候gc会自动把对应的Entry添加到这个引用队列中；
     *      所有对map的操作都会直接或间接地调用到这个方法先移除失效的Entry，比如getTable()、size()、resize()；
     *      这个方法的目的就是遍历引用队列，并把其中保存的Entry从map中移除掉；
     *      从这里可以看到移除Entry的同时把value也一并置为null帮助gc清理元素。
     *
     * 存储结构：数组+链表
     *
     * 强引用：
     *  使用最普遍的引用。如果一个对象具有强引用，它绝对不会被gc回收。如果内存空间不足了，gc宁愿抛出OutOfMemoryError，也不是会回收具有强引用的对象。
     * 软引用：
     *  如果一个对象只具有软引用，则内存空间足够时不会回收它，但内存空间不够时就会回收这部分对象。只要这个具有软引用对象没有被回收，程序就可以正常使用。
     * 弱引用：
     *  如果一个对象只具有弱引用，则不管内存空间够不够，当gc扫描到它时就会回收它。
     * 虚引用：
     *  如果一个对象只具有虚引用，那么它就和没有任何引用一样，任何时候都可能被gc回收。
     *
     * 软（弱、虚）引用必须和一个引用队列（ReferenceQueue）一起使用，当gc回收这个软（弱、虚）引用引用的对象时，会把这个软（弱、虚）引用放到这个引用队列中。
     *
     * 比如，WeakHashMap的Entry<K,V>[] table是一个弱引用，它引用的对象是key，当key被回收时，Entry会被放到queue中。
     *
     */

}
