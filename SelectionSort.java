import java.util.Arrays;
import java.util.Scanner;

class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] entrada = sc.nextLine().split(" ");
        int[] v = new int[entrada.length];
        for(int i = 0; i < entrada.length; i++){
            v[i] = Integer.parseInt(entrada[i]);
        }
        selectionSort(v);
    }

    public static void troca(int[] v,int i, int j){

        int aux = v[i];
        v[i] = v[j];
        v[j] = aux;
        
    }

    public static int[] selectionSort(int[] v){
        for(int i = 0; i < v.length; i++){
            int indexMenor = i;
            for(int j = i + 1; j < v.length; j++){
                if(v[j] < v[indexMenor]){
                    indexMenor = j;
                }
            }
            
            if(indexMenor != i){
                troca(v, i, indexMenor);
                System.out.println(Arrays.toString(v));
            }
        }
        return v;
    }
}
