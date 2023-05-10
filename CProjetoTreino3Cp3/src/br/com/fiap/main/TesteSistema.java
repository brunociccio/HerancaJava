package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Endereço;
import br.com.fiap.beans.PessoaFisica;
import br.com.fiap.beans.PessoaJuridica;

public class TesteSistema {
	
	// método static
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	static double decimal(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	static float racional(String j) {
		return Float.parseFloat(JOptionPane.showInputDialog(j));
	}
		
	public static void main(String[] args) {
	// instanciar objetos
		//(String nome, String email, int idade, double renda, String nomeFantasia, String cnpj)
		PessoaJuridica objPessoaJuridica = new PessoaJuridica(texto("Digite o nome da empresa: "),
				texto("Digite o email da empresa: "),
				inteiro("Digite o ano da empresa: "),
				decimal("Digite a renda da empresa: "),
				texto("Digite o nome fantasia da empresa: "),
				texto("Digite o cnpj da empresa: "));
		//(String cep, String logradouro, int número, String bairro, String cidade, String estado)
		Endereço objEndereçoPessoaJuridica = new Endereço(texto("Digite o cep da empresa: "),
				texto("Digite o logradouro da empresa: "),
				inteiro("Digite o número da empresa: "),
				texto("Digite o bairro da empresa: "),
				texto("Digite a cidade da empresa: "),
				texto("Digite o estado da empresa: "));
		//(String nome, String email, int idade, double renda, String rg, String cpf, String cnh)
		PessoaFisica objPessoaFisica = new PessoaFisica(texto("Digite seu nome: "),
				texto("Digite seu email: "),
				inteiro("Digite a sua idade: "),
				decimal("Digite a sua renda: "),
				texto("Digite seu rg: "),
				texto("Digite seu cpf: "),
				texto("Digite sua cnh: "));
		//(String cep, String logradouro, int número, String bairro, String cidade, String estado)
		Endereço objEndereçoPessoaFisica = new Endereço(texto("Digite o cep: "),
				texto("Digite o logradouro: "),
				inteiro("Digite o número: "),
				texto("Digite o bairro: "),
				texto("Digite a cidade: "),
				texto("Digite o estado: "));
		//(String cep, String logradouro, int número, String bairro, String cidade, String estado)
		/*Endereço objEndereço = new Endereço(texto("Digite o cep: "),
				texto("Digite o logradouro: "),
				inteiro("Digite o número: "),
				texto("Digite o bairro: "),
				texto("Digite a cidade: "),
				texto("Digite o estado: "));
		
		objPessoaJuridica.setEndereço(objEndereço);
		objPessoaFisica.setEndereço(objEndereço);*/
		
		objPessoaJuridica.setEndereço(objEndereçoPessoaJuridica);
		objPessoaFisica.setEndereço(objEndereçoPessoaFisica);
		
		System.out.println("Informações Pessoa Jurídica");
		System.out.println();
		System.out.println("Informações Pessoa Física");
		System.out.println();
		
	}

}
