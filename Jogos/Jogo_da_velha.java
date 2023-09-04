import java.util.Scanner;

public class Jogo_da_velha {
    public static void main(String[] args) {
        char[][] tabuleiro = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };
        
        char jogadorAtual = 'X';
        boolean jogoEmAndamento = true;
        
        while (jogoEmAndamento) {
            exibirTabuleiro(tabuleiro);
            System.out.println("É a vez do jogador " + jogadorAtual + ". Informe a linha (0-2) e coluna (0-2) separadas por espaço:");
            
            int linha, coluna;
            Scanner scanner = new Scanner(System.in);
            
            do {
                linha = scanner.nextInt();
                coluna = scanner.nextInt();
            } while (!jogadaValida(tabuleiro, linha, coluna));
            
            tabuleiro[linha][coluna] = jogadorAtual;
            
            if (verificarVitoria(tabuleiro, jogadorAtual)) {
                exibirTabuleiro(tabuleiro);
                System.out.println("Jogador " + jogadorAtual + " venceu! Parabéns!");
                jogoEmAndamento = false;
            } else if (tabuleiroCompleto(tabuleiro)) {
                exibirTabuleiro(tabuleiro);
                System.out.println("O jogo empatou!");
                jogoEmAndamento = false;
            } else {
                jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
            }
        }
    }
    
    public static void exibirTabuleiro(char[][] tabuleiro) {
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static boolean jogadaValida(char[][] tabuleiro, int linha, int coluna) {
        if (linha < 0 || linha >= 3 || coluna < 0 || coluna >= 3) {
            System.out.println("Posição inválida. Tente novamente.");
            return false;
        }
        if (tabuleiro[linha][coluna] != ' ') {
            System.out.println("Essa posição já está ocupada. Tente novamente.");
            return false;
        }
        return true;
    }
    
    public static boolean verificarVitoria(char[][] tabuleiro, char jogador) {
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) {
                return true;
            }
            if (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador) {
                return true;
            }
        }
        if (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) {
            return true;
        }
        if (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador) {
            return true;
        }
        return false;
    }
    
    public static boolean tabuleiroCompleto(char[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}