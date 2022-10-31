import java.util.Scanner;

public class NegativoRecursivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] entrada = sc.nextLine().split(" ");
        int[] inteiro = new int[entrada.length];

        for(int i = 0; i < entrada.length; i++){
            inteiro[i] = Integer.parseInt(entrada[i]);
        }

        if(primeiroNegativo(inteiro, 0) == 0){
            System.out.println("-");
        }
        else{
            System.out.println(primeiroNegativo(inteiro, 0));
        }


    }

    public static int primeiroNegativo(int [] a, int posicao){
        if(a[posicao] < 0){
            return a[posicao];
        }
        if(posicao == a.length - 1){
            return 0;
        }
        return primeiroNegativo(a, posicao + 1);
    }
}
