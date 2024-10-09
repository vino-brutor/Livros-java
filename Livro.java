import java.util.*;

public class Livro {

    private String titulo, autor;
    private int anoLancamento;
    private LinkedList<String> generos;

    public Livro(String titulo, String autor ,int anoLancamento, LinkedList<String> generos) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.autor = autor;
        this.generos = generos;
    }

    public Livro(String titulo, String autor ,int anoLancamento) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.autor = autor;
        this.generos = new LinkedList<>();
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }
    
    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGeneros(){
        String generosTexto = "generos: ";
        for(String genero : this.generos){
            generosTexto += genero + ", ";
        }
        return generosTexto;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
}