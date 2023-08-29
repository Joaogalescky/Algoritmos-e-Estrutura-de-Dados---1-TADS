import java.util.Scanner;

class Produto{
    String descricao = "";
    int lote = 0;
    float peso = 0.0f;
}

class Cartao{
    String nome, bandeira, numero_cartao;
    int cvv, validadeano, validademes;
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
        c.validademes = entrada.nextInt();
        c.validadeano = entrada.nextInt();

        System.out.println("CVV (Codigo de Seguranca): ");
        c.cvv = entrada.nextInt();
        entrada.close();

        return c;

        // cartao_1.nome = "João Gomes da Silva";
        // cartao_1.data_de_validade = "09/2025";
        // cartao_1.cvv = 754;
        // cartao_1.numero_cartao = "4567874585124893";

        // cartao_2.nome = "Henrique Gall Pereira";
        // cartao_2.data_de_validade = "03/2025";
        // cartao_2.cvv = 845;
        // cartao_2.numero_cartao = "8794764528744895";

        // System.out.printf("Cartao de credito de: %s, %s, %d, %s\n", cartao_1.nome, cartao_1.numero_cartao, cartao_1.cvv, cartao_1.data_de_validade);
        // System.out.printf("Cartao de credito de: %s, %s, %d, %s\n", cartao_2.nome, cartao_2.numero_cartao, cartao_2.cvv, cartao_2.data_de_validade);
    }

    public static void Cartao_Saida(Cartao cartao){
        System.out.println("Nome      : "+cartao.nome);
        System.out.println("Numero    : "+cartao.numero_cartao);
        System.out.println("Bandeira  : "+cartao.bandeira);
        System.out.println("Vencimento: "+cartao.vencimentomes+"/"+cartao.vencimentoano);
        System.out.println("CVV       : "+cartao.cvv);
    }

    public static void main(String[] args) {
        
        //variaveis
        int n_clientes = 3, i;

        Cartao cliente_1;

        Cartao[] cartoes = new Cartao_bancario(n_clientes);

        System.out.println("=== NOVO SISTEMA DA AMAZON PRIME ===");
        for(i = 0; i < n_clientes; i++){
            cartoes[i]= new Cartao();
        }

        for(i = 0; i < n_clientes; i++){
            System.out.printf("** Cliente %d **\n", i);
            Cartao_Saida(cartoes[i]);
        }



        //Produto_saida();
    }
}