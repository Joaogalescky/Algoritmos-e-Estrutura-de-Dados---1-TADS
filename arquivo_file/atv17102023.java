package arquivo_file;

//Busca Linear em Vetor
//Busca Binaria Rec em Vetor
//Busca Binaria em Vetor

/*Links binario
https://www.ime.usp.br/~pf/algoritmos/aulas/bubi.html
https://pt.khanacademy.org/computing/computer-science/algorithms/binary-search/a/binary-search#:~:text=A%20busca%20bin%C3%A1ria%20%C3%A9%20um,localiza%C3%A7%C3%B5es%20poss%C3%ADveis%20a%20apenas%20uma.
*/

/*Links linear
https://www.blogcyberini.com/2017/09/busca-linear.html
https://pt.wikipedia.org/wiki/Busca_linear
*/

public class atv17102023{

    //Busca binaria recursiva
    public static Object buscaBinarioRec(int[] valores, int e){
        return buscaBinariaRecInterna(valores, e, e, valores.length - 1);
    }

    /*Metódo recursivo real
    Verifica se o índice inicial é maior que o índice final.
    Se sim --> retorna 'false', indicando que não foi encontrado.
    Se não --> calcula o índice do meio e compara o valor nesse índice com o valor desejado.
    Caso iguais --> retorna 'true'.
    Se o valor desejado for maior, faz a busca recursiva na metade direita do array, caso contrário, faz a busca na metade esquerda.
    */
    public static boolean buscaBinariaRecInterna(int[] valores, int x, int ini, int fim){
        if(ini > fim){
        return false;
        }
        int meio = ini + (fim - ini)/2;
        if(valores[meio] == x){
            return true;
        }
        if(x > valores[meio]){
            return buscaBinariaRecInterna(valores, x, meio + 1, fim);
        }
        return buscaBinariaRecInterna(valores, x, ini, meio - 1);
    }

    /*Busca binaria não recursiva
    Implementa a busca não recursiva por meio de um loop while. Mantém uma janela definida
    pelos índices 'ini' e 'fim', ajustando-os com base na comparação do valor do meio com o valor desejado.
    */
    public static int buscaBinaria(int [] valores, int x){
        int ini = 0, fim = valores.length - 1, meio;
        while(ini <= fim){
            meio = ini + (fim - ini)/2;
            if(valores[meio] == x)
            return meio;
            if(x > valores[meio]){
                ini = meio + 1;
            } else{
                fim = meio - 1;
            }
        }
        return - 1;
    }

    /*Busca linear
    Realiza uma busca linear simples, percorrendo um array e comparando cada
    elemento com o valor desejado. Se encontrar, retorna o índice; Caso contrário, retorna '-1'.

    */
    public static int buscaLinear(int[] valores, int x){
        for(int i = 0; i < valores.length; i ++){
            if(valores[i] == (x)){
                return i;
            }
        }
        return - 1;
    }

    public static void main(String [] args){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int busca = 6;

        // Teste da busca binária recursiva
        boolean encontrouRec = (boolean) buscaBinarioRec(array, busca);
        System.out.println("Busca binária recursiva: " + (encontrouRec ? "Encontrou" : "Não encontrou"));

        // Teste da busca binária não recursiva
        int indiceBinario = buscaBinaria(array, busca);
        System.out.println("Busca binária não recursiva: " + (indiceBinario != -1 ? "Encontrou na posição " + indiceBinario : "Não encontrou"));

        // Teste da busca linear
        int indiceLinear = buscaLinear(array, busca);
        System.out.println("Busca linear: " + (indiceLinear != -1 ? "Encontrou na posição " + indiceLinear : "Não encontrou"));
    }
}