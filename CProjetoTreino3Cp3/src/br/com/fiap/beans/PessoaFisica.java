package br.com.fiap.beans;

public class PessoaFisica extends Pessoa {
	// var
	private String rg;
	private String cpf;
	private String cnh;
	// vazio
	public PessoaFisica() {
		super();
	}
	// cheio
	public PessoaFisica(String rg, String cpf, String cnh) {
		super();
		this.rg = rg;
		this.cpf = cpf;
		this.cnh = cnh;
	}
	// herança
	public PessoaFisica(String nome, String email, int idade, double renda, String rg, String cpf, String cnh) {
		super(nome, email, idade, renda);
		this.rg = rg;
		this.cpf = cpf;
		this.cnh = cnh;
	}
	// setters and getters
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCnh() {
		return cnh;
	}
	public void setCnh(String cnh) {
		this.cnh = cnh;
	}
	public String identificador() {
		return "Pessoa Física!"; 
	}
}
