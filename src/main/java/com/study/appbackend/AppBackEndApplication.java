package com.study.appbackend;

import com.study.appbackend.domain.Categoria;
import com.study.appbackend.domain.Produto;
import com.study.appbackend.repositories.CategoriaRepository;
import com.study.appbackend.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import java.util.Arrays;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class AppBackEndApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;

	@Autowired
	private ProdutoRepository produtoRepository;

	public static void main(String[] args) {
		SpringApplication.run(AppBackEndApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria categoria = new Categoria("Informatica");
		Categoria categoria2 = new Categoria("Escritório");

		Produto produto1 = new Produto("Mouse", 80.00);
		Produto produto2 = new Produto("Computador", 2000.00);
		Produto produto3 = new Produto("Impressora", 800.00);

		categoria.getProdutos().addAll(Arrays.asList(produto1, produto2, produto3));
		categoria2.getProdutos().addAll(Arrays.asList(produto3));

		produto1.getCategorias().addAll(Arrays.asList(categoria));
		produto2.getCategorias().addAll(Arrays.asList(categoria));
		produto3.getCategorias().addAll(Arrays.asList(categoria, categoria2));

		categoriaRepository.saveAll(Arrays.asList(categoria, categoria2));
		produtoRepository.saveAll(Arrays.asList(produto1, produto2, produto3));

	}
}
