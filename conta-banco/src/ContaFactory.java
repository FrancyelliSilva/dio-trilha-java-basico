import java.util.Random;

public class ContaFactory {
    private static final Random random = new Random();

    public static Conta criarConta() {
        int numeroConta = random.nextInt(1000000); // Gera número de conta aleatório de até 6 dígitos
        int agencia = random.nextInt(10000); // Gera número de agência aleatório de até 4 dígitos
        int digito = random.nextInt(10); // Gera dígito aleatório de 0 a 9

        return new Conta(numeroConta, agencia, digito);
    }
}

