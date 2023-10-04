import java.util.Random;
import java.util.Scanner;

public class Minado{
    //variaveis
    private int tabuleiro_tamanho;
    private int quantidade_bombas;
    private char[][] tabuleiro;
    private char[][] tabuleiro_visivel;
    private boolean situacao_do_jogo;
    /* Private - oque é
    O private é um modificador de acesso que define o nível de visibilidade de uma classe, atributo ou método em Java.
    Significa que a variável somente será acessa pela classe/escopo que foi declarada, tornando a privada, não podendo ser usada fora dela.
    Torna-se útil quando deseja-se encapsular parte da lógica de um programa e restringir o acesso de uma classe em um contexto específico.
    */
    
    public Minado(int tabuleiro_tamanho, int quantidade_bombas){
        this.tabuleiro_tamanho = tabuleiro_tamanho; //Tamanho do tabuleiro escolhido
        this.quantidade_bombas = quantidade_bombas; //Quantidade de bombas escolhidas
        this.tabuleiro = new char[tabuleiro_tamanho][tabuleiro_tamanho]; //Matriz das bombas
        this.tabuleiro_visivel = new char[tabuleiro_tamanho][tabuleiro_tamanho]; //Matriz visivel
        this.situacao_do_jogo = true; //Sinalizador
        /* This - oque é
        É uma referência implícita à instância atual de uma classe, refere-se ao objeto em que o código está atualmente executando.
        No contexto do public Minado(int tabuleiro_tamanho, int quantidade_bombas), é usado para se referir à instância da classe Minado que está sendo criada no momento.
        Torna-se útil quando precisa-se diferenciar entre variáveis de instância (membros da classe) e variáveis locais (parâmetros do método/variáveis definidas dentro de um método) que têm o mesmo nome.
        Permite que você acesse as variáveis de instância da classe, mesmo quando há nomes similares com as variáveis locais.
        */
        Iniciar_tabuleiro();
        Colocar_bombas();
    }

    public static void Posicao_Fileiras(char[][] tabuleiro_visivel) {
        System.out.print("  ");
        for(int i = 0; i < tabuleiro_visivel[0].length; i++) {
            System.out.printf("%2d ", i);
        }
        System.out.println();
    
        for(int i = 0; i < tabuleiro_visivel.length; i++) {
            System.out.printf("%2d ", i);
            for(int j = 0; j < tabuleiro_visivel[i].length; j++) {
                System.out.printf("%2s ", tabuleiro_visivel[i][j]);
            }
            System.out.println();
        }
    }

    public void Iniciar_tabuleiro(){
        //Sistema de repetição: criando tabuleiro contendo as bombas
        for(int i = 0; i < tabuleiro_tamanho; i++){
            for(int j = 0; j < tabuleiro_tamanho; j++){
                tabuleiro[i][j] = ' '; //Espaços
                tabuleiro_visivel[i][j] = '-'; //Campos
            }
        }
    }

    public void Colocar_bombas(){
        //variaveis
        Random randomico = new Random();
        /*Random - oque é
        A classe Random é usada para gerar números aleatórios. Ao cirar uma instância de Random desta forma, estara criando um objeto que contém um gerador de números aleatórios (inteiros, doubles, booleanos, etc.) de acordo com sua necessidade.
        A variável declarada se torna uma referência para esse objeto, podendo ser usada para chamar métodos que geram números aleatórios.
        */
        int bombas_colocadas = 0, x, y;

        //Sistema de repetição: colocação das bombas
        while(bombas_colocadas < quantidade_bombas){
            x = randomico.nextInt(tabuleiro_tamanho); //gerando posicao randomica para a bomba
            y = randomico.nextInt(tabuleiro_tamanho);

            //Colocação das bombas
            if(tabuleiro[x][y] != '*'){ //Evitar de sobrepor 
                tabuleiro[x][y] = '*'; //Colocação da bomba
                bombas_colocadas++;
            }
        }
    }

    public void Tabuleiro_visivel(){
        System.out.println("Tabuleiro:");
        Posicao_Fileiras(tabuleiro_visivel); 
    }

