package CondicionalmenteRico;

import java.util.Scanner;

public class CondicionalmenteRico {
    public static void main(String[] args) {
        // Entrada de dados
        Scanner scanner = new Scanner(System.in);
        int saldoTotal = scanner.nextInt();
        int valorSaque = scanner.nextInt();

        if (saldoTotal > valorSaque){
            int saldoAtualizado = saldoTotal - valorSaque;
            System.out.println("Saque realizado com sucesso. Novo saldo: " + saldoAtualizado);
        }
        else {
           System.out.println("Saldo insuficiente. Saque nao realizado!");
        }

        scanner.close();
    }
}