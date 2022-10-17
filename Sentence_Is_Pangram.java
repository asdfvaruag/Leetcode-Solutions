class Sentence_Is_Pangram {
    public boolean checkIfPangram(String sentence) {
        int[] freq = new int[26];
        for (int i = 0; i < sentence.length(); i++) {
            freq[sentence.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Sentence_Is_Pangram s = new Sentence_Is_Pangram();
        System.out.println(s.checkIfPangram("asdfasdfasdfasdqwe"));
    }
}
