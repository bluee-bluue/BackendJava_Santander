package DiagramacaoDeClassesDoIphone;

import DiagramacaoDeClassesDoIphone.Apps.Musica;
import DiagramacaoDeClassesDoIphone.Apps.Navegador;
import DiagramacaoDeClassesDoIphone.Apps.Telefone;

import java.util.Scanner;

public class Iphone {
    private final String app;
    private boolean appAtivo = true;
    Scanner pergunta = new Scanner(System.in);

    public Iphone(String app) {
        this.app = app;
    }

    public void abrirApp() {
        do {
            try {
                //System.out.println("Escolha um App: \nTelefone \nMusica \nNavegador");
                //String appEscolhido = pergunta.next().toUpperCase();

                switch (app.toUpperCase()) {
                    case "MUSICA" -> {
                        pergunta.reset();
                        Musica appMusica = new Musica();
                        System.out.println("Escolha uma função: \nReproduzir \nTocar \nPausar");
                        String funcaoM = pergunta.next().toUpperCase();
                        switch (funcaoM) {
                            case "REPRODUZIR" -> appMusica.reproduzir();
                            case "TOCAR" -> appMusica.tocar();
                            case "PAUSAR" -> appMusica.pausar();
                            case "DESLIGAR" -> appAtivo = false;
                        }
                    }
                    case "TELEFONE" -> {
                        pergunta.reset();
                        Telefone appTelefone = new Telefone();
                        System.out.println("Escolha uma função: \nCHAMAR \nATENDER \nENCERRAR \nCORREIO");
                        String funcaoT = pergunta.next().toUpperCase();
                        switch (funcaoT) {
                            case "CHAMAR" -> appTelefone.iniciarChamada();
                            case "ATENDER" -> appTelefone.atenderChamada();
                            case "ENCERRAR" -> appTelefone.encerrarChamada();
                            case "CORREIO" -> appTelefone.iniciarCorreioVoz();
                            case "DESLIGAR" -> appAtivo = false;
                        }
                    }
                    case "NAVEGADOR" -> {
                        pergunta.reset();
                        Navegador appNavegador = new Navegador();
                        System.out.println("Escolha uma função: \nEXIBIR \nNOVA ABA \nATUALIZAR");
                        String funcaoN = pergunta.next().toUpperCase();
                        switch (funcaoN) {
                            case "EXIBIR" -> appNavegador.exibirPagina();
                            case "NOVA ABA" -> appNavegador.adicionarNovaAba();
                            case "ATUALIZAR" -> appNavegador.atualizarPagina();
                            case "DESLIGAR" -> appAtivo = false;
                        }
                    }
                    default -> {
                        System.out.println("Opção inválida!");
                        appAtivo = false;
                    }
                }
            } catch (Exception e) {
                System.out.println("Opção inválida!");
            }
        } while (appAtivo);

        pergunta.close();
    }
}
