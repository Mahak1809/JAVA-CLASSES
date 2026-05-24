class Test {
    int a = 10;
    int b = 20;

    void sum(int a, int b) {
        System.out.println(a + b);
    }
}

public class Main {
    public static void main(String args[]) {

        Test t = new Test();

        t.sum(t.a, t.b);
    }
}