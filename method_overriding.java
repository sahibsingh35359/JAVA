package com.company;

class A {


    public int sahib() {
        return 4;
    }

    public void meth2() {
        System.out.println("I am method 2 of class A");
    }
}

class B extends A {

    @Override
    // this is for indication but there is no use but if override is not performed in the program then this keyword gives an error;

    public void meth2() {  // when the extended class has the same name of methods is known as "Method overriding";
        System.out.println("I am method 2 of class B");
    }

    public void meth3() {
        System.out.println("I am method 3 of class B");
    }

}

public class method_overriding {
    public static void main(String[] args) {

        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2();
    }
}
