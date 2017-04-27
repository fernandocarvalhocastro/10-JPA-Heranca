package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "T_EX10_PESSOA")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@SequenceGenerator(name = "seqPessoa", sequenceName = "SQ_PESSOA", allocationSize = 1)
public class Pessoa {
	@Id
	@GeneratedValue(generator = "seqPessoa", strategy = GenerationType.SEQUENCE)
	@Column(name = "cd_pessoa")
	private int codigo;

	@Column(name = "nm_pessoa", nullable = false, length = 100)
	private String nome;

	@Column(name = "ds_email", nullable = false, length = 100)
	private String email;

	public Pessoa() {
		super();
	}

	public Pessoa(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

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
}
