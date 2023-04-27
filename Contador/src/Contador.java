import java.util.Scanner;

public class Contador {
    public static void main(String[] args){
        try {
            Scanner sc = new Scanner(System.in);
            int parametro_1 = sc.nextInt();
            int parametro_2 = sc.nextInt();
            contador(parametro_1,parametro_2);
        }catch (ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contador(int parametro_1, int parametro_2) throws ParametrosInvalidosException{
        int contagem = parametro_2 - parametro_1;
        if(parametro_1 > parametro_2){
            throw new ParametrosInvalidosException();
        }

        for(int i = 1; i <= contagem; i++){
            System.out.println(i);
        }
    }
}
