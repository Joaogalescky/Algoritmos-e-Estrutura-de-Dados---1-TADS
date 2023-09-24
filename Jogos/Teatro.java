import java.util.Scanner;

/*Trabalho referente ao conteúdo do 3º bimestre.

- Devem ser entregues os arquivos Teatro.java e Minado.java.
- Atenção ao prazo máximo para entrega: 01/10/2023 até às 22:00 horas
- As apresentações dos trabalhos serão nos dias 03-04/10/2023.
*/

public class Teatro{
    public static void main(String[] args){

        //Variaveis
        Scanner entrada = new Scanner(System.in);
        Gerenciamento gerenciador = new Gerenciamento();
        int escolher;

        while(true){
            //Menu
            System.out.println("\nBem-vindo ao Sistema de Gerenciamento de Teatro!");
            System.out.println("Escolha uma opção:");
            System.out.println("1. Área Administrativa");
            System.out.println("2. Área de Cliente");
            System.out.println("3. Sair");

            escolher = entrada.nextInt();

            //Ações do menu
            switch(escolher){
                case 1:
                    gerenciador.menu_administrativo();
                    break;
                case 2:
                    gerenciador.menu_cliente();
                    break;
                case 3:
                    System.out.println("Saindo do sistema. Obrigado!");
                    System.exit(0);
                    break;
                default:
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}

class Gerenciamento{

    //Variaveis
    private double valor_ingresso_atual = 50.00;
    private int[][] mapa_assentos = new int[15][10]; //Mapa de assentos: 0-livre, 1-ocupado, 2-reservado
    private double valor_ingresso = valor_ingresso_atual;
    private int assentos_livres = 150;
    private int assentos_reservados = 0;
    private int assentos_confirmados = 0;
    private int ingressos_estudantes = 0;
    private double total_arrecadado = 0.00;

    public void menu_administrativo(){
        Scanner entrada = new Scanner(System.in);
        int escolher;
        
        while(true){
            //Menu
            System.out.println("\nMenu Administrativo:");
            System.out.println("1. Visualizar mapa de assentos");
            System.out.println("2. Gerar relatório");
            System.out.println("3. Alterar valor do ingresso");
            System.out.println("4. Voltar ao menu principal");

            escolher = entrada.nextInt();

            //Ações do menu
            switch(escolher){
                case 1:
                    ver_mapa_assentos();
                    break;
                case 2:
                    relatorio();
                    break;
                case 3:
                    System.out.println("Digite o novo valor do ingresso:");
                    valor_ingresso = entrada.nextDouble();
                    System.out.println("Valor do ingresso alterado para R$:" + valor_ingresso);
                    break;
                case 4:
                    return;
                default:
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public void menu_cliente(){
        Scanner entrada = new Scanner(System.in);
        int escolher;

        //Menu
        while(true){
            System.out.println("\nMenu Cliente:");
            System.out.println("1. Visualizar mapa de assentos");
            System.out.println("2. Realizar reserva");
            System.out.println("3. Cancelar reserva");
            System.out.println("4. Voltar ao menu principal");

            escolher = entrada.nextInt();

            //Ações do menu
            switch(escolher){
                case 1:
                    ver_mapa_assentos();
                    break;
                case 2:
                    reservar();
                    break;
                case 3:
                    cancelar_reserva();
                    break;
                case 4:
                    return;
                default:
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public void ver_mapa_assentos(){
        System.out.println("\nMapa de Assentos:");

        for(int i = 0; i < 15; i++){ //Sistema de repetição: linhas da matriz
            for(int j = 0; j < 10; j++){ //Sistema de repetição: colunas da matriz

                if(mapa_assentos[i][j] == 0){ //0 = livre
                    System.out.print("_ ");
                } else if(mapa_assentos[i][j] == 1){ //1 = ocupado
                    System.out.print("X ");
                } else if(mapa_assentos[i][j] == 2){ //2 = reservado
                    System.out.print("R ");
                }
            }
            System.out.println();
        }
    }

    public void reservar(){
        //Variaveis
        Scanner entrada = new Scanner(System.in);
        int coluna, linha;
        String resposta;

        //entrada
        System.out.println("\nRealizar Reserva:");

        System.out.print("Filas entre 0 a 14: ");
        coluna = entrada.nextInt();

        System.out.print("Cadeiras entre 0 a 9: ");
        linha = entrada.nextInt();

        //processamento
        if (coluna < 0 || coluna > 14 || linha < 0 || linha > 9){ //Colocar conforme os valores colocados no vetor matriz
            System.out.println("Assento inválido. Tente novamente.");
            return;
        }

        //Caso seja estudante
        if(mapa_assentos[coluna][linha] == 0){
            System.out.print("O cliente é estudante? (S/N): ");
            resposta = entrada.next().toUpperCase(); //Tornar carácter maiúsculo
        
        if(resposta.equals("S")){
                total_arrecadado += valor_ingresso / 2;
                ingressos_estudantes++;
            }else{
                total_arrecadado += valor_ingresso;
            }

            mapa_assentos[coluna][linha] = 2; //Marcar como reservado
            assentos_reservados++;
            assentos_livres--;
            System.out.println("Reserva realizada com sucesso.");
        }else{
            System.out.println("Este assento já está ocupado ou reservado.");
        }
    }

    public void cancelar_reserva(){
        Scanner entrada = new Scanner(System.in);
        int coluna, linha;
        System.out.println("\nCancelar Reserva:");

        System.out.print("Filas entre 0 a 14: ");
        coluna = entrada.nextInt();

        System.out.print("Cadeiras entre 0 a 9: ");
        linha = entrada.nextInt();

        if(coluna < 0 || coluna > 14 || linha < 0 || linha > 9){ //Colocar conforme os valores colocados no vetor matriz
            System.out.println("Assento inválido. Tente novamente.");
            return;
        }

        if(mapa_assentos[coluna][linha] == 2){
            mapa_assentos[coluna][linha] = 0; //Liberar o assento
            assentos_reservados--;
            assentos_livres++;
            System.out.println("Reserva cancelada com sucesso.");
        }else{
            System.out.println("Este assento não está reservado.");
        }
    }

    public void relatorio(){
        System.out.println("\nRelatório:");
        System.out.println("Quantidade de lugares livres: " + assentos_livres);
        System.out.println("Quantidade de lugares reservados: " + assentos_reservados);
        System.out.println("Quantidade de lugares confirmados: " + assentos_confirmados);
        System.out.println("Quantidade de ingressos de estudantes: " + ingressos_estudantes);
        System.out.println("Valor total arrecadado: R$" + total_arrecadado);
    }
}