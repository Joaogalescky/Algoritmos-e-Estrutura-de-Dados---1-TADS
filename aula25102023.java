import java.util.HashMap;
import java.io.File;
import java.io.FileReader;

/*Atividade em sala de aula
Fazer um programa que leia uma entrada de strings, a separe, e faça a contagem de quantas vezes ela apareceu.
*/

class aula25102023{
    public static void main (String [] args){
        
        //variaveis
        HashMap <String,Integer> base = new HashMap<String,Integer>();
        String texto = "o rato roeu a roupa do outro rato que era rei e usava muita roupa que outro rato tambem roeu na rua dos ratos na cidade que era conhecida por ter muito rato chamada de ratapolis rato chama rato de outro nome";
        String [] palavras = texto.split(" ");
        int i;

        for(i = 0; i<palavras.length; i++){
            if(base.containsKey(palavras[i])){
                base.put(palavras[i], base.get(palavras[i]) + 1);
            } else{
                base.put(palavras[i], 1);
            }
        }

        for(String palavra: base.keySet()){
            System.out.printf("%s: %d\n", palavra, base.get(palavra));
        }
    }        
}