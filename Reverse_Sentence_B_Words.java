public class Reverse_Sentence_B_Words {
    public static void main(String[] args) {
        String s = "I am a student.";
        String[] words = s.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}
