import java.util.Arrays;
import java.util.Scanner;

class InsercaoOrdenadaPrimeiro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] entrada = sc.nextLine().split(" ");
        int[] v = new int[entrada.length];
        for(int i = 0; i < entrada.length; i++){
            v[i] = Integer.parseInt(entrada[i]);
        }
        insertion(v);
        System.out.println(Arrays.toString(v));
    }

    public static void troca(int[] v,int i, int j){

        int aux = v[i];
        v[i] = v[j];
        v[j] = aux;
        
    }

    public static void insertion(int[] v){
        int j = 0;
        while(j < v.length - 1 && v[j] > v[j + 1]){
            troca(v, j, j + 1);
            j++;
        }
    }
}
