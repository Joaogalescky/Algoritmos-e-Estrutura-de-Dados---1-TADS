import java.util.Scanner;

public class numeroporextenso1a99 {
    public static void main(String[] args){
                //variáveis
                Scanner entrada;
                int numero, unidade, dezena;
                String palavra1, palavra2;

                //entrada
                entrada = new Scanner(System.in);
                numero = entrada.nextInt();
                entrada.close();

                //processamento
                //Utilizando case
                //A dezena será o número que o usuário digitou / por 10 (10/10=1)
                dezena=(numero/10);
                //A unidade será o número que o usuário digitou / por 10, pegando a sua sobra (11/10=1) sobrou 1
                unidade=(numero%10);
                    switch(dezena){
                        case 1:
                        palavra1 = "décimo";
                        System.out.printf("%s", palavra1);
                        break;
                        case 2:
                        palavra1 = "vingesimo";
                        System.out.printf("%s", palavra1);
                        break;
                        case 3:
                        palavra1 = "trigésimo";
                        System.out.printf("%s", palavra1);
                        break;
                        case 4:
                        palavra1 = "quadragésimo";
                        System.out.printf("%s", palavra1);
                        break;
                        case 5:
                        palavra1 = "quinquagésimo";
                        System.out.printf("%s", palavra1);
                        break;
                        case 6:
                        palavra1 = "sexagésimo";
                        System.out.printf("%s", palavra1);
                        break;
                        case 7:
                        palavra1 = "setuagésimo";
                        System.out.printf("%s", palavra1);
                        break;
                        case 8:
                        palavra1 = "octogésimo";
                        System.out.printf("%s", palavra1);
                        break;
                        case 9:
                        palavra1 = "nonagésimo";
                        System.out.printf("%s", palavra1);
                        break;
                    }
                    switch(unidade){
                        case 0:
                        palavra2 = "";
                        break;
                        case 1:
                        palavra2 = "primeiro";
                        System.out.printf(" %s\n", palavra2);
                        break;
                        case 2:
                        palavra2 = "segundo";
                        System.out.printf(" %s\n", palavra2);
                        break;
                        case 3:
                        palavra2 = "terceiro";
                        System.out.printf(" %s\n", palavra2);
                        break;
                        case 4:
                        palavra2 = "quarto";
                        System.out.printf(" %s\n", palavra2);
                        break;
                        case 5:
                        palavra2 = "quinto";
                        System.out.printf(" %s\n", palavra2);
                        break;
                        case 6:
                        palavra2 = "sexto";
                        System.out.printf(" %s\n", palavra2);
                        break;
                        case 7:
                        palavra2 = "setimo";
                        System.out.printf(" %s\n", palavra2);
                        break;
                        case 8:
                        palavra2 = "oitavo";
                        System.out.printf(" %s\n", palavra2);
                        break;
                        case 9:
                        palavra2 = "nono";
                        System.out.printf(" %s\n", palavra2);
                        break;
                    }
                }
            }
