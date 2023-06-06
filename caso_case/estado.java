package caso_case;
import java.util.Scanner;

public class estado{
    public static void main (String[] args) {

        //variaveis
           String sigla_estado;
           Scanner entrada;

        //entrada
            entrada = new Scanner(System.in);
            System.out.println("Digite uma sigla de Estado: ");
            sigla_estado = entrada.next();
            entrada.close();

        //processamento e saida
        switch(sigla_estado) {
        case "PR":
        case "pr":
        System.out.println("Código 41, Estado Paraná, Região Sul");
        break;
        case "SC":
        case "sc":
        System.out.println("Código 42, Estado Santa Catarina, Região Sul");
        break;
        case "RS":
        case "rs":
        System.out.println("Código 43, Estado Rio Grande do SUl, Região Sul");
        break;
        case "MS":
        case "ms":
        System.out.println("Código 50, Estado Mato Grosso do Sul, Região Centro Oeste");
        break;
        case "MT":
        case "mt":
        System.out.println("Código 51, Estado Mato Grosso, Região Centro Oeste");
        break;
        case "GO":
        case "go":
        System.out.println("Código 52, Estado Goiás, Região Centro Oeste");
        break;
        case "DF":
        case "df":
        System.out.println("Código 53, Estado Distrito Federal, Região Centro Oeste");
        default:
        System.out.println("Sigla inválida");
        }
    }
}


