// public class student1{
//     public static void main(String[] args){
//         String name;
//         static String college;
//         void f1(){
//             String name;
//             String college;
//         }
//         static void f2(){
//             String name;
//             String college;
//         }
//     }
// }



public class static1 {
    static String college; // Static field should be declared at the class level

    public static void main(String[] args) {
        String name; // This is a local variable
        // college; // This line is unnecessary and should be removed

        f1(); // You can call static method directly
        f2();
    }

    void f1() {
        String name;
        String college;
    }

    static void f2() {
        String name;
        String college;
    }
}
