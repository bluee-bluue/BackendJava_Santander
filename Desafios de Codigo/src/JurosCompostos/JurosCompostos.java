package JurosCompostos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class JurosCompostos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorInicial = scanner.nextDouble();
        double taxaJuros = scanner.nextDouble();
        int periodo = scanner.nextInt();

        double valorFinal = valorInicial * Math.pow(1 + taxaJuros, periodo);
        DecimalFormat df = new DecimalFormat("R$ ####.##");

        System.out.println("Valor final do investimento: " + df.format(valorFinal));
        
        scanner.close();
    }
}