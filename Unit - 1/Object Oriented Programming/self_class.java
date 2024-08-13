public class self_class {
    static int x;
    int y;

    public static void main(String args[]) {
        // Accessing the static variable x directly
        System.out.println(x);

        // Creating an instance of self_class to access the non-static variable y
        self_class obj = new self_class();
        obj.y = 1;
        System.out.println(obj.y);

        // Local variable z
        int z;
        z = 54;
        System.out.println(z);
    }
}
