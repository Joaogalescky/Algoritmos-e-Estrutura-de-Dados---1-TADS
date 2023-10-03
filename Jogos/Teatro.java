import java.util.Scanner;

/*Trabalho referente ao conteúdo do 3º bimestre.

- Devem ser entregues os arquivos Teatro.java e Minado.java.
- Atenção ao prazo máximo para entrega: 01/10/2023 até às 22:00 horas
- As apresentações dos trabalhos serão nos dias 03-04/10/2023.
*/

public class Teatro{
    public static void main(String[] args){

        //variaveis
        Scanner entrada = new Scanner(System.in);
        Gerenciamento gerenciador = new Gerenciamento();
        int escolha;

        //menu principal
        while (true) {
            System.out.println("\nBem-vindo ao Sistema de Gerenciamento de Teatro!");
            System.out.println("Escolha uma opção:");
            System.out.println("1. Visualizar mapa de assentos");
            System.out.println("2. Realizar reserva");
            System.out.println("3. Confirmar reserva");
            System.out.println("4. Cancelar reserva");
            System.out.println("5. Alterar valor do ingresso");
            System.out.println("6. Gerar relatório");
            System.out.println("7. Sair");

            escolha = entrada.nextInt();

            //opções do menu
            switch (escolha) {
                case 1:
                    gerenciador.mapa_assentos();
                    break;
                case 2:
                    gerenciador.reservar();
                    break;
                case 3:
                    gerenciador.confirmar_reserva();
                    break;
                case 4:
                    gerenciador.cancelar_reserva();
                    break;
                case 5:
                    System.out.println("Digite o novo valor do ingresso:");
                    double novo_ingresso = entrada.nextDouble();
                    gerenciador.alterar_valor_ingresso(novo_ingresso);
                    break;
                case 6:
                    gerenciador.gerar_relatorio();
                    break;
                case 7:
                    System.out.println("Saindo do sistema. Obrigado!");
                    System.exit(0);
                    //System.exit = fecha o código
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}

class Gerenciamento{

    //variaveis privadas
    private double valor_ingresso = 50.0;
    private char[][] mapa_assentos = new char[14][10];
    private int assentos_disponiveis = 150;
    private int assentos_reservados = 0;
    private int assentos_confirmados = 0;
    private int vale_estudante = 0;
    private double total_arrecadado = 0.0;
    /* Private - oque é
    O private é um modificador de acesso que define o nível de visibilidade de uma classe, atributo ou método em Java.
    Significa que a variável somente será acessa pela classe/escopo que foi declarada, tornando a privada, não podendo ser usada fora dela.
    Torna-se útil quando deseja-se encapsular parte da lógica de um programa e restringir o acesso de uma classe em um contexto específico.
    */

    //mapa do teatro (matriz)
    public Gerenciamento(){
        for (int i = 0; i < 15; i++){
            for (int j = 0; j < 10; j++){
                mapa_assentos[i][j] = '_';
            }
        }
    }

    
    public void mapa_assentos(){
        System.out.println("\nMapa de Assentos:");
        System.out.println("=====================");
        System.out.println("         PALCO          ");
        System.out.println("=====================");


        for(int i = 0; i < 15; i++){ //sistema de repetição: linhas da matriz
            for(int j = 0; j < 10; j++){ //sistema de repetição: colunas da matriz
                System.out.print(mapa_assentos[i][j] + " "); //imprime o valor do elemento na posicao da matriz (cria a representação visual)
            }
            System.out.println();
        }
    }

    public void reservar(){

        //variaveis
        Scanner entrada = new Scanner(System.in);
        int fila, cadeira;

        //entrada
        System.out.println("\nRealizar Reserva:");

        System.out.print("Fila (0 a 14): ");
        fila = entrada.nextInt();

        System.out.print("Cadeira (0 a 9): ");
        cadeira = entrada.nextInt();

        //processamento
        if (fila < 0 || fila > 14 || cadeira < 0 || cadeira > 9){ //verificar os valores fornecidos da fila da cadeira
            System.out.println("Assento inválido. Tente novamente.");
            return;
        }

        if (mapa_assentos[fila][cadeira] == '_'){
            System.out.print("O cliente é estudante? (S/N): ");
            String resposta = entrada.next().toUpperCase();

            if(resposta.equals("S")){ //caso seja estudante
                mapa_assentos[fila][cadeira] = 'R'; //marcar como reservado
                assentos_reservados ++;
                assentos_disponiveis --;
                vale_estudante ++;
                System.out.println("Reserva realizada com sucesso.");
            }else{ //caso não, marcar da mesma forma
                mapa_assentos[fila][cadeira] = 'R';
                assentos_reservados ++;
                assentos_disponiveis --;
                System.out.println("Reserva realizada com sucesso.");
            }
        }else{
            System.out.println("Este assento já está ocupado ou reservado.");
        }
    }

    public void confirmar_reserva(){

        //variaveis
        Scanner entrada = new Scanner(System.in);
        System.out.println("\nConfirmar Reserva:");
        int fila, cadeira;

        //entrada
        System.out.print("Fila (0 a 14): ");
        fila = entrada.nextInt();

        System.out.print("Cadeira (0 a 9): ");
        cadeira = entrada.nextInt();

        //processamento
        if(fila < 0 || fila > 14 || cadeira < 0 || cadeira > 9){ 
            System.out.println("Assento inválido. Tente novamente.");
            return;
        }

        if(mapa_assentos[fila][cadeira] == 'R'){ //caso esteja reservado, trocar para confirmado
            mapa_assentos[fila][cadeira] = 'X';
            assentos_confirmados ++;
            assentos_reservados --;
            total_arrecadado += valor_ingresso;
            System.out.println("Reserva confirmada com sucesso.");
        }else{
            System.out.println("Assento não está reservado ou já está ocupado.");
        }
    }

    public void cancelar_reserva(){

        //variaveis
        Scanner entrada = new Scanner(System.in);
        int fila, cadeira;

        //entrada
        System.out.println("\nCancelar Reserva:");

        System.out.print("Fila (0 a 14): ");
        fila = entrada.nextInt();

        System.out.print("Cadeira (0 a 9): ");
        cadeira = entrada.nextInt();

        //processamento
        if(fila < 0 || fila > 14 || cadeira < 0 || cadeira > 9){ 
            System.out.println("Assento inválido. Tente novamente.");
            return;
        }

        if(mapa_assentos[fila][cadeira] == 'R'){ //para cancelar o assento reservado, tem que estar reservado
            mapa_assentos[fila][cadeira] = '_';
            assentos_reservados --;
            assentos_disponiveis ++;
            System.out.println("Reserva cancelada com sucesso.");
        }else{ //caso não esteja reservado, não cancele
            System.out.println("Este assento não está reservado.");
        }
    }

    public void alterar_valor_ingresso(double novo_ingresso) {

        if(novo_ingresso > 0){
            valor_ingresso = novo_ingresso;
            System.out.println("Valor do ingresso alterado para R$" + valor_ingresso);
        }else{
            System.out.println("O novo valor do ingresso deve ser maior que zero.");
        }
    }

    public void gerar_relatorio(){

        System.out.println("\nRelatório:");
        System.out.println("Quantidade de lugares livres: " + assentos_disponiveis);
        System.out.println("Quantidade de lugares reservados: " + assentos_reservados);
        System.out.println("Quantidade de lugares confirmados: " + assentos_confirmados);
        System.out.println("Quantidade de ingressos de estudantes: " + vale_estudante);
        System.out.println("Valor total arrecadado: R$" + total_arrecadado);
    }
}
