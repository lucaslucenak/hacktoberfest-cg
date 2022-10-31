import java.util.Scanner;

class PotenciaRecursiva {

    public static int count;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        count = 1;
        if(j == 0){
            System.out.println(1);
        }
        else{
            System.out.println(pow(i, j));
        }
    }

    public static int pow(int i, int j){
        
        if(j == 0){
            return count;
        }
        count *= i;
        return pow(i, j-1);
        
    }
}
