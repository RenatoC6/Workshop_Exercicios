package POO.Work1;

public class Revista extends Livro {

    private int edicao;

    public Revista(String titulo, String autor, int anoPublicacao, int edicao) {
        super(titulo, autor, anoPublicacao);
        this.edicao = edicao;
    }
    public int getEdicao() { return edicao; }

    @Override
    public void exibirDetalhes() {
            System.out.println();
            System.out.println("Título: " + getTitulo() +
                    ", Autor: " + getAutor() +
                    ", Ano: " + getAnoPublicacao() +
                    ", Edição: " + edicao);
        }




}
