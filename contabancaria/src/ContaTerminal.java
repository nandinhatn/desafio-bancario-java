import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println ("Por favor, digite o número da Conta");
        int numero = scanner.nextInt();
        System.out.println("Por favor, digite sua agência");
        String agencia = scanner.next();
        System.out.println("Por favor, digite seu saldo");
        Double saldo = scanner.nextDouble();
        System.out.println("Por favor, digite seu nome ");
        
        scanner.nextLine();
        String nome = scanner.nextLine();
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + "conta" + numero + "e seu saldo " + saldo + "ja está disponíveis para saque");



    }
}
