package leet_code;

public class PrefixAndSuffixSearch745 {

    public static void main(String[] args) {
        String[] words = {"apple"};
        var prefixDeterminer = new PrefixAndSuffixSearch745(words);
        int f = prefixDeterminer.f("a", "e");
        System.out.println(f);
    }

    static String[] array = null;

    public PrefixAndSuffixSearch745(String[] words) {
        array = words;
    }

    public int f(String pref, String suff) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            String word = array[i];
            if (pref.length() + suff.length() > word.length()) {
                continue;
            }
            if (pref == word.substring(0, pref.length() - 1) &&
                    suff == word.substring(word.length() - suff.length(), word.length() - 1)) {
                index = i;
            }
        }

        return index;

    }

}
