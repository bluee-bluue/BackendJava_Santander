package DiagramacaoDeClassesDoIphone;

import java.util.Scanner;

public class Iphone {
    private String app;
    Scanner pergunta = new Scanner(System.in);

    public Iphone(String app) {
        this.app = app;
    }

    public void abrirApp() {
        try {
            System.out.println("Escolha um App: ");
            String appEscolhido = pergunta.next().toUpperCase();

            switch (appEscolhido) {
                case "MUSICA" -> musicaApp();
                case "TELEFONE" -> telefoneApp();
                case "NAVEGADOR" -> navegadorApp();
                default -> {}
            }
        } catch (Exception e) {
            System.out.println("Opção inválida!");
        }
    }

    public void telefoneApp() {
        System.out.println();
    }

    public void musicaApp() {
        System.out.println();
    }

    public void navegadorApp() {
        System.out.println();
    }
}
