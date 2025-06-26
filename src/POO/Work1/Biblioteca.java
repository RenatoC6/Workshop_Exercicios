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
            System.out.println("Listando itens na biblioteca:");
            for (Livro livro : livros) { // for each loop - percorre a array livros que contem objetos tipo Livro
                System.out.println("item biblioteca: " + livro.getTitulo() + " - tipo: " + livro.getTipo());
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

        System.out.println("Adicionando itens na biblioteca:");
        Livro livro1 = new Livro("Senhor dos aneis",  "Joao",2020);
        biblioteca.adicionarLivro(livro1);

        Livro livro2 = new Livro("jogada de mestre",  "Maria",2025);
        biblioteca.adicionarLivro(livro2);

        Revista revista1 = new Revista("super interessante", "Antonio", 2025, 100);
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


    }
}
