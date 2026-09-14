class Student {
    int age;
    String name;
}

public class DefaultConstructor {
    public static void main(String[] args) {
        Student st = new Student();
        System.out.println(st.age);  // 0
        System.out.println(st.name); // null
    }
    
}
