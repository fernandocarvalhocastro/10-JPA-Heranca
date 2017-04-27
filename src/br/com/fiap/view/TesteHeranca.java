package br.com.fiap.view;

import javax.persistence.EntityManager;

import br.com.fiap.dao.PessoaDAO;
import br.com.fiap.dao.impl.PessoaDAOImpl;
import br.com.fiap.entity.Pessoa;
import br.com.fiap.entity.PessoaFisica;
import br.com.fiap.entity.PessoaJuridica;
import br.com.fiap.entity.Sexo;
import br.com.fiap.exception.CommitErrorException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class TesteHeranca {

	public static void main(String[] args) {

		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		PessoaDAO dao = new PessoaDAOImpl(em);
		
		PessoaJuridica pessoaJuridica = new PessoaJuridica();
		pessoaJuridica.setNome("Teste");
		pessoaJuridica.setEmail("teste@teste1234.com");
		pessoaJuridica.setNomeFantasia("nome fantasia da empresa");
		pessoaJuridica.setCnpj("112221323/1000");
		
		dao.create(pessoaJuridica);
		
		PessoaFisica pessoaFisica = new PessoaFisica();
		pessoaFisica.setCpf("333.111.222-09");
		pessoaFisica.setNome("FErnando Castro");
		pessoaFisica.setSexo(Sexo.MASCULINO);
		pessoaFisica.setEmail("bnlblbasd@hotmail.com");
		
		dao.create(pessoaFisica);
		try {
			dao.commit();
		} catch (CommitErrorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		em.close();
		System.exit(0);
	}
}
