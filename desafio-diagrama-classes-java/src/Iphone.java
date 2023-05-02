public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void tocar() {
        System.out.println("Tocando...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando...");
    }

    @Override
    public void selecionarMusical(String musica) {
        System.out.println("A musica " + musica + " foi selecionada");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Pagina " + url + " foi exibida");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Aba nova foi adicionada");
    }

    @Override
    public void atualizarPagina() {
       System.out.println("Pagina atualizada");
    }

    @Override
    public void ligar(String contato) {
        System.out.println("Ligando para o contato " + contato);
    }

    @Override
    public void atender() {
        System.out.println("Antendendo a ligação");
    }

    @Override
    public String iniciarCorreioDeVoz() {
        return "Correio de voz iniciado";
    }

}
