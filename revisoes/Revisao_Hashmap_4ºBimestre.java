package revisoes;
import java.util.HashMap;
import java.util.LinkedList;

public class Revisao_Hashmap_4ºBimestre {

    /* Classe HashMap: 
    * A classe HashMap é utilizada para tabelas de dispersão (hash tables), sendo eficiente para procurar valores associados a chaves.
    * ---> Lembrete: cuidar com possíveis colisões de chaves na mesma posição após a função de dispersão.
    */

    /* Vantagem:
     * HashMap's podem proporcionar acesso rápido aos elementos, geralmente em tempo médio  O(1) para operações de inserção, busca e remoção, desde que a função de dispersão seja bem projetada.
    */

    /* Estrutura de Dados:
     * O HashMap utiliza uma tabela de dispersão (hash table) para armazenar os elementos. Cada elemento é armazenado como um par chave-valor em um "balde" correspondente ao seu código de dispersão (hash code).
    */

    /* Hash Code:
     * A função hashCode() de cada chave é usada para calcular o índice no array interno. Isso ajuda a distribuir as chaves de maneira uniforme pela tabela de dispersão.
    */

    /* Tabela de dispersão (hash table):
     * É uma estrutura de dados que implementa uma coleção de pares chaves-valor. Utiliza uma função de dispersão (hash function) para mapear as chaves para índices, onde os valores associados são armazenados.
    */

    /* Função de dispersão (hash fuction):
     * É uma funsão responsável por transformar a chave em um índice na tabela, distribuindo as chaves de forma uniforme para minimizar colisões.
    */
    
    /* Colisões:
     * São colisões de duas chaves diferentes, resultando em um mesmo índice após a aplicação da 'hash fuction'.
    */

    /* Resolução de Colisões:
     * Em caso de colisões (quando duas chaves têm o mesmo código de dispersão), o HashMap utiliza listas vinculadas (linked lists) nos balde para armazenar os elementos associados àquele código.
    */

    /* Encadeamento (Chaining):
     * Cada célula da 'hash table' contém uma lista ou estrutura de dados para armazenar múltiplos elementos que mapearam para o mesmo índice.
    */

    /* Encadeamento Aberto (Open Addressing):
     * É uma solução procura pelo algoritmo após uma colisão, o algoritmo consiste na procura pelo próximo slot vazio na tabela por meio de uma estratégia específica (sondagem linear ou quadrática). 
    */

    /* Capacidade e Fator de Carga:
     * O HashMap tem uma capacidade inicial e um fator de carga. Quando a quantidade de elementos atinge um determinado limite (capacidade * fator de carga), a tabela de dispersão é redimensionada e os elementos são redistribuídos.
    */

    /*Condições:
     *
    Chaves Únicas:
     * Cada chave em um HashMap deve ser única. Se você tentar adicionar uma chave que já existe, o valor associado àquela chave será substituído.
    Null
     * O HashMap permite chaves e valores nulos. No entanto, há apenas uma chave nula permitida.
    */

    /*Pontos Positivos:
     * 
    Eficiência em Recuperação:
    A recuperação de valores com base em chaves é extremamente eficiente devido à tabela de dispersão. A complexidade média para operações como get() é O(1) em condições ideais.
     * 
    Flexibilidade:
    O HashMap é flexível e pode ser usado para uma variedade de situações. Ele é amplamente utilizado em aplicativos Java.
     *
    Boa Performance:
    Em condições normais, o HashMap oferece um bom desempenho para operações de adição, remoção e recuperação.
    */

    /*Pontos Negativos:
     * 
     Consumo de Memória: 
     * O HashMap pode consumir mais memória do que estruturas de dados mais simples, especialmente se a capacidade inicial for definida muito alta.
     *
     Iteração e Ordem:
     A ordem dos elementos em um HashMap não é garantida, pois depende da distribuição dos códigos de dispersão. Se a ordem é importante, pode-se usar, por exemplo, um LinkedHashMap.
     * 
     Colisões:
     * Em casos de colisões frequentes, o desempenho pode degradar, especialmente se a função de dispersão não distribuir uniformemente as chaves.
    */

    /*Rapidez:
     * 
     Hashing Eficiente:
     * A rapidez do HashMap está relacionada à eficiência do algoritmo de hash. Um bom algoritmo de hash minimiza colisões e distribui as chaves uniformemente pela tabela de dispersão.
     *
     Complexidade Média Constante:
     *Devido ao uso eficiente de códigos de dispersão e listas vinculadas, a complexidade média de muitas operações é constante, proporcionando rapidez em cenários comuns.
     *
     Redimensionamento Dinâmico:
     * O redimensionamento dinâmico da tabela de dispersão permite que o HashMap ajuste automaticamente sua estrutura para manter um bom desempenho, mesmo com mudanças no número de elementos.
     * Em resumo, a eficiência do HashMap está relacionada à sua estrutura de tabela de dispersão, algoritmo de hash eficiente e capacidade de redimensionamento dinâmico para lidar com diferentes tamanhos de conjuntos de dados.
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