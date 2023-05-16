public class overriding {
    void m1() {
        System.out.println("parent1");
    }
    void m2() {
        System.out.println("parent2");
    }
}
    class Child extends overriding {
        void m3() {
            System.out.println("child");
        }
        class Main {
            public static void main(String[] args) {
                Child c = new Child();
                c.m3();
                c.m2();
            }
        }
    }

