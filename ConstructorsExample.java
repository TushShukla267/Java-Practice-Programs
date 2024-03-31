class Student {
    private String name;
    private int age;

    // Default Constructor
    public Student() {
        this.name = "John Doe";
        this.age = 18;
    }

    // Parameterized Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ConstructorsExample {
    public static void main(String[] args) {
        // Creating objects using different constructors
        Student student1 = new Student(); // Using default constructor
        Student student2 = new Student("Alice", 20); // Using parameterized constructor

        // Displaying details of students
        System.out.println("Details of student1:");
        student1.displayDetails();

        System.out.println("\nDetails of student2:");
        student2.displayDetails();
    }
}