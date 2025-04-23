package oop;

class A{
    public A() {
        System.out.println("A Constructor calisti.");
    }

    public final void write(String s){
        System.out.println(s);
    }
}

class B extends A{
    public B() {
        System.out.println("B Constructor calisti.");
    }
//    public void write(String s){
//        System.out.println("B class'ının");
//    }
}

public class Constructer {
    public static void main(String[] args) {
        B b = new B();
        A a = new B();
    }
}
