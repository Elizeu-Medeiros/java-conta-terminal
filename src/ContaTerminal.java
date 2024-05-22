import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        // Scanner sc = new Scanner(System.in).useLocale(Locale.forLanguageTag("PT-BR"));

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        int conta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o seu Nome:");
        String nomeCliente = scanner.nextLine();
       
        System.out.println("Por favor, digite o saldo inicial:");
        double saldo = scanner.nextDouble();

        // Região Brasil
        // System.out.println("Por favor, digite o saldo inicial para o s2:");
        // double s2 = sc.nextDouble();

        String mensagem = String.format(
            "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo e %.2f já está disponível para saque.",
            nomeCliente, agencia, conta, saldo
        );

        System.out.println(mensagem);

        scanner.close();
        
    }
}
