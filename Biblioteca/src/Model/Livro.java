package Model;

import java.util.UUID;

public class Livro {
	private String id;
    private String titulo;
    private String autor;
    private String genero;
    private String sinopse;
    private String dataLancamento;
    private String disponibilidade;

    public static void main(String[]args) {
    
    	UUID id = UUID.randomUUID();
    	System.out.println("Id: " + id);
    	
    }
    public Livro(String titulo, String autor, String genero,String sinopse, String dataLancamento, String disponibilidade) 
    {

    	this.titulo = titulo;
    	this.autor = autor;
        this.genero = genero;
        this.sinopse = sinopse;
        this.dataLancamento = dataLancamento;
        this.disponibilidade = disponibilidade;
    }

    // Getters e Setters

    public void setId(String id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
    
    public String getData() {
        return dataLancamento;
    }

    public void setData(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }
    
    public String getSinopse() {
        return sinopse;
    }
    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }
}
