package DiagramacaoDeClassesDoIphone.Apps;

public class Musica {
    private boolean tocando = false;

    public Musica() {}

    public void reproduzir() {
        this.tocando = true;
        System.out.println("Reproduzindo música...");
    }

    public void tocar() {
        if (this.tocando) {
            System.out.println("Você deu play na música!");
        } else {
            System.out.println("A música precisa ser reproduzida antes de ser tocada.");
        }
    }

    public void pausar() {
        if (this.tocando) {
            System.out.println("Você pausou a música!");
        } else {
            System.out.println("A música precisa estar tocando para ser pausada.");
        }
    }
}
