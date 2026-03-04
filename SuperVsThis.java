class Parent {
    String name = "Parent Field";

    void who() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    String name = "Child Field";

    @Override
    void who() {
        System.out.println("Child");
    }

    void test() {
        System.out.print("this.who(): ");
        this.who();   

        System.out.print("super.who(): ");
        super.who();   

        System.out.println("this.name: " + this.name);   
        System.out.println("super.name: " + super.name); 
    }
}

public class SuperVsThis {
    public static void main(String[] args) {
        Child c = new Child();
        c.test();
    }
}
