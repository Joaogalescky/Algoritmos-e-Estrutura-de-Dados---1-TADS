import java.util.Random;
import java.util.Scanner;

public class campo_minado {
    private char[][] tabuleiro;
    private char[][] tabuleiroVisivel;
    private int tamanhoTabuleiro;
    private int numeroBombas;
    private boolean jogoEncerrado;

    public campo_minado(int tamanhoTabuleiro, int numeroBombas) {
        this.tamanhoTabuleiro = tamanhoTabuleiro;
        this.numeroBombas = numeroBombas;
        this.tabuleiro = new char[tamanhoTabuleiro][tamanhoTabuleiro];
        this.tabuleiroVisivel = new char[tamanhoTabuleiro][tamanhoTabuleiro];
        this.jogoEncerrado = false;

        inicializarTabuleiro();
        distribuirBombas();
        calcularNumeros();
    }

    public void jogar() {
        Scanner scanner = new Scanner(System.in);

        while (!jogoEncerrado) {
            exibirTabuleiro();
            System.out.println("Escolha uma ação (P para abrir, M para marcar):");
            char acao = scanner.next().charAt(0);
            int linha = scanner.nextInt();
            int coluna = scanner.nextInt();

            if (acao == 'P') {
                if (abrirCelula(linha, coluna)) {
                    System.out.println("Você perdeu! Uma bomba explodiu.");
                    jogoEncerrado = true;
                } else if (verificarVitoria()) {
                    exibirTabuleiro();
                    System.out.println("Parabéns! Você ganhou!");
                    jogoEncerrado = true;
                }
            } else if (acao == 'M') {
                marcarCelula(linha, coluna);
            }
        }

        scanner.close();
    }

    private void inicializarTabuleiro() {
        for (int i = 0; i < tamanhoTabuleiro; i++) {
            for (int j = 0; j < tamanhoTabuleiro; j++) {
                tabuleiro[i][j] = ' ';
                tabuleiroVisivel[i][j] = '-';
            }
        }
    }

    private void distribuirBombas() {
        Random random = new Random();
        int bombasColocadas = 0;

        while (bombasColocadas < numeroBombas) {
            int linha = random.nextInt(tamanhoTabuleiro);
            int coluna = random.nextInt(tamanhoTabuleiro);

            if (tabuleiro[linha][coluna] != 'B') {
                tabuleiro[linha][coluna] = 'B';
                bombasColocadas++;
            }
        }
    }

    private void calcularNumeros() {
        for (int i = 0; i < tamanhoTabuleiro; i++) {
            for (int j = 0; j < tamanhoTabuleiro; j++) {
                if (tabuleiro[i][j] != 'B') {
                    int numeroBombasAoRedor = 0;

                    for (int x = -1; x <= 1; x++) {
                        for (int y = -1; y <= 1; y++) {
                            int novaLinha = i + x;
                            int novaColuna = j + y;

                            if (novaLinha >= 0 && novaLinha < tamanhoTabuleiro && novaColuna >= 0
                                    && novaColuna < tamanhoTabuleiro && tabuleiro[novaLinha][novaColuna] == 'B') {
                                numeroBombasAoRedor++;
                            }
                        }
                    }

                    if (numeroBombasAoRedor > 0) {
                        tabuleiro[i][j] = (char) (numeroBombasAoRedor + '0');
                    }
                }
            }
        }
    }

    private void exibirTabuleiro() {
        System.out.println("Tabuleiro:");
        for (int i = 0; i < tamanhoTabuleiro; i++) {
            for (int j = 0; j < tamanhoTabuleiro; j++) {
                System.out.print(tabuleiroVisivel[i][j] + " ");
            }
            System.out.println();
        }
    }

    private boolean abrirCelula(int linha, int coluna) {
        if (linha >= 0 && linha < tamanhoTabuleiro && coluna >= 0 && coluna < tamanhoTabuleiro
                && tabuleiroVisivel[linha][coluna] == '-') {
            tabuleiroVisivel[linha][coluna] = tabuleiro[linha][coluna];

            if (tabuleiroVisivel[linha][coluna] == 'B') {
                return true;
            } else if (tabuleiroVisivel[linha][coluna] == ' ') {
                abrirVizinhos(linha, coluna);
            }
        }
        return false;
    }

    private void abrirVizinhos(int linha, int coluna) {
        for (int x = -1; x <= 1; x++) {
            for (int y = -1; y <= 1; y++) {
                int novaLinha = linha + x;
                int novaColuna = coluna + y;

                if (novaLinha >= 0 && novaLinha < tamanhoTabuleiro && novaColuna >= 0 && novaColuna < tamanhoTabuleiro
                        && tabuleiroVisivel[novaLinha][novaColuna] == '-') {
                    abrirCelula(novaLinha, novaColuna);
                }
            }
        }
    }

    private void marcarCelula(int linha, int coluna) {
        if (linha >= 0 && linha < tamanhoTabuleiro && coluna >= 0 && coluna < tamanhoTabuleiro
                && tabuleiroVisivel[linha][coluna] == '-') {
            tabuleiroVisivel[linha][coluna] = 'M';
        }
    }

    private boolean verificarVitoria() {
        for (int i = 0; i < tamanhoTabuleiro; i++) {
            for (int j = 0; j < tamanhoTabuleiro; j++) {
                if (tabuleiro[i][j] != 'B' && tabuleiroVisivel[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        campo_minado campoMinado = new campo_minado(10, 20); // Tamanho do tabuleiro e número de bombas
        campoMinado.jogar();
    }
}
