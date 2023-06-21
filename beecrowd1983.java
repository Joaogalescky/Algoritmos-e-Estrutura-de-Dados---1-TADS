import java.util.Scanner;

public class beecrowd1983{
    public static void main(String[] args){
 
        //variaveis
        int alunos, matricula, matricula_M, i;
        Double nota, nota_M;
        
        //entrada
        Scanner entrada = new Scanner (System.in);
        alunos = entrada.nextInt();
        nota_M = 0.0;
        matricula_M = 0;
        
        //processamento
        for(i=0;i<alunos;i++){ //Sistema de repetição
            matricula = entrada.nextInt();
            nota = entrada.nextDouble();
                if(nota>nota_M && nota>=8){ //Se a "nota" for maior que "nota_M" e "nota" maior ou igual a 8
                nota_M = nota; //"nota_M" vai guardar o valor da "nota"
                matricula_M = matricula; //"matricula_M" vai guardar o valor da "matricula"
                }
        }

        //saida
        if(nota_M==0){ //Se a "nota_M" for menor que 8
        System.out.println("Minumum note not reached");
        } else{ //Senão, sistema gera a saida da "matricula_M"
        System.out.println(matricula_M);
        }
    }
}


//https://github.com/eduardo-mior/URI-Online-Judge-Solutions/blob/master/Iniciante/URI%201983.java