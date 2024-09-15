package com.driver;

class A {
    public String meth() {
        return "Invoking method from class A";
    }
}

class B extends A {
    public String callSuperMeth() {
        return super.meth();
    }
    
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}

public class Main {
    public static void main(String[] args) {
        // Task 3: Create an object of class B and call method meth of class A with it
        B obj = new B();
        System.out.println("Calling method of class A with B object: " + obj.callSuperMeth());
        
        // Task 5: Call the overridden method from object of class B
        System.out.println("Calling overridden method with B object: " + obj.meth());
    }
}
