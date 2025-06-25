package POO.Work1;

import java.util.ArrayList;

public class Biblioteca {

    ArrayList<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        livro.exibirDetalhes();
    }

    public void adicionarRevista(Revista revista) {
        livros.add(revista);
        revista.exibirDetalhes();
             }

    public void listarLivros(){
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro na biblioteca.");
        } else {
            System.out.println();
            System.out.println("Itens na biblioteca:");
            for (Livro livro : livros) { // for each loop - percorre a array livros que contem objetos tipo Livro
                System.out.println("item biblioteca: " + livro.getTitulo());
            }

        }

    }

    public boolean buscaLivroPorTitulo(String titulo) {
        System.out.println();
        System.out.println("Buscando livros por titulo: ");
        String retornoTitulo= titulo;
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                retornoTitulo =  livro.getTitulo();
                return true;
            }

        }
        return false;
    }


    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("Livro1",  "Joao",2020);
        biblioteca.adicionarLivro(livro1);

        Livro livro2 = new Livro("Livro2",  "Maria",2025);
        biblioteca.adicionarLivro(livro2);

        Revista revista1 = new Revista("Revista1", "Antonio", 2025, 100);
        biblioteca.adicionarRevista(revista1);


        biblioteca.listarLivros();

        //String titulo = "livro 1";
        String titulo = "xxxxx";

        boolean achou  = biblioteca.buscaLivroPorTitulo(titulo);
        if (achou) {
            System.out.println("Sucesso da pesquisa do: "+ titulo);  }
        else {
            System.out.println("Livro nao encontrado na busca: " + titulo);
        }

        // utilizando outro metodo para exibir os detalhes do livro definido na classe Livro
        //Livro.exibirDetalhes(livro1);
        //Livro.exibirDetalhes(livro2);

    }
}
