package leet_code.java;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

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
        isValidSudoku(board);
    }

    public static boolean isValidSudoku(char[][] board) {
        int n = board.length;
        if (!handleXY(board, n)) return false;
        if (!handleBlocks(board, n)) return false;
        return true;
    }

    public static boolean handleXY(char[][] board, int n) {
        Set<Character> vertical = new HashSet<>();
        Set<Character> horizontal = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j] != '.' && !horizontal.add(board[i][j])) return false;
                if(board[j][i] != '.' && !vertical.add(board[j][i])) return false;
            }
            vertical.clear();
            horizontal.clear();
        }
        return true;
    }

    public static boolean handleBlocks(char[][] board, int n) {
        Set<Character> blocks = new HashSet<>();
        Stack<Character> stack =new Stack<>();
        for (int row = 0; row != n; row += 3) {
            for (int col = 0; col != n; col++) {
                char first = board[row][col];
                char second = board[row + 1][col];
                char third = board[row + 2][col];
                filterCommas(first, stack, second, third);
                blocks.addAll(stack);
                if (col == 2 || col == 5 || col == 8) {
                    if(stack.size() != blocks.size()) return false;
                    blocks.clear();
                    stack.clear();
                }
            }
        }
        return true;
    }

    public static void filterCommas(char first, Stack<Character> stack, char second, char third) {
        if(first != '.') stack.push(first);
        if(second != '.') stack.push(second);
        if(third != '.') stack.push(third);
    }

    public static void log(char first, char second, char third) {
        String logString = STR."\{first} - \{second} - \{third}";
        System.out.println(logString);
    }
}
