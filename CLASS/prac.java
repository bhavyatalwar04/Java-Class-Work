
import java.util.*;

class prac {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.add(10);
        st.add(20);
        st.add(30);
        System.out.println("Stack: " + st);
        System.out.println("top: " + st.peek());
        System.out.println("pop: " + st.pop());
        System.out.println("Stack: " + st);
        System.out.println("Stack 10: " + st.search(10));

    }
}
