package com.tertiaryinfotech.day_2.module_10;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class CompletedChallenge {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Object o = new PTEmployee("Ally", 5000, 6.5);

        // Get Class Information
        System.out.println("===Class Information====");
        Class<?> c = o.getClass();
        Class<?> sup = c.getSuperclass();
        Class<?> top = sup.getSuperclass();
        System.out.println(c);
        System.out.println(sup);
        System.out.println(top);
        System.out.println();

        // Get Package Info
        System.out.println("===Package Information====");
        Package p = c.getPackage();
        System.out.println(p);
        System.out.println();

        // Get a list of methods and fields
        System.out.println("===Method Field Information====");
        Method[] methods = c.getMethods();
        Field[] fields = c.getFields();
        System.out.println(Arrays.toString(methods));
        System.out.println(Arrays.toString(fields));
        System.out.println();

        // Invoke method dynamically
        System.out.println("===Invoke Method====");
        System.out.println(fields[1].get(o));
//        // Enable calls to private methods
//        methCall.setAccessible(true);
        methods[0].invoke(o);
    }
}
