import java.util.LinkedList;

public class Revisao_Hashmap_4ºBimestre {

    /* Para oque serve? 
    * A classe HashMap é utilizada para tabelas de dispersão (hash tables), sendo eficiente para procurar valores associados a chaves.
    * ---> Lembrete: cuidar com possíveis colisões de chaves na mesma posição após a função de dispersão.
    */

    /* Vantagem?
     * HashMap's podem proporcionar acesso rápido aos elementos, geralmente em tempo médio  O(1) para operações de inserção, busca e remoção, desde que a função de dispersão seja bem projetada.
    */

    /* Tabela de dispersão (hash table) - oque é?
     * É uma estrutura de dados que implementa uma coleção de pares chaves-valor. Utiliza uma função de dispersão (hash function) para mapear as chaves para índices, onde os valores associados são armazenados.
    */

    /* Função de dispersão (hash fuction) - oque é?
     * É uma funsão responsável por transformar a chave em um índice na tabela, distribuindo as chaves de forma uniforme para minimizar colisões.
    */
    
    /* Colisões = oque é?
     * São colisões de duas chaves diferentes, resultando em um mesmo índice após a aplicação da 'hash fuction'.
    */

    /* Encadeamento (Chaining) - oque é?
     * Cada célula da 'hash table' contém uma lista ou estrutura de dados para armazenar múltiplos elementos que mapearam para o mesmo índice.
    */

    /* Encadeamento Aberto (Open Addressing) - oque é?
     * É uma solução procura pelo algoritmo após uma colisão, o algoritmo consiste na procura pelo próximo slot vazio na tabela por meio de uma estratégia específica (sondagem linear ou quadrática). 
    */

    private LinkedList<ParChaveValor>[] tabela;
    private int tamanho;

    public Revisao_Hashmap_4ºBimestre(int tamanho) {
        this.tamanho = tamanho;
        this.tabela = new LinkedList[tamanho];
    }

    private int hash(String chave) {
        return chave.hashCode() % tamanho;
    }

    public void inserir(String chave, String valor) {
        int indice = hash(chave);

        if (tabela[indice] == null) {
            tabela[indice] = new LinkedList<>();
        }

        tabela[indice].add(new ParChaveValor(chave, valor));
    }

    public String buscar(String chave) {
        int indice = hash(chave);

        if (tabela[indice] != null) {
            for (ParChaveValor par : tabela[indice]) {
                if (par.getChave().equals(chave)) {
                    return par.getValor();
                }
            }
        }

        return null;
    }

    public void remover(String chave) {
        int indice = hash(chave);

        if (tabela[indice] != null) {
            tabela[indice].removeIf(par -> par.getChave().equals(chave));
        }
    }

    public static void main(String[] args) {
        Revisao_Hashmap_4ºBimestre tabela = new Revisao_Hashmap_4ºBimestre(10);

        tabela.inserir("chave1", "valor1");
        tabela.inserir("chave2", "valor2");
        tabela.inserir("chave3", "valor3");

        System.out.println("Valor associado à chave2: " + tabela.buscar("chave2"));

        tabela.remover("chave2");

        System.out.println("Valor associado à chave2 após remoção: " + tabela.buscar("chave2"));
    }
}

class ParChaveValor {
    private String chave;
    private String valor;

    public ParChaveValor(String chave, String valor) {
        this.chave = chave;
        this.valor = valor;
    }

    public String getChave() {
        return chave;
    }

    public String getValor() {
        return valor;
    }
}