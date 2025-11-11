class Student {
    // Fields
    String name;
    int rollNumber;
    double marks;

    // Constructor
    Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to display student info
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }

    // Method to calculate grade
    void calculateGrade() {
        if (marks >= 90)
            System.out.println("Grade: A");
        else if (marks >= 75)
            System.out.println("Grade: B");
        else if (marks >= 60)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: Fail");
    }

    public static void main(String[] args) {
        // Creating objects
        Student s1 = new Student("Alice", 101, 92);
        Student s2 = new Student("Bob", 102, 68);

        // Calling methods
        s1.displayInfo();
        s1.calculateGrade();

        System.out.println();

        s2.displayInfo();
        s2.calculateGrade();
    }
}