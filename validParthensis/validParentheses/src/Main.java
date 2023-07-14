import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String strin1 = "()";
        String strin2 = "([[[})";
        System.out.println(isValid(strin1));
        System.out.println(isValid(strin2));
    }

    public static boolean isValid(String s) {
        boolean result = false;
        if (s.length()%2 != 0){
            return false;
        }

        Stack<Character> st = new Stack<>();

        for (int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if ( c == '(' || c== '['|| c== '{' ){

                st.push(c);

            }else {
                if(st.size() == 0){
                    return false;
                }
                if ((c == ')') && (st.peek() == '(')) {
                    st.pop();
                } else if ((c == ']') && (st.peek() == '[')) {
                    st.pop();
                } else if ((c == '}') && (st.peek() == '{')) {
                    st.pop();
                }else {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
}