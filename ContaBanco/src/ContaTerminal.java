import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("***********************************");
        System.out.println("Banco XYZ");
        System.out.println("Olá seja muito bem-vindo(a)!");
        System.out.println("***********************************");

        //chama o método
        abrirConta(scanner); 
        scanner.close();

    }

    public static void abrirConta(Scanner scanner) {
        //Solicita as informações e ler
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Por favor, digite o número da sua Agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da sua conta: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o saldo da sua Conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + " " + sobrenome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numero + " e seu saldo " + saldo + " já está disponível para saque" );
    }
}
