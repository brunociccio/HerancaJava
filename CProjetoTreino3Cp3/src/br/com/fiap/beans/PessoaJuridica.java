package br.com.fiap.beans;

public class PessoaJuridica extends Pessoa {
	// var
	private String nomeFantasia;
	private String cnpj;
	// vazio
	public PessoaJuridica() {
		super();
	}
	// cheio
	public PessoaJuridica(String nomeFantasia, String cnpj) {
		super();
		this.nomeFantasia = nomeFantasia;
		this.cnpj = cnpj;
	}
	// herança
	public PessoaJuridica(String nome, String email, int idade, double renda, String nomeFantasia, String cnpj) {
		super(nome, email, idade, renda);
		this.nomeFantasia = nomeFantasia;
		this.cnpj = cnpj;
	}
	// setters and getters 
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String identificador() {
		return "Pessoa Jurídica!"; 
	}
}
