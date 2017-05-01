package com.example;

/**
 * Initial assignment for Nested Classes.
 * Created by MattyG on 5/1/17.
 */

public class Main2 {
    public static void main(String[] args) {
        Foo foo = new Foo() {
            @Override
            public boolean bar(String in) {
                if (in != null && in != " " && in != in.trim() && in.trim() != "") {
                    return true;
                }
                return false;
            }
        };

        System.out.println(foo.bar(null));
        System.out.println(foo.bar(""));
        System.out.println(foo.bar(" "));
        System.out.println(foo.bar("123ed "));
        System.out.println(foo.bar(" 123ed"));
        System.out.println(foo.bar(" x  "));
    }

    interface Foo {
        boolean bar(String in);
    }
}
