import java.util.Scanner;

class Student {
    String name;
    int id;
    int javaMarks;
    int dsaMarks;
    int dbmsMarks;
    int totalMarks;

    public Student(String name, int id, int javaMarks, int dsaMarks, int dbmsMarks) {
        this.name = name;
        this.id = id;
        this.javaMarks = javaMarks;
        this.dsaMarks = dsaMarks;
        this.dbmsMarks = dbmsMarks;
        this.totalMarks = javaMarks + dsaMarks + dbmsMarks;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getTotalMarks() {
        return totalMarks;
    }
}

class Exp2ArrayObject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            System.out.print("Name: ");
            scanner.nextLine(); // Consume the newline left by nextInt()
            String name = scanner.nextLine();
            System.out.print("ID: ");
            int id = scanner.nextInt();
            System.out.print("Marks in JAVA: ");
            int javaMarks = scanner.nextInt();
            System.out.print("Marks in DSA: ");
            int dsaMarks = scanner.nextInt();
            System.out.print("Marks in DBMS: ");
            int dbmsMarks = scanner.nextInt();

            students[i] = new Student(name, id, javaMarks, dsaMarks, dbmsMarks);
        }
        scanner.close();

        // Sort the students array based on total marks in descending order
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (students[i].getTotalMarks() < students[j].getTotalMarks()) {
                    // Swap the students[i] and students[j]
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }

        System.out.println("\nStudent Details in Descending Order of Total Marks:");
        System.out.println("-----------------------------------------------");
        System.out.println("Name          ID         Total Marks");
        System.out.println("-----------------------------------------------");
        for (Student student : students) {
            System.out.printf("%-13s %-10d %-10d\n", student.getName(), student.getId(), student.getTotalMarks());
        }
        System.out.println("-----------------------------------------------");
    }
}
