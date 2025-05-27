
class Box<T extends Number> {

    private T item;

    public double square(T item) {
        return item.doubleValue() * item.doubleValue();
    }
}

class prac {

    public static void main(String[] args) {
        Box<Integer> b = new Box<>();
        // b.square("STR");
        System.out.println(b.square(5));
    }
}
