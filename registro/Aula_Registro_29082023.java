package registro;
import java.util.Scanner;

//Classs = Classe
//Classe é como um agrupamento de atributos, está atuando como um Registrador

class Produto{ //Classe
    String descricao = "";
    int lote = 0;
    float peso = 0.0f;
}

class Cartao{ //Classe
    String nome, bandeira, numero_cartao;
    int cvv, vencimento_ano, vencimento_mes;
}

class Aula_Registro_29082023{
    
    public static void Produto_saida() {

        //variaveis
        Produto prod_1, prod_2;
        prod_1 = new Produto();
        prod_2 = new Produto();

        prod_1.descricao = "Arroz";
        prod_1.lote = 100;
        prod_1.peso = 1000;

        prod_2.descricao = "Feijao";
        prod_2.lote = 38;
        prod_2.peso = 1000;
        
        System.out.printf("Produto: %d, %s, %.2f\n", prod_1.lote, prod_1.descricao, prod_1.peso);
        System.out.printf("Produto: %d, %s, %.2f\n", prod_2.lote, prod_2.descricao, prod_2.peso);
    }

    public static Cartao Cartao_bancario() {
        
        Scanner entrada = new Scanner (System.in);

        //variaveis
        Cartao c = new Cartao();

        System.out.println("Dados do cartão");
        System.out.println("Nome: ");
        c.nome = entrada.nextLine();

        System.out.println("Número de cartão: ");
        c.numero_cartao = entrada.nextLine();

        System.out.println("Bandeira: ");
        c.bandeira = entrada.nextLine();

        System.out.println("Mes e ano de vencimento: (separado por espaço) ");
        c.vencimento_mes = entrada.nextInt();
        c.vencimento_ano = entrada.nextInt();

        System.out.println("CVV (Codigo de Seguranca): ");
        c.cvv = entrada.nextInt();

        return c;
    }

    public static void Cartao_Saida(Cartao cartao){
        System.out.println("Nome      : "+cartao.nome);
        System.out.println("Numero    : "+cartao.numero_cartao);
        System.out.println("Bandeira  : "+cartao.bandeira);
        System.out.println("Vencimento: "+cartao.vencimento_mes+"/"+cartao.vencimento_ano);
        System.out.println("CVV       : "+cartao.cvv);
    }

    public static void main(String[] args) {
        
        //variaveis
        int n_clientes = 3, i;
        Cartao[] cartoes = new Cartao[n_clientes]; //Vetor (Array)

        System.out.println("=== NOVO SISTEMA DA AMAZON PRIME ===");
        for(i = 0; i < n_clientes; i++){
            System.out.printf("** Cliente %d **\n", i);
            cartoes[i]= Cartao_bancario();
        }

        for(i = 0; i < n_clientes; i++){
            System.out.printf("** Cliente %d **\n", i);
            Cartao_Saida(cartoes[i]);
        }
        
        //Produto_saida();
    }
}