package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class PessoaFisica extends Pessoa{
	
	@Column(name="nr_cpf")
	private String cpf;
	
	@Column(name="ds_sexo")
	private Sexo sexo;

	public PessoaFisica() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

}
