class A {
    String name = "Class A";

    void a() {
        System.out.println("Method a in Class A");
    }

    void b() {
        System.out.println("Method b in Class A");
    }

    void c() {
        System.out.println("Method c in Class A");
    }
}

class B extends A {
    String name = "Class B";

    void a() {
        System.out.println("Method a in Class B");
    }

    void b() {
        System.out.println("Method b in Class B");
    }

    @Override
    void c() {
        System.out.println("Method c in Class B");
    }
}

class C extends B {
    String name = "Class C";

    void a() {
        System.out.println("Method a in Class C");
    }

    void b() {
        System.out.println("Method b in Class C");
    }

    @Override
    void c() {
        System.out.println("Method c in Class C");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        A aObj = new A();
        B bObj = new B();
        C cObj = new C();

        aObj.a();
        aObj.b();
        aObj.c();

        bObj.a();
        bObj.b();
        bObj.c();

        cObj.a();
        cObj.b();
        cObj.c();

        A bRef = new B();
        A cRef = new C();

        bRef.c();
        cRef.c();

        System.out.println("bRef's name: " + bRef.name);
        System.out.println("cRef's name: " + cRef.name);
    }
}
