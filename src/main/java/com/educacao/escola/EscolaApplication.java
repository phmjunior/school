package com.educacao.escola;

import java.time.LocalDate;
import java.util.*;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.educacao.escola.enums.PerfilPessoaEnum;
import com.educacao.escola.enums.TipoDocumentoEnum;
import com.educacao.escola.model.Contato;
import com.educacao.escola.model.Documento;
import com.educacao.escola.model.Endereco;
import com.educacao.escola.model.Pessoa;
import com.educacao.escola.model.TipoPessoa;
import com.educacao.escola.repository.PessoaRepository;

@SpringBootApplication
public class EscolaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EscolaApplication.class, args);
	}

	@Bean
	CommandLineRunner init(PessoaRepository pessoaRepository) {
		return args -> {
			pessoaRepository.deleteAll();

			Pessoa pessoa = new Pessoa();
			TipoPessoa tipo = new TipoPessoa();
			Documento doc = new Documento();
			Endereco end = new Endereco();
			Contato contato = new Contato();

			List<Documento> docs = new ArrayList<>();
			List<Endereco> ends = new ArrayList<>();
			List<Contato> contatos = new ArrayList<>();

			
			pessoa.setNome("Pedro Junior");
			pessoa.setDtNascimento(LocalDate.of(1980, 7, 27));
			pessoa.setDtCadastro(LocalDate.now());
					
			tipo.setPerfil(PerfilPessoaEnum.DIRETOR);
			pessoa.setTipoPessoa(tipo);

			doc.setNumero("12345");
			doc.setTipo(TipoDocumentoEnum.RG);
			doc.setOrgaoEmissor("SEGUP");
			doc.setDataEmissao(LocalDate.now());
			doc.setPessoa(pessoa);
			docs.add(doc);
			pessoa.setDocumentos(docs);

			end.setLogradouro("Rua Rondônia");
			end.setNumero("643");
			end.setBairro("Infraero 2");
			end.setCep("68908039");
			end.setCidade("Macapá");
			end.setPais("Brasil");
			end.setPessoa(pessoa);
			ends.add(end);
			pessoa.setEnderecos(ends);

			contato.setDescContato("96 981242026");
			contato.setTipoContato("FONE");
			contato.setWhatsapp(true);
			contato.setPessoa(pessoa);
			contatos.add(contato);

			contato = new Contato();
			contato.setDescContato("junior.macapa@gmail.com");
			contato.setTipoContato("EMAIL");
			contato.setWhatsapp(false);
			contato.setPessoa(pessoa);
			contatos.add(contato);

			pessoa.setContatos(contatos);


			pessoaRepository.save(pessoa);
		};
	}


}
