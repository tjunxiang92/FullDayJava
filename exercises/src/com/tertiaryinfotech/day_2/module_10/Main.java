package com.tertiaryinfotech.day_2.module_10;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    // Class<?> c = o.getClass();
    public static void printName(Object obj) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> c = obj.getClass();
        System.out.println("========");
        System.out.println(c.getName());
        System.out.println(c.getSimpleName());
        System.out.println("========");

        if (obj instanceof Employee) {
            Method methCall = c.getDeclaredMethod("displayEmpDetails");
            // invokes the method at runtime
            methCall.invoke(obj);
        } else if (obj instanceof Olive) {
            Method methCall = c.getDeclaredMethod("toString", String.class, int.class);
            // Enable calls to private methods
            methCall.setAccessible(true);
            // invokes the method at runtime
            String text = (String) methCall.invoke(obj, "Hey", 123);
            System.out.println(text);
        }
        System.out.println();
    }

    public static Object createObj(Object o) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        // Creating an Object
        Constructor<?>[] constructors = o.getClass().getConstructors();
        Constructor<?> con = constructors[0];
        return con.newInstance(OliveName.PICHOLINE, 0xDDD);
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Olive o = new Olive(OliveName.PICHOLINE, 0x00FF00);
        printName(o);
        Employee emp = new Employee("Ally",5000);
        printName(emp);

        createObj(o);


//        System.out.println(c.isInstance(new Olive()));
//        Olive cc = (Olive) c.cast(new Olive());
//        System.out.println(cc.oliveName);
//        if (c.isInstance(new Olive()))
    }
}
