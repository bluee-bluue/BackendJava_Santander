import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // cria um objeto Scanner chamado "perguntar" para ler dados do teclado (System.in)
        Scanner perguntar = new Scanner(System.in);
        
        // declara variáveis para armazenar os valores inseridos pelo usuário
        String nome;
        String agencia;
        int conta;
        double saldo;

        // solicita que o usuário digite seu nome
        System.out.println("Por favor, digite o Seu Nome: ");
        // lê a linha de entrada do usuário e armazena em "nome"
        nome = perguntar.nextLine();

        // solicita que o usuário digite o número da agência
        System.out.println("Por favor, digite o número da Agência: ");
        // lê a linha de entrada do usuário e armazena em "agencia"
        agencia = perguntar.nextLine();
        
        // solicita que o usuário digite o número da conta
        System.out.println("Por favor, digite o número da Conta: ");
        // lê um número inteiro da entrada do usuário e armazena em "conta"
        conta = perguntar.nextInt();

        // solicita que o usuário digite o saldo
        System.out.println("Por favor, digite o Saldo: ");
        // lê um número decimal da entrada do usuário e armazena em "saldo"
        saldo = perguntar.nextDouble();
        
        String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nome, agencia, conta, saldo);

        System.out.println(mensagem);

        // fechando o Scanner (chamado "perguntar") porque não será mais utilizado
        perguntar.close();
    }
}
