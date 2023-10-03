import java.util.Stack;

public class Stack1 {
    public static void main(String args[]){
        Stack<String> st=new Stack<>();
        st.push("Hello");
        st.push("Hayoda");
        System.out.println(st.peek());
        st.push("Nothing");
        st.push("bmw");
        st.pop();
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.empty());
        System.out.println(st.search("Hello"));
    }
}
