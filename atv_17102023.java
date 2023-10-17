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

import java.util.Scanner;

class atv_17102023{

//Busca binaria recursiva e não recursiva
    public buscaBinarioRec(int[] valores, int e){
        return buscaBinariaRecInterna(valores, e, o ,valores.length - 1);
    }

    public buscaBinariaRecInterna(int[] valores, int x, int ini, int fim){
        if(ini > fim){
        return false;
        }
        int meio = ini + (fim - ini)/2;
        if(valores[meio] == x){
            return true;
        }
        if(e > valores[meio]{
            return buscaBinariaRecInterna(valores, x, meio + 1, fim);
        })
        return buscaBinariaRecInterna(valores, x, ini, meio - 1);
    }

    public buscaBinaria(int [] valores, int x){
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

//Busca linear
    public buscaLinear(int[] valores, int x){
        for( i = 0; i < valores.length; i ++){
            if(valores[i] == (x){
                return i;
            })
        }
        return - 1;
    }

    public static void main(String [] args){

    }
}