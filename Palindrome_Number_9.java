
public class Palindrome_Number_9 {

    public boolean isPalindrome(int x) {
        // int rev_n = 0;
        // int temp = x;
        // while (temp > 0) {
        // rev_n = rev_n * 10 + temp % 10;
        // temp = temp / 10;
        // }
        // if (x == rev_n) {
        // return true;
        // } else {
        // return false;
        // }
        String str = String.valueOf(x);
        if (str.contains("-"))
            return false;
        StringBuilder str1 = new StringBuilder();
        str1.append(x);
        str1.reverse();
        String str2 = String.valueOf(str1);
        if (str.equals(str2))
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        Palindrome_Number_9 obj = new Palindrome_Number_9();
        System.out.println(obj.isPalindrome(-121));
    }
}
