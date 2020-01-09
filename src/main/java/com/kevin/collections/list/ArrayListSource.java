package com.kevin.collections;

/**
 * @author caonanqing
 * @version 1.0
 * @description     ArrayList源码分析
 * @createDate 2019/12/2
 */
public class ArrayListSource {

    /**
     *
     * ArrayList是一种以数组实现的List，与数组相比，它具有动态扩展的能力，因此也可称之为动态数组。
     *
     * 1、ArrayList内部使用数组存储元素，当数组长度不够时进行扩容，每次加一半的空间，ArrayList不会进行缩容；
     * 2、ArrayList支持随机访问，通过索引访问元素极快，时间复杂度为O(1)；
     * 3、ArrayList添加元素到尾部极快，平均时间复杂度为O(1)；
     * 4、ArrayList添加元素到中间比较慢，因为要搬移元素，平均时间复杂度为O(n)；
     * 5、ArrayList从尾部删除元素极快，时间复杂度为O(1)；
     * 6、ArrayList从中间删除元素比较慢，因为要搬移元素，平均时间复杂度为O(n)；
     * 7、ArrayList支持求并集，调用addAll(Collection<? extends E> c)方法即可；
     * 8、ArrayList支持求交集，调用retainAll(Collection<? extends E> c)方法即可；
     * 9、ArrayList支持求单向差集，调用removeAll(Collection<? extends E> c)方法即可；
     *
     *
     * 存储结构：数组
     * 支持随机访问，查询效率高，增删效率慢
     *
     */

}
