public class A {
    public static void main(String[] args) {
        //Anonymous Class
        new Thread(new Runnable(){
            public void run(){
                System.out.println("Thread using Functional interface");
            }
        }).start();
    }
}