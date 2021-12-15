//Vinícius Gabriel Todis & Emilly Rodrigues
package livro;
import java.util.ArrayList;
import java.util.Scanner;

public class Livro {

    private String titulo;
    private int isbn;
    private int ano;
    private String autor;
    private boolean disponivel;
 

    public Livro(String titulo, int isbn, int ano, String autor, boolean disponivel) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.ano = ano;
        this.autor = autor;
        this.disponivel = disponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
}