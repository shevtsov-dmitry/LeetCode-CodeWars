import java.util.HashSet;
import java.util.Set;

void main() {
    char [][] board =
    {{'5','3','.'  ,'.','7','.'  ,'.','.','.'}
    ,{'6','.','.'  ,'1','9','5'  ,'.','.','.'}
    ,{'.','9','8'  ,'.','.','.'  ,'.','6','.'}

    ,{'8','.','.'  ,'.','6','.'  ,'.','.','3'}
    ,{'4','.','.'  ,'8','2','3'  ,'.','.','1'}
    ,{'7','.','.'  ,'.','.','.'  ,'.','.','6'}

    ,{'.','6','.'  ,'.','.','.'  ,'2','8','.'}
    ,{'.','.','.'  ,'4','1','9'  ,'.','.','5'}
    ,{'.','.','.'  ,'.','8','.'  ,'.','7','9'}};

    boolean answer = isValidSudoku(board);
    System.out.println(answer);
}

Set<Character> verifySet = new HashSet<>();
Set<Character> verifySetReversed = new HashSet<>();

public boolean isValidSudoku(char[][] board) {
    for (int x = 0; x < board.length; x += 3) {
        for (int y = 0; y < board.length; y += 3) {
            if(hasDups(board, x,y)) {
                return false;
            }
        }
    }

    for (int x = 0; x < board.length; x++) {
        for (int y = 0; y < board.length; y++) {
            System.out.printf("%d %d %c %n", x,y,board[x][y]);
            char cell = board[x][y];
            char reversedCell = board[y][x];
            if (cell != '.'){
                if (verifySet.contains(cell)){
                    System.out.printf("stopped at x:%d y:%d char:%c", x,y,cell);
                    return false;
                }
                verifySet.add(cell);
            }
            if (reversedCell != '.'){
                if (verifySetReversed.contains(reversedCell)){
                    System.out.printf("stopped at x:%d y:%d char:%c", x,y,reversedCell);
                    return false;
                }
                verifySetReversed.add(reversedCell);
            }
        }
        verifySet.clear();
        verifySetReversed.clear();
    }

    return true;
}

boolean hasDups(char[][] block, int x, int y) {
    for (int hor = x; hor < x + 3; hor++) {
        for (int vert = y; vert < y + 3; vert++) {
            char cell = block[hor][vert];
            if (cell == '.'){
                continue;
            }

            if (verifySet.contains(cell)) {
                verifySet.clear();
                System.out.printf("stopped at x:%d y:%d char:%c", hor,vert,cell);
                return true;
            }

            verifySet.add(cell);
        }
    }
    verifySet.clear();
    return false;
}
