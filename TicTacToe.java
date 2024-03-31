import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        char[][] board = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        printBoard(board);

        while (true) {
            playerMove(board);
            printBoard(board);

            if (isGameOver(board)) {
                break;
            }

            computerMove(board);
            printBoard(board);

            if (isGameOver(board)) {
                break;
            }
        }
    }

    private static void playerMove(char[][] board) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your move (row and column, e.g., 1 1): ");
        int row = scanner.nextInt() - 1;
        int col = scanner.nextInt() - 1;

        if (isValidMove(board, row, col)) {
            board[row][col] = 'X';
        } else {
            System.out.println("Invalid move. Try again.");
            playerMove(board);
        }
    }

    private static void computerMove(char[][] board) {
        int[] bestMove = minimax(board, 'O');
        board[bestMove[0]][bestMove[1]] = 'O';
    }

    private static int[] minimax(char[][] board, char player) {
        int[] bestMove = {-1, -1};
        int bestScore = (player == 'O') ? Integer.MIN_VALUE : Integer.MAX_VALUE;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    board[i][j] = player;
                    int score = minimaxHelper(board, 0, false);
                    board[i][j] = ' ';

                    if ((player == 'O' && score > bestScore) || (player == 'X' && score < bestScore)) {
                        bestScore = score;
                        bestMove[0] = i;
                        bestMove[1] = j;
                    }
                }
            }
        }

        return bestMove;
    }

    private static int minimaxHelper(char[][] board, int depth, boolean isMaximizing) {
        if (isGameOver(board)) {
            return evaluate(board);
        }

        if (isMaximizing) {
            int maxEval = Integer.MIN_VALUE;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == ' ') {
                        board[i][j] = 'O';
                        int eval = minimaxHelper(board, depth + 1, false);
                        board[i][j] = ' ';
                        maxEval = Math.max(maxEval, eval);
                    }
                }
            }
            return maxEval;
        } else {
            int minEval = Integer.MAX_VALUE;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == ' ') {
                        board[i][j] = 'X';
                        int eval = minimaxHelper(board, depth + 1, true);
                        board[i][j] = ' ';
                        minEval = Math.min(minEval, eval);
                    }
                }
            }
            return minEval;
        }
    }

    private static boolean isValidMove(char[][] board, int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ';
    }

    private static boolean isGameOver(char[][] board) {
        return hasContestantWon(board, 'X') || hasContestantWon(board, 'O') || isBoardFull(board);
    }

    private static boolean hasContestantWon(char[][] board, char player) {
        // Check rows, columns, and diagonals
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                    (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }
        return (board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
                (board[0][2] == player && board[1][1] == player && board[2][0] == player);
    }

    private static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    private static int evaluate(char[][] board) {
        if (hasContestantWon(board, 'O')) {
            return 1;
        } else if (hasContestantWon(board, 'X')) {
            return -1;
        } else {
            return 0;
        }
    }

    private static void printBoard(char[][] board) {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
}

