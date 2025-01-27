package org.example;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void out(String s) {
        System.out.println(s);
    }

    public static void out(int i) {
        System.out.println(i);
    }

    public static void out(Integer i1) {
        System.out.println("Vi er i Integer");
        System.out.println(i1);
    }

    public static void out(Class c) {
        out(c.getName());
        Method[] metArr = c.getMethods();
        for (var m : metArr) {
            out(m.getName());
        }
    }

    public static void main(String[] args) {
        out("Hello World");
        out(5);

        Integer ii = Integer.valueOf(5);
        out(ii);

        var i2 = Integer.parseInt("f0", 16);
        out(i2);

        var i3 = Integer.toBinaryString(7);
        out(i3);

        try {
            Integer ii3 = Integer.parseInt("45.4");
            out(ii3);

        } catch (Exception e) {
            out(e.getMessage());
            out(e.getClass());
        }

        //out(Main.class);
        //out(Integer.class);

        out('b');

        Set<Character> setChar = new HashSet<Character>();
        //var obj = setChar.add();
        char c = 'a';
        while (setChar.add(c)) {
            c++;
        }

        out('球');

        out(setChar.size());
    }

}