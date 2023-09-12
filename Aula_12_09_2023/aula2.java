public class aula2 {
    //Resolução do professor sobre a atividade, arquivo "Aula"
    public static void main(String[] args) {
        String alfabeto = "abcdefghijklmnopqtyuixz";
        int contador[] = new int[26];
        String texto = "Boa noite pessoal. Tude bem?";
        int i, j;

        for(i = 0; i < texto.length(); i++){
            for(j = 0; j < alfabeto.length(); j++){
                if(texto.charAt(i) == alfabeto.charAt(j)){
                    contador[j]++;
                } 
            }
        }

        for( i = 0; i < alfabeto.length(); i++){
            System.out.printf("%c: %d\n", alfabeto.charAt(i), contador[i]);
        }
    }
}
