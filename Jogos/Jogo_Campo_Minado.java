import java.util.Random;
import java.util.Scanner;

public class Jogo_Campo_Minado {
    public static void main(String[] args) {
        int tamanhoTabuleiro = 8;
        int numeroMinas = 10;
        char[][] tabuleiro = new char[tamanhoTabuleiro][tamanhoTabuleiro];
        char[][] tabuleiroMinas = new char[tamanhoTabuleiro][tamanhoTabuleiro];

        inicializarTabuleiro(tabuleiro);
        inicializarMinas(tabuleiroMinas, numeroMinas);

        boolean jogoEmAndamento = true;

        while (jogoEmAndamento) {
            exibirTabuleiro(tabuleiro);

            int linha, coluna;
            Scanner scanner = new Scanner(System.in);

            System.out.print("Informe a linha (0-7) e coluna (0-7) separadas por espaço: ");
            linha = scanner.nextInt();
            coluna = scanner.nextInt();

            if (linha < 0 || linha >= tamanhoTabuleiro || coluna < 0 || coluna >= tamanhoTabuleiro) {
                System.out.println("Posição inválida. Tente novamente.");
                continue;
            }

            if (tabuleiroMinas[linha][coluna] == '*') {
                System.out.println("Você acertou uma mina! Game Over!");
                jogoEmAndamento = false;
            } else {
                int minasVizinhas = contarMinasVizinhas(tabuleiroMinas, linha, coluna);
                tabuleiro[linha][coluna] = (char) (minasVizinhas + '0');

                if (minasVizinhas == 0) {
                    revelarVizinhas(tabuleiro, tabuleiroMinas, linha, coluna);
                }

                if (verificarVitoria(tabuleiro, numeroMinas)) {
                    exibirTabuleiro(tabuleiro);
                    System.out.println("Parabéns! Você venceu o jogo!");
                    jogoEmAndamento = false;
                }
            }
        }
    }

    public static void inicializarTabuleiro(char[][] tabuleiro) {
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                tabuleiro[i][j] = '-';
            }
        }
    }

    public static void inicializarMinas(char[][] tabuleiroMinas, int numeroMinas) {
        Random random = new Random();
        int count = 0;
        while (count < numeroMinas) {
            int linha = random.nextInt(tabuleiroMinas.length);
            int coluna = random.nextInt(tabuleiroMinas[0].length);
            if (tabuleiroMinas[linha][coluna] != '*') {
                tabuleiroMinas[linha][coluna] = '*';
                count++;
            }
        }
    }

    public static void exibirTabuleiro(char[][] tabuleiro) {
        System.out.println("  0 1 2 3 4 5 6 7");
        for (int i = 0; i < tabuleiro.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int contarMinasVizinhas(char[][] tabuleiroMinas, int linha, int coluna) {
        int count = 0;
        int[][] vizinhos = {
            {-1, -1}, {-1, 0}, {-1, 1},
            {0, -1},           {0, 1},
            {1, -1}, {1, 0}, {1, 1}
        };

        for (int[] vizinho : vizinhos) {
            int novaLinha = linha + vizinho[0];
            int novaColuna = coluna + vizinho[1];

            if (novaLinha >= 0 && novaLinha < tabuleiroMinas.length &&
                novaColuna >= 0 && novaColuna < tabuleiroMinas[0].length &&
                tabuleiroMinas[novaLinha][novaColuna] == '*') {
                count++;
            }
        }

        return count;
    }

    public static void revelarVizinhas(char[][] tabuleiro, char[][] tabuleiroMinas, int linha, int coluna) {
        int[][] vizinhos = {
            {-1, -1}, {-1, 0}, {-1, 1},
            {0, -1},           {0, 1},
            {1, -1}, {1, 0}, {1, 1}
        };

        for (int[] vizinho : vizinhos) {
            int novaLinha = linha + vizinho[0];
            int novaColuna = coluna + vizinho[1];

            if (novaLinha >= 0 && novaLinha < tabuleiroMinas.length &&
                novaColuna >= 0 && novaColuna < tabuleiroMinas[0].length &&
                tabuleiro[novaLinha][novaColuna] == '-') {
                int minasVizinhas = contarMinasVizinhas(tabuleiroMinas, novaLinha, novaColuna);
                tabuleiro[novaLinha][novaColuna] = (char) (minasVizinhas + '0');

                if (minasVizinhas == 0) {
                    revelarVizinhas(tabuleiro, tabuleiroMinas, novaLinha, novaColuna);
                }
            }
        }
    }

    public static boolean verificarVitoria(char[][] tabuleiro, int numeroMinas) {
        int celulasNaoReveladas = 0;
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                if (tabuleiro[i][j] == '-') {
                    celulasNaoReveladas++;
                }
            }
        }
        return celulasNaoReveladas == numeroMinas;
    }
}