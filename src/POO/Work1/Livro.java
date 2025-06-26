package POO.Work1;

public class Livro extends Item implements ItemBiblioteca {

    private String  titulo;
    private String  autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

      public String getAutor() {
        return autor;
    }

       public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        if (anoPublicacao <= 0) {
            System.out.println("O ano de publicação não pode ser negativo.");
        }
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("Título: " + getTitulo() +
                ", Autor: " + getAutor() +
                ", Ano: " + getAnoPublicacao() +
                ", Tipo: " + getTipo());
}
    @Override
    public String getTipo(){
        //return getTipo();
        return "Livro";

    }
}
