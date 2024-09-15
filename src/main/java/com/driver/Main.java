package com.driver;

public class Main {

    public static class A {
        public String meth()
        {
            return "Invoking method from class A";
        }
    }

    public static class B extends A {
        public String meth()
        {
            return "Method is overridden in Extended class B";
        }
    }

    public static void main(String[] args) {
        B obj = new A();
        obj.meth();
        B obj1 = new B();
        obj1.meth();
    }
}
