class c {
    class c11 {
        void f1() {
            System.out.println("F1 in C11");
        }
    }
}

public class c1 {
    public static void main(String[] args) {
        c C = new c();
        c.c11 m = C.new c11();  // Corrected instantiation
        m.f1();
    }
}
