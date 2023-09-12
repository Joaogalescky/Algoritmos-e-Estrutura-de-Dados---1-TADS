import java.util.Scanner;

public class Teatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TeatroManager teatroManager = new TeatroManager();

        while (true) {
            System.out.println("Bem-vindo ao Sistema de Gerenciamento de Teatro!");
            System.out.println("Escolha uma opção:");
            System.out.println("1. Área Administrativa");
            System.out.println("2. Área de Cliente");
            System.out.println("3. Sair");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    teatroManager.menuAdministrativo();
                    break;
                case 2:
                    teatroManager.menuCliente();
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

class TeatroManager {
    private static final double VALOR_PADRAO_INGRESSO = 50.00;
    private int[][] mapaAssentos = new int[15][10]; // Mapa de assentos: 0-livre, 1-ocupado, 2-reservado
    private double valorIngresso = VALOR_PADRAO_INGRESSO;
    private int lugaresLivres = 150;
    private int lugaresReservados = 0;
    private int lugaresConfirmados = 0;
    private int ingressosEstudantes = 0;
    private double valorTotalArrecadado = 0.00;

    public void menuAdministrativo() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu Administrativo:");
            System.out.println("1. Modificar valor do ingresso");
            System.out.println("2. Visualizar mapa de assentos");
            System.out.println("3. Gerar relatório");
            System.out.println("4. Voltar ao menu principal");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Novo valor do ingresso: R$");
                    valorIngresso = scanner.nextDouble();
                    break;
                case 2:
                    visualizarMapaAssentos();
                    break;
                case 3:
                    gerarRelatorio();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public void menuCliente() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu Cliente:");
            System.out.println("1. Visualizar mapa de assentos");
            System.out.println("2. Realizar reserva");
            System.out.println("3. Cancelar reserva");
            System.out.println("4. Voltar ao menu principal");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    visualizarMapaAssentos();
                    break;
                case 2:
                    realizarReserva();
                    break;
                case 3:
                    cancelarReserva();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public void visualizarMapaAssentos() {
        System.out.println("\nMapa de Assentos:");
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 10; j++) {
                if (mapaAssentos[i][j] == 0) {
                    System.out.print("_ ");
                } else if (mapaAssentos[i][j] == 1) {
                    System.out.print("X ");
                } else if (mapaAssentos[i][j] == 2) {
                    System.out.print("R ");
                }
            }
            System.out.println();
        }
    }

    public void realizarReserva() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nRealizar Reserva:");
        System.out.print("Fila (0-14): ");
        int fila = scanner.nextInt();
        System.out.print("Cadeira (0-9): ");
        int cadeira = scanner.nextInt();

        if (fila < 0 || fila > 14 || cadeira < 0 || cadeira > 9) {
            System.out.println("Assento inválido. Tente novamente.");
            return;
        }

        if (mapaAssentos[fila][cadeira] == 0) {
            System.out.print("O cliente é estudante? (S/N): ");
            String resposta = scanner.next().toUpperCase();

            if (resposta.equals("S")) {
                valorTotalArrecadado += valorIngresso / 2;
                ingressosEstudantes++;
            } else {
                valorTotalArrecadado += valorIngresso;
            }

            mapaAssentos[fila][cadeira] = 2; // Marca como reservado
            lugaresReservados++;
            lugaresLivres--;
            System.out.println("Reserva realizada com sucesso.");
        } else {
            System.out.println("Este assento já está ocupado ou reservado.");
        }
    }

    public void cancelarReserva() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nCancelar Reserva:");
        System.out.print("Fila (0-14): ");
        int fila = scanner.nextInt();
        System.out.print("Cadeira (0-9): ");
        int cadeira = scanner.nextInt();

        if (fila < 0 || fila > 14 || cadeira < 0 || cadeira > 9) {
            System.out.println("Assento inválido. Tente novamente.");
            return;
        }

        if (mapaAssentos[fila][cadeira] == 2) {
            mapaAssentos[fila][cadeira] = 0; // Libera o assento
            lugaresReservados--;
            lugaresLivres++;
            System.out.println("Reserva cancelada com sucesso.");
        } else {
            System.out.println("Este assento não está reservado.");
        }
    }

    public void gerarRelatorio() {
        System.out.println("\nRelatório:");
        System.out.println("Quantidade de lugares livres: " + lugaresLivres);
        System.out.println("Quantidade de lugares reservados: " + lugaresReservados);
        System.out.println("Quantidade de lugares confirmados: " + lugaresConfirmados);
        System.out.println("Quantidade de ingressos de estudantes: " + ingressosEstudantes);
        System.out.println("Valor total arrecadado: R$" + valorTotalArrecadado);
    }
}