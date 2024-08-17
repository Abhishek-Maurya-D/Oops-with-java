// import java.util.*;
// record Students(int rollno, String name, int age){}
// class StudentComparator implements Comparator<Students>
// {
//     @Override
//     public int compare(Students ss1, Students ss2){
//         if(ss1.age()<ss2.age())
//             return 1;
//         else if(ss1.age() == ss2.age())
//             return 0;
//         else
//             return -1;
//     }
// }
// public class A90{
//     public static void main(String[] args){
//         Students s1 = new Students(120,"Abhishek",34);
//         Students s2 = new Students(25,"Ankur",56);
//         Students s3 = new Students(12,"Akash",87);
//         Students s4 = new Students(52,"Ankit",43);
//         Students s5 = new Students(32,"Anubhav",16);
//         Students s6 = new Students(18,"Aakash",83);
//         Map<Students, String> map = new TreeMap<>(new StudentComparator());
//         map.put(s1,"B. Tech");
//         map.put(s2,"MCA");
//         map.put(s3,"B Sc.");
//         map.put(s4,"BBA");
//         map.put(s5,"BCA");
//         map.put(s6,"M. Tech");
        
//         for(var entry : map entrySet()){
//             Students key = entry getKey();
//             String s = entry.getVal();
//             System.out.println(key+" "+s);
//         }
//     }
// }












// import java.util.*;

// record Students(int rollno, String name, int age) {}

// class StudentComparator implements Comparator<Students> {
//     @Override
//     public int compare(Students ss1, Students ss2) {
//         if (ss1.age() < ss2.age())
//             return 1;
//         else if (ss1.age() == ss2.age())
//             return 0;
//         else
//             return -1;
//     }
// }

// public class A90 {
//     public static void main(String[] args) {
//         Students s1 = new Students(120, "Abhishek", 34);
//         Students s2 = new Students(25, "Ankur", 56);
//         Students s3 = new Students(12, "Akash", 87);
//         Students s4 = new Students(52, "Ankit", 43);
//         Students s5 = new Students(32, "Anubhav", 16);
//         Students s6 = new Students(18, "Aakash", 83);

//         Map<Students, String> map = new TreeMap<>(new StudentComparator());
//         map.put(s1, "B. Tech");
//         map.put(s2, "MCA");
//         map.put(s3, "B Sc.");
//         map.put(s4, "BBA");
//         map.put(s5, "BCA");
//         map.put(s6, "M. Tech");

//         for (var entry : map.entrySet()) {
//             Students key = entry.getKey();
//             String s = entry.getValue();
//             System.out.println(key + " " + s);
//         }
//     }
// }











import java.util.*;

class Students {
    private final int rollno;
    private final String name;
    private final int age;

    public Students(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    public int rollno() {
        return rollno;
    }

    public String name() {
        return name;
    }

    public int age() {
        return age;
    }

    @Override
    public String toString() {
        return "Students{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class StudentComparator implements Comparator<Students> {
    @Override
    public int compare(Students ss1, Students ss2) {
        return Integer.compare(ss2.age(), ss1.age());
    }
}

public class Map1 {
    public static void main(String[] args) {
        Students s1 = new Students(120, "Abhishek", 34);
        Students s2 = new Students(25, "Ankur", 56);
        Students s3 = new Students(12, "Akash", 87);
        Students s4 = new Students(52, "Ankit", 43);
        Students s5 = new Students(32, "Anubhav", 16);
        Students s6 = new Students(18, "Aakash", 83);

        Map<Students, String> map = new TreeMap<>(new StudentComparator());
        map.put(s1, "B. Tech");
        map.put(s2, "MCA");
        map.put(s3, "B Sc.");
        map.put(s4, "BBA");
        map.put(s5, "BCA");
        map.put(s6, "M. Tech");

        for (var entry : map.entrySet()) {
            Students key = entry.getKey();
            String s = entry.getValue();
            System.out.println(key + " " + s);
        }
    }
}
