import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scanner.nextLine(); // Use nextLine() para capturar o nome completo

        System.out.println("Qual conta deseja criar? ");
        System.out.println("[1] Conta Corrente ");
        System.out.println("[2] Conta Poupança: ");
        int tipoConta = scanner.nextInt();

        Conta novaConta = ContaFactory.criarConta();

        System.out.println("Conta criada com sucesso!");
        System.out.println("Nome do usuário: " + nomeCompleto);
        System.out.print("Tipo de Conta: ");
        if (tipoConta == 1) {
            System.out.println("Conta Corrente");
        } else if (tipoConta == 2) {
            System.out.println("Conta Poupança");
        } else {
            System.out.println("Opção inválida");
        }

        System.out.println("Conta: " + novaConta.getNumeroConta());
        System.out.println("Agência: " + novaConta.getAgencia());
        System.out.println("Dígito: " + novaConta.getDigito());
        
        scanner.close();
    }
}
