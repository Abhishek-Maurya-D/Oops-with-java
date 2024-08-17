interface A{
    void f1();
    default void f2(){
        System.out.println("Default Method");
    }
}

class B implements A{
    public void f1(){
        System.out.println("Implementation of Default Method");
    }
}

public class Main{
    public static void main(String[] args) {
        A a = new B();
        a.f1();
        a.f2();
    }
}