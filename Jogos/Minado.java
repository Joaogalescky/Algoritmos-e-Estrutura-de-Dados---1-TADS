import java.util.Random;
import java.util.Scanner;

public class Minado {
    private int tamanhoTabuleiro;
    private int numeroBombas;
    private char[][] tabuleiro;
    private char[][] tabuleiroVisivel;
    private boolean jogoEmAndamento;

    public Minado(int tamanhoTabuleiro, int numeroBombas) {
        this.tamanhoTabuleiro = tamanhoTabuleiro;
        this.numeroBombas = numeroBombas;
        this.tabuleiro = new char[tamanhoTabuleiro][tamanhoTabuleiro];
        this.tabuleiroVisivel = new char[tamanhoTabuleiro][tamanhoTabuleiro];
        this.jogoEmAndamento = true;
        iniciar_tabuleiro();
        colocarBombas();
    }

    private void iniciar_tabuleiro() {
        for (int i = 0; i < tamanhoTabuleiro; i++) {
            for (int j = 0; j < tamanhoTabuleiro; j++) {
                tabuleiro[i][j] = ' ';
                tabuleiroVisivel[i][j] = '-';
            }
        }
    }

    private void colocarBombas() {
        Random random = new Random();
        int bombasColocadas = 0;

        while (bombasColocadas < numeroBombas) {
            int x = random.nextInt(tamanhoTabuleiro);
            int y = random.nextInt(tamanhoTabuleiro);

            if (tabuleiro[x][y] != '*') {
                tabuleiro[x][y] = '*';
                bombasColocadas++;
            }
        }
    }

    private void imprimirTabuleiroVisivel() {
        System.out.println("Tabuleiro:");
        for (int i = 0; i < tamanhoTabuleiro; i++) {
            for (int j = 0; j < tamanhoTabuleiro; j++) {
                System.out.print(tabuleiroVisivel[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void jogar() {
        Scanner scanner = new Scanner(System.in);

        while (jogoEmAndamento) {
            imprimirTabuleiroVisivel();
            System.out.print("Digite a linha (0 a " + (tamanhoTabuleiro - 1) + "): ");
            int linha = scanner.nextInt();
            System.out.print("Digite a coluna (0 a " + (tamanhoTabuleiro - 1) + "): ");
            int coluna = scanner.nextInt();

            if (linha < 0 || linha >= tamanhoTabuleiro || coluna < 0 || coluna >= tamanhoTabuleiro) {
                System.out.println("Coordenadas inválidas. Tente novamente.");
                continue;
            }

            if (tabuleiro[linha][coluna] == '*') {
                System.out.println("Você perdeu! Uma bomba explodiu.");
                jogoEmAndamento = false;
            } else {
                descobrirCelula(linha, coluna);
                verificarFimDeJogo();
            }
        }

        scanner.close();
    }

    private void descobrirCelula(int linha, int coluna) {
        if (tabuleiroVisivel[linha][coluna] != '-') {
            System.out.println("Esta célula já foi descoberta.");
            return;
        }

        int bombasAdjacentes = contar_bombas_adjacentes(linha, coluna);
        tabuleiroVisivel[linha][coluna] = (char) (bombasAdjacentes + '0');

        if (bombasAdjacentes == 0) {
            // Se não houver bombas adjacentes, revelar células vizinhas recursivamente.
            for (int i = linha - 1; i <= linha + 1; i++) {
                for (int j = coluna - 1; j <= coluna + 1; j++) {
                    if (i >= 0 && i < tamanhoTabuleiro && j >= 0 && j < tamanhoTabuleiro) {
                        descobrirCelula(i, j);
                    }
                }
            }
        }
    }

    private int contar_bombas_adjacentes(int linha, int coluna) {
        int bombasAdjacentes = 0;

        for (int i = linha - 1; i <= linha + 1; i++) {
            for (int j = coluna - 1; j <= coluna + 1; j++) {
                if (i >= 0 && i < tamanhoTabuleiro && j >= 0 && j < tamanhoTabuleiro && tabuleiro[i][j] == '*') {
                    bombasAdjacentes++;
                }
            }
        }

        return bombasAdjacentes;
    }

    private void fim_de_jogo() {
        boolean vitoria = true;

        for (int i = 0; i < tamanhoTabuleiro; i++) {
            for (int j = 0; j < tamanhoTabuleiro; j++) {
                if (tabuleiro[i][j] != '*' && tabuleiroVisivel[i][j] == '-') {
                    vitoria = false;
                    break;
                }
            }
        }

        if (vitoria) {
            System.out.println("Parabéns! Você ganhou o jogo.");
            jogoEmAndamento = false;
        }
    }

    public static void main(String[] args) {
        int tamanhoTabuleiro = 10;
        int numeroBombas = 15;

        Minado campoMinado = new Minado(tamanhoTabuleiro, numeroBombas);
        campoMinado.jogar();
    }
}
