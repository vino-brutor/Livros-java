import java.util.*;

public class Main {
    public static void main(String[] args) {
        int opt;
        LinkedList<Livro> listaLivros = new LinkedList<>(); 
        Scanner leitor = new Scanner(System.in);

        do{
            System.out.println("------------------Biblioteca-------------------");
            System.out.println("DIgite a opção escolhida:");
            System.out.println("1 - Adicionar livro");
            System.out.println("2 - Exibir livros");
            System.out.println("3 - Sair");

            opt = leitor.nextInt();

            switch(opt){
                case 1:
                    System.out.println("---------------Cadastro-----------------");
                    leitor.nextLine();
                    System.out.println("Qaul o título do livro?");
                    String titulo = leitor.nextLine();
                    System.out.println("Qaul o autor do livro?");
                    String autor = leitor.nextLine();
                    System.out.println("Qaul o ano de lançamento do livro?");
                    int anoLancamento = leitor.nextInt();
                    leitor.nextLine();
                    
                    LinkedList<String> generos = new LinkedList<>();
                    String genero;
                    do{
                        System.out.println("Insira os gêneros do livro (Ou sair para encerrar)");
                        genero = leitor.nextLine();
                        if(!genero.equalsIgnoreCase("sair")){
                            generos.add(genero);
                            System.out.println("Genero adicionado!");
                        }

                    }while(!genero.equalsIgnoreCase("sair"));

                    Livro novoLivro = new Livro(titulo, autor, anoLancamento, generos);
                    listaLivros.add(novoLivro);
                    break;

                case 2: 
                    if (listaLivros.size() == 0) {
                        System.out.println("Não há livros cadastrados! ");
                    }else{
                        System.out.println("---------------Livros cadastrados------------");
                        for(int i = 0; i < listaLivros.size(); i++){
                            System.out.println(listaLivros.get(i).getTitulo() + ": "+  listaLivros.get(i).getAutor() + " (" + listaLivros.get(i).getAnoLancamento()+")");
                            System.out.println(listaLivros.get(i).getGeneros());
                            System.out.println("---------------------------------");
                        }
                    }
                    break;

                case 3:
                System.out.println("Saindo...");
                break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            };
        
        }while(opt != 3);
        
        leitor.close();
    }
}
