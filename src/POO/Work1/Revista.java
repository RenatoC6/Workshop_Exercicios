package POO.Work1;

import java.io.Serializable;

public class Revista extends Livro implements ItemBiblioteca   {

    private int edicao;

    public Revista(String titulo, String autor, int anoPublicacao, int edicao) {
        super(titulo, autor, anoPublicacao);
        this.edicao = edicao;
    }
    public int getEdicao() { return edicao; }

    @Override
    public void exibirDetalhes() {
          System.out.println("Título: " + getTitulo() +
                    ", Autor: " + getAutor() +
                    ", Ano: " + getAnoPublicacao() +
                    ", Edição: " + getEdicao() +
                    ", Tipo: " + getTipo());
        }
      @Override
    public String getTipo(){

        return "Revista";

    }


}
