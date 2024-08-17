interface A {
    void f1();
    
    // Static Method
    static void f2() {
        System.out.println("F2 in A");
    }
    
    static void f3() {
        System.out.println("F3 in A");
    }
}

// class B implements A {
//     public void f1() {
//         System.out.println("Implementation of f1");
//     }
// }

public class Main {
    public static void main(String[] args) {
        // A a = new B();
        // a.f1();
        
        // Correct way to call static methods
        A.f2();
        A.f3();
    }
}
