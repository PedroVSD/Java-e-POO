package questao1;

import java.util.Arrays;

public class DecomposicaoQR {

    public static void main(String[] args) {
        double[][] A = {{1, -1, 2}, {3, 2, 1}, {4, 1, -1}}; // Exemplo de matriz A
        
        if (!verificarCondicoes(A)) {
            System.out.println("Erro: A matriz fornecida não atende às condições para a decomposição QR.");
            return;
        }
        
        double[][][] QR = decomposicaoQR(A);
        double[][] Q = QR[0];
        double[][] R = QR[1];
        
        // Imprimir as matrizes Q e R
        System.out.println("Matriz Q:");
        imprimirMatriz(Q);
        System.out.println("Matriz R:");
        imprimirMatriz(R);
    }

    // Função para verificar se as condições para a decomposição QR são atendidas
    public static boolean verificarCondicoes(double[][] A) {
        int m = A.length; // Número de linhas
        int n = A[0].length; // Número de colunas
        
        // Condição 1: A matriz deve ser quadrada ou retangular (m >= n)
        if (m < n) {
            System.out.println("Erro: A matriz não é retangular (número de linhas < número de colunas).");
            return false;
        }
        
        // Condição 2: A matriz deve ter posto completo
        for (int i = 0; i < n; i++) {
            if (Arrays.stream(A[i]).allMatch(x -> x == 0)) {
                System.out.println("Erro: A matriz não tem posto completo.");
                return false;
            }
        }
        
        return true;
    }

    // Função para realizar a decomposição QR
    public static double[][][] decomposicaoQR(double[][] A) {
        int m = A.length; // Número de linhas
        int n = A[0].length; // Número de colunas
        
        double[][] Q = new double[m][n];
        double[][] R = new double[n][n];
        
        // Implementação da decomposição QR (algoritmo real)
        for (int j = 0; j < n; j++) {
            double[] coluna = new double[m];
            for (int i = 0; i < m; i++) {
                coluna[i] = A[i][j];
            }
            for (int k = 0; k < j; k++) {
                double produtoEscalar = 0;
                for (int i = 0; i < m; i++) {
                    produtoEscalar += Q[i][k] * coluna[i];
                }
                for (int i = 0; i < m; i++) {
                    coluna[i] -= produtoEscalar * Q[i][k];
                }
            }
            double normaColuna = 0;
            for (int i = 0; i < m; i++) {
                normaColuna += coluna[i] * coluna[i];
            }
            normaColuna = Math.sqrt(normaColuna);
            for (int i = 0; i < m; i++) {
                Q[i][j] = coluna[i] / normaColuna;
            }
            for (int i = 0; i <= j; i++) {
                double produtoEscalar = 0;
                for (int k = 0; k < m; k++) {
                    produtoEscalar += A[k][j] * Q[k][i];
                }
                R[i][j] = produtoEscalar;
            }
        }
        
        return new double[][][]{Q, R};
    }

    // Função para imprimir uma matriz
    public static void imprimirMatriz(double[][] matriz) {
        for (double[] linha : matriz) {
            for (double valor : linha) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}