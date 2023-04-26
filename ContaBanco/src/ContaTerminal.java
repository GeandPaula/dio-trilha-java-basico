import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o numero da conta:");
        int conta = sc.nextInt();

        System.out.println("Digite o numero da agência:");
        String agencia = sc.next();

        System.out.println("Digite seu nome:");
        String nomeCliente = sc.next();

        System.out.println("Insira o saldo:");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente +
                ", Obrigado por criar uma conta em nosso banco , sua agência é "
                + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.s");

    }
}
