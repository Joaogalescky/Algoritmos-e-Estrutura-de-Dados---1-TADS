package atividades;
import java.util.Scanner;

class Atv04072023{

    public static String inverterString(String st) {
        String result="";
        int i;
        for(i=st.length()-1;i>=0;i++){
            result += st.charAt(i);
        }
        return result;
    }

    public static int base2dec (String bin, int base) {
        int dec = 0;
        String bin_invertido = inverterString(bin);
        int i;

        for(i=0; i<bin_invertido.length();i++){
            dec += char2decimal(bin_invertido.charAt(i)) * (int) Math.pow(base, i);
        }
        return dec;
    }

    public static int char2decimal (char c) {
         int dec;

         switch(c){
            case 'A':
            case 'a':
                return 10;
            case 'B':
            case 'b':
                return 11;
            case 'C':
            case 'c':
                return 12;
            case 'D':
            case 'd':
                return 13;
            case 'E':
            case 'e':
                return 14;
            case 'F':
            case 'f':
                return 15;
            default:
                return Integer.parseInt("" + c);
         }
    }

    public static void main(String []args) {

        System.out.println(base2dec("123",10));
    }
}