import java.util.Scanner;

public class BuscaLinear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] entrada = sc.nextLine().split(" ");
        int n = sc.nextInt();
        int[] inteiro = new int[entrada.length];

        for(int i = 0; i < entrada.length; i++){
            inteiro[i] = Integer.parseInt(entrada[i]);
        }

        System.out.println(BuscaLinearA(inteiro, n, 0));
    }

    public static int BuscaLinearA(int[] a, int n, int posicao){
        if(a[posicao] == n){
            return posicao;
        }
        if(posicao == a.length - 1){
            return -1;
        }
        return BuscaLinearA(a, n, posicao + 1);
    }
}
