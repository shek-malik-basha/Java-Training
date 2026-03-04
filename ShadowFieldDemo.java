class Parent {
    String name = "Parent";
}

class Child extends Parent {
    String name = "Child";

    void display() {
        System.out.println("Simple name: " + name);
        System.out.println("this.name  : " + this.name);
        System.out.println("super.name : " + super.name);
    }
}

public class ShadowFieldDemo {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
