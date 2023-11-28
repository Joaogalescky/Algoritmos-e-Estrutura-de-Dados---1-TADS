public class aula28112023_countingSort{

    public static int getValPos(int val, int pos){
        return (int) (val % (int) Math.pow(10, pos + 1) / (int) Math.pow(10, pos));
    }

    public static void saida() {
        int x = 345;
        int p = 15;
        
        System.out.printf("%d - %d - %d\n", x, p, getValPos(x, p));
    }

    public static int[] countingSortPos(int[] v, int pos) {
        int [] saida = new int [v.length];
        int [] count = new int [10];
        int i, val_pos, val;

        for(i = 0; i < v.length; i++){
            count[getValPos(v[i], pos)]++;
        }

        for(i = 1; i < count.length; i++){
            count[i] += count[i - 1]; 
        }

        return saida;
    }

    public static int[] radixSort(int[] v) {
        int max, i, n, pos;
        String max_str;

        if(v.length <= 1 ){
            return v;
        }

        max = v[0];
        for(i = 1; i < v.length; i++){
            if(v[i] > max){
                max = v[i];
            }
        }

        max_str = max + "";
        n = max_str.length();
        System.out.println(n);

        for(pos = 0; pos < n; pos++){
            v = countingSortPos(v, pos);
        }


        return v;
    }

    public static void main(String[] args) {
        int[] v = new int [] {42, 36, 26, 44, 31, 55};
        // int max = 2;
        // int count = max + 1;

    }
}