package br.com.fiap.beans;

public class Pessoa {
	// var
	private String nome;
	private String email;
	private int idade;
	private double renda;
	private Endereço endereço;
	// vazio
	public Pessoa() {
		super();
	}
	// cheio
	public Pessoa(String nome, String email, int idade, double renda, Endereço endereço) {
		super();
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.renda = renda;
		this.endereço = endereço;
	}
	// parcial
	public Pessoa(String nome, String email, int idade, double renda) {
		super();
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.renda = renda;
	}
	// setters and getters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getRenda() {
		return renda;
	}
	public void setRenda(double renda) {
		this.renda = renda;
	}
	public Endereço getEndereço() {
		return endereço;
	}
	public void setEndereço(Endereço endereço) {
		this.endereço = endereço;
	}
	public String identificador() {
		return "Não identificado!"; 
	}
}
