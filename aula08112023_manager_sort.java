public class aula08112023_manager_sort{

    public static void troca(int []vetor, int pos_a, int pos_b){
        int aux = vetor[pos_b];
        vetor[pos_b] = vetor[pos_a];
        vetor[pos_a] = aux;
    }

    public static int[] merge (int[] vetor_a, int[] vetor_b){
        int[] res = new int[vetor_a.length + vetor_b.length];

        if(vetor_a.length == 0){
            return vetor_b;
        }
        if(vetor_b.length == 0){
            return vetor_a;
        }

        int i = 0, j = 0, k = 0;

        for(k = 0; k < res.length; k ++){
            if(i < vetor_a.length && j < vetor_b.length){
                if(vetor_a[i] < vetor_b[j]){
                    res[k] = vetor_a[i];
                    i++;
                } else{
                    res[k] = vetor_b[j];
                    j++;
                }
            } else{
                if(i > vetor_a.length){
                    res[k] = vetor_b[j];
                    j++;
                } else{
                    res[k] = vetor_a[i];
                    i++;
                }
            }
        }
        return res;
    }


    public static void main(String[] args){
        int[] x = new int []{15, 19, 28};
        int[] y = new int []{14, 16, 30, 35};
        int[] res = merge(x, y);
        int i;

        for(i = 0; i < res.length; i++){
            System.out.printf("%d ", res[i]);
        }
        System.out.println();
    }
}
