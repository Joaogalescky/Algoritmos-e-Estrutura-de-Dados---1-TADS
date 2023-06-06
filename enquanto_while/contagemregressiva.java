package enquanto_while;
import java.lang.Thread;
//para utilizar o timer de saida, precisa importar esse procedimento
class contagemregressiva{
    public static void main(String[] args) throws InterruptedException{

        int contador;
    
        contador = 10;

        while(contador>=0){
            //while é igual a enquanto
            System.out.println(contador);

            Thread.sleep(1000);
            // thread.sleep atua como timer da saida
            contador = contador - 1;
        }
    }
}