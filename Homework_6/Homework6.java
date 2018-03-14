import java.util.*;

public class Homework6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                board[i][j] = 'E';
            }
        }
        int total = queens(board,n, n);
        System.out.println(total);
    }

    public static int queens(char[][] board, int n, int queens) {
        if(queens == 0) {
            printBoard(board, n);
            return 1;
        }

        if(emptySpaces(board,n) == false) {
            return 0;
        }
        int count = 0;
        char[][] board2 = new char[n][n];
        fillTemp(board,board2, n);
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(board2[i][j] == 'E') {
                    board2[i][j] = 'Q';
                    diagonal(board2, i, j, n);
                    horizontal(board2, i, n);
                    vertical(board2, j, n);
                    count += queens(board2, n, queens - 1);
                    board[i][j] = 'F';
                }
                fillTemp(board,board2, n);
            }
        }
        return count;
    }

    public static void diagonal(char[][] board, int line, int column, int n) {
        int x = line + 1, y = column + 1;
        while((x<n)&&(y<n)) {
            board[x][y] = 'F';
            x++;
            y++;
        }

        if(line > 0) {
            x = line - 1;
            y = column + 1;
            while((x>=0)&&(y<n)) {
                board[x][y] = 'F';
                x--;
                y++;
            }
        }

        if(column > 0) {
            x = line + 1;
            y = column - 1;
            while((x<n)&&(y>=0)) {
                board[x][y] = 'F';
                x++;
                y--;
            }
        }

        if(line > 0 && column > 0) {
            x = line - 1;
            y = column - 1;
            while((x>=0)&&(y>=0)) {
                board[x][y] = 'F';
                x--;
                y--;
            }
        }
    }

    public static void horizontal(char[][] board, int line, int n) {
        for(int i = 0; i < n; i++) {
            if(board[line][i] != 'Q')
                board[line][i] = 'F';
        }
    }

    public static void vertical(char[][] board, int column, int n) {
        for(int i = 0; i < n; i++) {
            if(board[i][column] != 'Q')
                board[i][column] = 'F';
        }
    }

    public static void printBoard(char[][] board, int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(board[i][j] == 'Q')
                    System.out.printf("%2s", "Q");
                else
                    System.out.printf("%2s", "-");
            }
            System.out.println();
        }
        System.out.println("\n");
    }

    public static boolean emptySpaces(char[][] board, int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(board[i][j] == 'E')
                    return true;
            }
        }
        return false;
    }

    public static void fillTemp(char[][] board, char[][] board2, int n){
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                board2[i][j] = board[i][j];
            }
        }
    }
}
