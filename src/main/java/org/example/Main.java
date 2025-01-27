package org.example;

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

    public static void main(String[] args) {
        out("Hello World");
        out(5);

        Integer ii = Integer.valueOf(5);
        out(ii);

        var i2 = Integer.parseInt("f0", 16);
        out(i2);


    }

}