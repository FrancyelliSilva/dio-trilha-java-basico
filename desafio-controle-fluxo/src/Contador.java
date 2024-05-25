import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try (Scanner terminal = new Scanner(System.in)) {
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();

            try {
                if (parametroUm <= 0 || parametroDois <= 0) {
                    throw new Exception("Os parâmetros devem ser maiores que zero");
                } else if (parametroUm >= parametroDois) {
                    throw new Exception("O primeiro parâmetro deve ser menor que o segundo parâmetro");
                } else {
                    // Chamando o método contendo a lógica de contagem
                    contar(parametroUm, parametroDois);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static void contar(int parametroUm, int parametroDois) {
        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println(i);
        }
    }
}
