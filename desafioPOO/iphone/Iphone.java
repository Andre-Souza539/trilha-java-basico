public class Iphone extends AparelhoTelefonico implements ReprodutorMusica, NavegadorInternet{





    @Override
    public void selecionarMusica() {
    System.out.println("Selecionando Musica");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando Musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando Musica");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Estou exibindo Pagina");
    }

    @Override
    public void adicionarAba() {
        System.out.println("Adicionando Aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando ....");
    }
}
