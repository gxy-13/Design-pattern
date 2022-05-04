package com.himura.iterator;

// iterator 用来遍历集合中的元素
public interface Iterator {
    // 判断集合是否还有下一个元素
    public abstract boolean hasNext();
    // 获取集合中下一个元素，并且这个方法中隐含了将迭代器移动至下一位的操作
    public abstract Object next();
}
