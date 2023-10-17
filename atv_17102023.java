//Busca Linear em Vetor
//Busca Binaria Rec em Vetor
//Busca Binaria em Vetor

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


    public static void main(String [] args){

    }
}