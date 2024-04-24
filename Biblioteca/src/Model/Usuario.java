package Model;

import java.util.UUID;

public class Usuario {
	private UUID id;
    private String nome;
    private String email;
    private String cpf;
    private String telefone;
    private String senha;

    public Usuario(String nome, String email, String cpf, String telefone, String senha) {
    	this.id = UUID.randomUUID();
    	this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.telefone = telefone;
        this.senha = senha;
    }

    // Getters e Setters
    public void setId(UUID id) {
        this.id = id;
    }
    public UUID getId() {
        return id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getTelefone() {
        return telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
