package POO.Work1;

public class Livro {

    private String  titulo;
    private String  autor;
    private int  anoPublicacao;

    public Livro(){}

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


    public static void exibirDetalhes(Livro livro){

        System.out.println();
        System.out.println("Exibindo detalhes do livro:");
        System.out.println("Titulo:" + livro.getTitulo());
        System.out.println("Autor:" + livro.getAutor());
        System.out.println("Ano:" + livro.getAnoPublicacao());

}

}
