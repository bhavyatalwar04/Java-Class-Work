package Q;

import P.A; // Importing class A

public class B extends A { // Inheriting A to access protected members

    public static void main(String[] args) {
        A obj = new A();

        obj.publicMethod(); // ✅ Accessible (public)

        // obj.protectedMethod(); // ❌ Not accessible (only via inheritance)
        // obj.defaultMethod();   // ❌ Not accessible (package-private)
        // obj.privateMethod();   // ❌ Not accessible (private)
        // Accessing protected method via inheritance
        B objB = new B();
        objB.protectedMethod(); // ✅ Accessible via subclass

        System.out.println("Methods tested!");
    }
}
