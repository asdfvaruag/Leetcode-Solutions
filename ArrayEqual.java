class ArrayEqual {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String arr1 = "";
        String arr2 = "";
        for (int i = 0; i < word1.length; i++) {
            arr1 += word1[i];

        }
        for (int i = 0; i < word2.length; i++) {
            arr2 += word2[i];

        }
        if (arr1.equals(arr2)) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        ArrayEqual obj = new ArrayEqual();
        String[] word1 = { "a", "bc" };
        String[] word2 = { "ab", "c" };
        System.out.println(obj.arrayStringsAreEqual(word1, word2));
    }
}