public class aula27112023_CountingSort{

    public static int[] countingSort(int[] v) {
        // int[] v = new int [] {0, 3, 2, 3, 0, 1, 3, 2};
        int[] count;
        int[] saida = new int [v.length];
        int max = v[0];
        int i, j, val;

        // // Descobrir o maior valor "max"
        // for(j = 0; j < v.length; j++){
        //     if(max < v[j]){
        //         max = v[j];
        //         // if(v[j] > v[j - 1]){
        //         //     max = v[j];
        //         // } else{
        //         //     max = v[j - 1];
        //         // }
        //     }
        // }

        for(i = 1; i < v.length; i++){
            if(v[i] > max){
                max = v[i];
            }
        }

        count = new int [max + 1];

        for(i = 0; i < v.length; i++){
            val = v[i];
            count[val]++;
        }

        for(i = 1; i < count.length; i++){
            count[i] = count[i] + count[i - 1];
        }

        for(i = v.length - 1; i >= 0; i--){
            val = v[i];
            count[val]--;
            saida[count[val]] = val;
        }

        return saida;
    }

    public static void main(String[] args) {
        int[] v = new int [] {0, 3, 2, 3, 0, 1, 3, 2};
        int[] saida = countingSort(v);
        
        for(int i = 0; i < saida.length; i ++){
            System.out.printf("%d ", saida[i]);
        }
        System.out.println();
    }
}