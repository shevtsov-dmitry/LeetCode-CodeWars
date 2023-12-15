package leet_code.java;

public class ValidSudoku36 {
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        System.out.println("isValidSudoku(board) = " + isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {
//        Set<Character> vertical = new HashSet<>();
//        Set<Character> horizontal = new HashSet<>();
//        Set<Character> block3x3 = new HashSet<>();
//
//        for (int row = 0; row < board.length ; row++) {
//            for (int col = 0; col < board.length; col++) {
//                if(!horizontal.add(board[row][col]) || !vertical.add(board[col][row]) ) return false;
//                if(!block3x3.add(charInBlock)) return false;
//            }
//        }
//        return true;

        return true;
    }

}