package com.tertiaryinfotech.day_2.module_11;

import java.util.*;

public class SetExample {
    public static void addVals(Set set) {
        set.add("Hello");
        set.add("World");
        set.add("Abc");
        set.add("Hello");
        set.add("Hello1");
        set.add("123");
        set.remove("Hello1");
    }

    public static void addVals(List set) {
        set.add("World");
        set.add("Hello");
        set.add("Abc");
        set.add("Hello");
        set.add("Hello1");
        set.add("123");
        set.remove("Hello1");
    }

    public static void main(String[] args) {
        HashSet hashSet = new HashSet<String>();
        TreeSet treeSet = new TreeSet<String>(new MyComp());
        LinkedList list = new LinkedList<String>();

        addVals(hashSet);
        addVals(treeSet);
        addVals(list);

        System.out.println("HashSet Contains Hello: " + hashSet.contains("Hello"));
        System.out.println("HashSet: " + Arrays.toString(hashSet.toArray()));
        System.out.println("TreeSet: " + Arrays.toString(treeSet.toArray()));
        System.out.println("LinkedList: " + Arrays.toString(list.toArray()));
//        System.out.println("Poll: " + list.poll());
//        System.out.println("Poll: " + list.poll());
//        System.out.println("Peek: " + list.peek());
//        System.out.println("Peek: " + list.peek());
//        list.offerFirst("First String");
//        list.offer("Last String");
//        System.out.println("LinkedList: " + Arrays.toString(list.toArray()));
    }
}

class MyComp implements Comparator<String> {

    @Override
    public int compare(String str1, String str2) {
        if (str1.compareTo(str2) != 0) {
            if (str1.charAt(0) == 'H') return -1;
            if (str2.charAt(0) == 'H') return 1;
        }
        return str1.compareTo(str2);
    }

}
