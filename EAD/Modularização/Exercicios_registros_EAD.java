import java.util.Scanner;

/*Exercício 9
Crie uma estrutura representando os alunos de um determinado curso. A estrutura deve conter a matrícula do aluno, nome, nota da primeira prova, nota da segunda prova e nota da terceira prova. Desenvolva um sistema que utiliza esta estrutura, de forma que o sistema permita cadastrar dados referentes a 5 alunos, e após realizado o cadastro o sistema apresente:*/

/*Saída - exemplo
Qual foi o/a aluno/a com maior nota da primeira prova.
Qual aluno/a possui a maior média geral.
Qual aluno/a possui a menor média geral.
Para cada aluno diga se ele foi aprovado ou reprovado, considerando o valor 7 para aprovação.
*/

class Matricula{
    int matricula = 0, nota = 7;
    String nome = "";
    float nota_1 = 0, nota_2 = 0, nota_3 = 0;
    float media = (nota_1 + nota_2 + nota_3)/3;
}

class Exercicios_registros_EAD{

    public static Matricula Entrada() {
        
        Scanner entrada = new Scanner (System.in);
        
        //variaveis
        Matricula aluno = new Matricula();

        System.out.println("== Dados do/a aluno/a ==");

        System.out.println("Nome: ");
        aluno.nome = entrada.nextLine();

        System.out.println("Matricula: ");
        aluno.matricula = entrada.nextInt();

        System.out.println("Nota da 1° prova: ");
        aluno.nota_1 = entrada.nextFloat();

        System.out.println("Nota da 2° prova: ");
        aluno.nota_2 = entrada.nextFloat();
        
        System.out.println("Nota da 3° prova: ");
        aluno.nota_3 = entrada.nextFloat();

        return aluno;
    }

    public static void Boletim_saida(Matricula aluno) {
        System.out.println("Nome         : "+aluno.nome);
        System.out.println("Matricula    : "+aluno.matricula);
        System.out.println("Nota 1° Prova: "+aluno.nota_1);
        System.out.println("Nota 2° Prova: "+aluno.nota_2);
        System.out.println("Nota 3° Prova: "+aluno.nota_3);
        System.out.println("Média        : "+aluno.media);

        int n_alunos = 5;
        Matricula[] alunos = new Matricula[n_alunos];
    }

    public static void Resultado() {
        
    //     for(int i = 0; i < alunos.length; i++){
    //         if(aluno.nota_1 > nota){
    //             System.out.println("Aluno(a) "+aluno.nome+" da matricula " +aluno.matricula+ " teve a maior nota da prova 1°!\n");
    //             System.out.printf("Nota: .1f\n", aluno.nota_1);
    //         }
    //         if(aluno.media > nota){
    //             System.out.println("Aluno(a) "+aluno.nome+" da matricula " +aluno.matricula+ " teve a maior média!\n");
    //             System.out.printf("Média: .1f\n", aluno.media);
    //         }
    //         if(aluno.media < nota){
    //             System.out.println("Aluno(a) "+aluno.nome+" da matricula " +aluno.matricula+ " teve a menor média!\n");
    //             System.out.printf("Média: .1f\n", aluno.media);
    //         }
    //     }

    //     for(int i = 0; i < alunos.length; i++){
    //         if(aluno[i] > nota){
    //                aluno[i] = aluno.aprovado;
    //             System.out.println("Aluno(a)"+aluno.aprovado+"aprovado!\n");
    //         } else{
    //                aluno[i] = aluno.reprovado;
    //             System.out.println("Aluno(a)"+aluno.reprovado+"reprovado!\n");
    //         }
    //     }
    }

    public static void Boletim_entrada(){

        //variaveis
        int n_alunos = 5, i;
        Matricula[] alunos = new Matricula[n_alunos]; //Vetor (Array)

        //processamento da saida
        for(i = 0; i < alunos.length; i++){
            System.out.printf("== Aluno(a) %d ==\n", i);
            alunos[i]= Entrada(); //chamando a função "Entrada"
        }

        for(i = 0; i < alunos.length; i++){
            System.out.printf("== Aluno(a) %d ==\n", i);
            Boletim_saida(alunos[i]); //chamando a função "Boletim_saida"
        }
    }

    public static void main(String[] args) {

        Boletim_entrada();
    }
}