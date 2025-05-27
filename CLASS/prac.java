
interface b {

    int add(int a, int b);
}

class prac {

    public static void main(String[] args) {
        b b1 = (a, b) -> a + b;
        System.out.println(b1.add(5, 10));
    }
}
