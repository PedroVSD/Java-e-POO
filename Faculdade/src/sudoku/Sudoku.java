package sudoku;

import java.util.Scanner;
import java.util.Random;


public class Sudoku {
    private static final int N = 9;
    private static final int EMPTY = 0;

    public static void main(String[] args) {
        int[][] board = generateRandomSudoku();
        System.out.println("Tabuleiro de Sudoku gerado aleatoriamente:");
        printBoard(board);

        System.out.println("Tente resolver o Sudoku. Use números de 1 a 9 e 0 para células vazias.");

        if (solveSudoku(board)) {
            System.out.println("\nParabéns! Você resolveu o Sudoku!");
        } else {
            System.out.println("\nNão foi possível resolver o Sudoku gerado. Mais sorte na próxima vez!");
        }
    }

    public static boolean solveSudoku(int[][] board) {
        Scanner scanner = new Scanner(System.in);

        while (!isSolved(board)) {
            System.out.print("\nDigite a linha (de 1 a 9) da célula que deseja alterar: ");
            int row = scanner.nextInt() - 1;

            System.out.print("Digite a coluna (de 1 a 9) da célula que deseja alterar: ");
            int col = scanner.nextInt() - 1;

            if (row < 0 || row >= N || col < 0 || col >= N || board[row][col] != EMPTY) {
                System.out.println("Célula inválida ou já preenchida. Tente novamente.");
                continue;
            }

            System.out.print("Insira um número para a célula na linha " + (row + 1) + " e coluna " + (col + 1) + ": ");
            int num = scanner.nextInt();
            if (num < 0 || num > 9) {
                System.out.println("Número inválido. Tente novamente.");
                continue;
            }

            if (isValid(board, row, col, num)) {
                board[row][col] = num;
                System.out.println("Número inserido com sucesso!");
            } else {
                System.out.println("Número inválido. Tente novamente.");
            }

            System.out.println("Tabuleiro atual:");
            printBoard(board);
        }

        scanner.close();

        return true;
    }

    private static boolean isValid(int[][] board, int row, int col, int num) {
        // Verifica se o número já está presente na mesma linha ou coluna
        for (int x = 0; x < N; x++) {
            if (board[row][x] == num || board[x][col] == num) {
                return false;
            }
        }

        // Verifica se o número já está presente na mesma sub-grade de 3x3
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i + startRow][j + startCol] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean isSolved(int[][] board) {
        // Verifica se todas as células foram preenchidas
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (board[i][j] == EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void printBoard(int[][] board) {
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] generateRandomSudoku() {
        int[][] board = new int[N][N];
        fillDiagonals(board);
        fillRemaining(board, 0, 3);
        makeSomeCellsEmpty(board);
        return board;
    }

    private static void fillDiagonals(int[][] board) {
        Random rand = new Random();
        for (int i = 0; i < N; i = i + 3) {
            fillBox(board, i, i);
        }
    }

    private static boolean isSafe(int[][] board, int row, int col, int num) {
        for (int x = 0; x < N; x++) {
            if (board[row][x] == num || board[x][col] == num) {
                return false;
            }
        }
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i + startRow][j + startCol] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void fillBox(int[][] board, int row, int col) {
        Random rand = new Random();
        int num;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    num = rand.nextInt(9) + 1;
                } while (!isSafe(board, row + i, col + j, num));
                board[row + i][col + j] = num;
            }
        }
    }

    private static boolean fillRemaining(int[][] board, int i, int j) {
        Random rand = new Random();
        if (j >= N && i < N - 1) {
            i = i + 1;
            j = 0;
        }
        if (i >= N && j >= N) {
            return true;
        }
        if (i < 3) {
            if (j < 3) {
                j = 3;
            }
        } else if (i < N - 3) {
            if (j == (int) (i / 3) * 3) {
                j = j + 3;
            }
        } else {
            if (j == N - 3) {
                i = i + 1;
                j = 0;
                if (i >= N) {
                    return true;
                }
            }
        }
        for (int num = 1; num <= N; num++) {
            if (isSafe(board, i, j, num)) {
                board[i][j] = num;
                if (fillRemaining(board, i, j + 1)) {
                    return true;
                }
                board[i][j] = EMPTY;
            }
        }
        return false;
    }
    
    private static void makeSomeCellsEmpty(int[][] board) {
        Random rand = new Random();
        int numEmptyCells = 40; // Número de células vazias desejadas
        int count = 0;
        while (count < numEmptyCells) {
            int row = rand.nextInt(N);
            int col = rand.nextInt(N);
            if (board[row][col] != EMPTY) {
                board[row][col] = EMPTY;
                count++;
            }
        }
    }
}