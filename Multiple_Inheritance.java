interface A {
    void methodA();
}

interface B {
    void methodB();
}

class Multiple_Inheritance implements A, B {
    public void methodA() {
        System.out.println("Method A from Interface A");
    }
    public void methodB() {
        System.out.println("Method B from Interface B");
    }

    public static void main(String[] args) {
        Multiple_Inheritance obj = new Multiple_Inheritance();
        obj.methodA();
        obj.methodB();
    }
}