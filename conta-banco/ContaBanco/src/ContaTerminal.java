import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numeroConta;
        String agencia, nomeCliente;
        double saldo;

        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Por favor, digite o número da agência !");
            agencia = scanner.next();
            
            System.out.println("Por favor, digite o número da conta !");
            numeroConta = scanner.nextInt();
            
            System.out.println("Por favor, digite o seu nome !");
            nomeCliente = scanner.next();
            
            System.out.println("Por favor, digite o saldo da conta !");
            saldo = scanner.nextDouble();
        }

        System.out.println("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
