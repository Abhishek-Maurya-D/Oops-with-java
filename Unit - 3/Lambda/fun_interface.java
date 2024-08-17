@FunctionalInterface
interface Funinterface {
    void abstractFun(int x);
}

public class fun_interface {
    public static void main(String[] args) {
        Funinterface fobj = (int x) -> System.out.println(2 * x);
        fobj.abstractFun(5);
    }
}