    public void Jogar(){
        Scanner entrada = new Scanner(System.in);
        int linha, coluna;
        char acao;

        while (situacao_do_jogo){
            Tabuleiro_visivel();

            //Escolher se quer jogar uma posicao ou se quer marcar
            System.out.print("Digite a ação (J para jogar, M para marcar): ");
            acao = entrada.next().toUpperCase().charAt(0);

            //(tabuleiro_tamanho - 1) -> vai indicar o tamanho para limitar o espaço de jogo do usuário nas linhas e colunas
            System.out.print("Digite a linha (0 a " + (tabuleiro_tamanho - 1) + "): ");
            linha = entrada.nextInt();

            System.out.print("Digite a coluna (0 a " + (tabuleiro_tamanho - 1) + "): ");
            coluna = entrada.nextInt();

            if(linha < 0 || linha >= tabuleiro_tamanho || coluna < 0 || coluna >= tabuleiro_tamanho){ //Caso usuário coloque um valor inválido
                System.out.println("Coordenadas inválidas. Tente novamente.");
                continue;
            }

            if(acao == 'J'){
                if(tabuleiro[linha][coluna] == '*'){ //Se nas posições escolhidas tenha uma bomba, ative o sinalizador
                    System.out.println("Você perdeu! Uma bomba explodiu.");
                    situacao_do_jogo = false;
                }else{
                    Descobrir_celula(linha, coluna);
                    Fim_de_jogo();
                }
            }else if (acao == 'M'){
                Marcar_celula(linha, coluna);
            }else{
                System.out.println("Ação inválida. Tente novamente.");
            }
        }
        entrada.close();
    }

    public void Marcar_celula(int linha, int coluna) {
        if (tabuleiro_visivel[linha][coluna] == '-') {
            tabuleiro_visivel[linha][coluna] = 'M'; // Marcar a célula
        } else if (tabuleiro_visivel[linha][coluna] == 'M') {
            tabuleiro_visivel[linha][coluna] = '-'; // Desmarcar a célula
        }
    }

    public void Descobrir_celula(int linha, int coluna){
        int bombas_adjacentes, i, j;

        if(tabuleiro_visivel[linha][coluna] != '-'){ //Caso a celula já tenha sido descoberta antes
            System.out.println("Esta célula já foi descoberta.");
            return;
        }

        bombas_adjacentes = Contar_bombas_adjacentes(linha, coluna);
        tabuleiro_visivel[linha][coluna] = (char) (bombas_adjacentes + '0'); //Vai substituir por '0' na posicao escolhida, indicando que foi descoberto e quantidade de bombas proximas

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

    public int Contar_bombas_adjacentes(int linha, int coluna){ //Vai indicar a quantidade de bombas próximas ao quadrante
        int bombas_adjacentes = 0;
        int i, j;

        for(i = linha - 1; i <= linha + 1; i++){
            for(j = coluna - 1; j <= coluna + 1; j++){
                if(i >= 0 && i < tabuleiro_tamanho && j >= 0 && j < tabuleiro_tamanho && tabuleiro[i][j] == '*'){ //Esse 'if' é responsável por contar as bombas proximas ao local escolhido
                    bombas_adjacentes++; 
                }
            }
        }
        return bombas_adjacentes;
    }

    public void Fim_de_jogo(){
        boolean vitoria = true; //Sinalizador
        int i, j;

        for(i = 0; i < tabuleiro_tamanho; i++){
            for(j = 0; j < tabuleiro_tamanho; j++){
                if(tabuleiro[i][j] != '*' && tabuleiro_visivel[i][j] == '-'){ //Para continuação do jogo
                    vitoria = false;
                    break;
                }
            }
        }

        if(vitoria){ //Quando for terminado todos os campos
            System.out.println("Parabéns! Você ganhou o jogo.");
            situacao_do_jogo = false;
        }
    }

    public static void main(String[] args){
        int tamanho_do_tabuleiro = 10; //Tamanho do tabuleiro
        int numero_de_bombas = 15; //Quantidade de bombas

        Minado campo_minado = new Minado(tamanho_do_tabuleiro, numero_de_bombas);
        campo_minado.Jogar();
    }
}
