// Parent class
class Person {
    String name;
    void display() {
        System.out.println("Name: " + name);
    }
}

// Child class
class Single_Inheritance extends Person {
    int rollNo;
    void showDetails() {
        display();
        System.out.println("Roll Number: " + rollNo);
    }

    public static void main(String[] args) {
        Single_Inheritance s = new Single_Inheritance();
        s.name = "Alice";
        s.rollNo = 101;
        s.showDetails();
    }
}