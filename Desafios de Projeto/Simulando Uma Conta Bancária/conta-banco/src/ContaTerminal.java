import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner perguntar = new Scanner(System.in);
        String nome;
        String agencia;
        int conta;
        double saldo;

        System.out.println("Por favor, digite o Seu Nome: ");
        nome = perguntar.nextLine();

        System.out.println("Por favor, digite o número da Agência: ");
        agencia = perguntar.nextLine();
        
        System.out.println("Por favor, digite o número da Conta: ");
        conta = perguntar.nextInt();

        System.out.println("Por favor, digite o Saldo: ");
        saldo = perguntar.nextDouble();
        
        String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nome, agencia, conta, saldo);

        System.out.println(mensagem);

        perguntar.close();
    }
}
