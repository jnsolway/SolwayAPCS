import school.*;

class Example {
    public static void main(String[] args) {
        Student s = new Student("John", "Doe", 1234);
        System.out.println(s.toString());
        Course c = new Course("Computer Science", "CS101", "Mr. Merrell", "L39B");
        System.out.println(c.toString());
    }
}