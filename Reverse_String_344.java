import java.util.Stack;

public class Reverse_String_344 {
    public void reverseString(char[] s) {
        // int n = s.length;
        // for (int i = 0; i < n / 2; i++) {
        // char temp = s[i];
        // s[i] = s[n - i - 1];
        // s[n - i - 1] = temp;
        // }
        Stack<Character> st = new Stack<>();
        String str = new String(s);
        for (int i = 0; i < str.length(); i++) {
            st.push(s[i]);
        }
        char ans[] = new char[s.length];
        int i = 0;
        while (st.size() > 0) {
            s[i++] = st.pop();
        }
        for (int j = 0; j < str.length(); j++) {
            ans[j] = str.charAt(j);
        }
        /*
         * int a = s.length;
         * char[] b = new char[a];
         * char c;
         * for (int i = a - 1, j = 0; i >= 0; i--, j++) {
         * c = s[i];
         * b[j] = c;
         * 
         * }
         * for (int i = 0; i < b.length; i++) {
         * System.out.print(b[i] + ",");
         * }
         */
    }

    public static void main(String[] args) {
        Reverse_String_344 obj = new Reverse_String_344();
        char[] s = { 'h', 'e', 'l', 'l', 'o' };

    }
}
