import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldoAtual = scanner.nextDouble();
        double valorDeposito = scanner.nextDouble();
        double valorRetirada = scanner.nextDouble();

        scanner.close();

        double saldoAtualizado = saldoAtual + valorDeposito - valorRetirada;
        String saldoFormatado = String.format("%.1f", saldoAtualizado);

        System.out.println("Saldo atualizado na conta: " + saldoFormatado);
    }
}