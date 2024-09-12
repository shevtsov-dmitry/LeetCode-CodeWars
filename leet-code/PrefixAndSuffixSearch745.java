

void main() {
    String[] words = {"apple"};
    Determiner determiner = new Determiner(words);
    int f = determiner.f("a", "e");
    System.out.println(f);
}

String[] array = null;

class Determiner {
    public Determiner(String[] words) {
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


