import java.util.Scanner;
import java.util.Locale;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, solicitar o nome do cliente: ");
        String nomecliente = scanner.nextLine();

        System.out.println("Digite a sua agencia: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o numero da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "+nomecliente+" , obrigado por criar uma conta no nosso banco, sua agência é "+agencia+" , conta "+numero+" e seu saldo "+saldo+" já está disponível para o sanque.");
        
    }
}
