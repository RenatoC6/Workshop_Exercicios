package POO.Work1;

public class Livro {

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

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
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


    public void exibirDetalhes(){

        System.out.println();
        System.out.println("Título: " + getTitulo() +
                ", Autor: " + getAutor() +
                ", Ano: " + getAnoPublicacao());


}

}
