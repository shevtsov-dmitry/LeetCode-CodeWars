package code_wars;

public class XO {
    public static void main(String[] args) {

    }
    public static boolean getXO (String str) {
        str = str.toLowerCase();
        int secondPointer = str.length() - 1;
        int Os = 0;
        int Xs = 0;
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            if(character == 'o') Os++;
            if(character == 'x') Xs++;
        }
        return Os == Xs;
    }
}
