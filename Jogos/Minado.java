import java.util.Random;
import java.util.Scanner;

public class Minado{
    //variaveis
    private int tabuleiro_tamanho;
    private int quantidade_bombas;
    private char[][] tabuleiro;
    private char[][] tabuleiro_visivel;
    private boolean situacao_do_jogo;
    
    public Minado(int tabuleiro_tamanho, int quantidade_bombas){
        this.tabuleiro_tamanho = tabuleiro_tamanho;
        this.quantidade_bombas = quantidade_bombas;
        this.tabuleiro = new char[tabuleiro_tamanho][tabuleiro_tamanho];
        this.tabuleiro_visivel = new char[tabuleiro_tamanho][tabuleiro_tamanho];
        this.situacao_do_jogo = true;
        Iniciar_tabuleiro();
        Colocar_bombas();
    }

    private void Iniciar_tabuleiro(){
        //Sistema de repetição: criando tabuleiro contendo as bombas
        for(int i = 0; i < tabuleiro_tamanho; i++){
            for(int j = 0; j < tabuleiro_tamanho; j++){
                tabuleiro[i][j] = ' ';
                tabuleiro_visivel[i][j] = '-';
            }
        }
    }

    private void Colocar_bombas(){
        //variaveis
        Random randomico = new Random();
        int bombas_colocadas = 0;

        //Sistema de repetição: colocação das bombas
        while(bombas_colocadas < quantidade_bombas){
            int x = randomico.nextInt(tabuleiro_tamanho);
            int y = randomico.nextInt(tabuleiro_tamanho);

            //Colocação das bombas
            if(tabuleiro[x][y] != '*'){
                tabuleiro[x][y] = '*';
                bombas_colocadas++;
            }
        }
    }

    private void Tabuleiro_visivel(){
        System.out.println("Tabuleiro:");
        //Sistema de repetição: criando tabuleiro visivel ao usuário
        for(int i = 0; i < tabuleiro_tamanho; i++){
            for(int j = 0; j < tabuleiro_tamanho; j++){
                System.out.print(tabuleiro_visivel[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void Jogar(){
        Scanner entrada = new Scanner(System.in);
        int linha, coluna;

        while(situacao_do_jogo){
            Tabuleiro_visivel();
            System.out.print("Digite a linha (0 a " + (tabuleiro_tamanho - 1) + "): ");
            linha = entrada.nextInt();

            System.out.print("Digite a coluna (0 a " + (tabuleiro_tamanho - 1) + "): ");
            coluna = entrada.nextInt();

            if(linha < 0 || linha >= tabuleiro_tamanho || coluna < 0 || coluna >= tabuleiro_tamanho){
                System.out.println("Coordenadas inválidas. Tente novamente.");
                continue;
            }

            if(tabuleiro[linha][coluna] == '*'){
                System.out.println("Você perdeu! Uma bomba explodiu.");
                situacao_do_jogo = false;
            }else{
                Descobrir_celula(linha, coluna);
                Fim_de_jogo();
            }
        }
        entrada.close();
    }

    private void Descobrir_celula(int linha, int coluna){
        int bombas_adjacentes, i, j;

        if(tabuleiro_visivel[linha][coluna] != '-'){
            System.out.println("Esta célula já foi descoberta.");
            return;
        }

        bombas_adjacentes = Contar_bombas_adjacentes(linha, coluna);
        tabuleiro_visivel[linha][coluna] = (char) (bombas_adjacentes + '0');

        if(bombas_adjacentes == 0){
            // Se não houver bombas adjacentes, revelar células vizinhas recursivamente.
            for(i = linha - 1; i <= linha + 1; i++){
                for(j = coluna - 1; j <= coluna + 1; j++){
                    if(i >= 0 && i < tabuleiro_tamanho && j >= 0 && j < tabuleiro_tamanho){
                        Descobrir_celula(i, j);
                    }
                }
            }
        }
    }

    private int Contar_bombas_adjacentes(int linha, int coluna){
        int bombas_adjacentes = 0;
        int i, j;

        for(i = linha - 1; i <= linha + 1; i++){
            for(j = coluna - 1; j <= coluna + 1; j++){
                if(i >= 0 && i < tabuleiro_tamanho && j >= 0 && j < tabuleiro_tamanho && tabuleiro[i][j] == '*'){
                    bombas_adjacentes++;
                }
            }
        }
        return bombas_adjacentes;
    }

    private void Fim_de_jogo(){
        boolean vitoria = true;
        int i, j;

        for(i = 0; i < tabuleiro_tamanho; i++){
            for(j = 0; j < tabuleiro_tamanho; j++){
                if(tabuleiro[i][j] != '*' && tabuleiro_visivel[i][j] == '-'){
                    vitoria = false;
                    break;
                }
            }
        }

        if(vitoria){
            System.out.println("Parabéns! Você ganhou o jogo.");
            situacao_do_jogo = false;
        }
    }

    public static void main(String[] args){
        int tamanho_do_tabuleiro = 10, numero_de_bombas = 15;

        Minado campo_minado = new Minado(tamanho_do_tabuleiro, numero_de_bombas);
        campo_minado.Jogar();
    }
}
