interface Greeting {
    void sayHello();
}

public class Main_4 {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            public void sayHello() {
                System.out.println("Hello, World!");
            }
        };

        greeting.sayHello();
    }
}
