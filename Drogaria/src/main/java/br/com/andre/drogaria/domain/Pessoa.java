package br.com.andre.drogaria.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@SuppressWarnings("serial")
public class Pessoa extends GenericDomain {

		@Column(nullable = false, length = 100)
		private String nome;
		
		@Column(nullable = false, length = 11)
		private String cpf;
		
		@Column(nullable = false, length = 9)
		private String rg;
		
		@Column(nullable = false, length = 30)
		private String rua;
		
		@Column(precision = 6)
		private Short numero;
		
		@Column(nullable = false, length = 20)
		private String bairro;
		
		@Column(nullable = false, length = 9)
		private String cep;
		
		@Column(length = 10)
		private String complemento;
		
		@Column(length = 15)
		private String telefone;
		
		@Column(length = 15)
		private String celular;
		
		@Column(length = 50)
		private String email;
		
		@ManyToOne
		@JoinColumn(nullable = false)
		private Cidade cidade;

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public String getRg() {
			return rg;
		}

		public void setRg(String rg) {
			this.rg = rg;
		}

		public String getRua() {
			return rua;
		}

		public void setRua(String rua) {
			this.rua = rua;
		}

		public Short getNumero() {
			return numero;
		}

		public void setNumero(Short numero) {
			this.numero = numero;
		}

		public String getBairro() {
			return bairro;
		}

		public void setBairro(String bairro) {
			this.bairro = bairro;
		}

		public String getCep() {
			return cep;
		}

		public void setCep(String cep) {
			this.cep = cep;
		}

		public String getComplemento() {
			return complemento;
		}

		public void setComplemento(String complemento) {
			this.complemento = complemento;
		}

		public String getTelefone() {
			return telefone;
		}

		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}

		public String getCelular() {
			return celular;
		}

		public void setCelular(String celular) {
			this.celular = celular;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Cidade getCidade() {
			return cidade;
		}

		public void setCidade(Cidade cidade) {
			this.cidade = cidade;
		}
		
		
}
