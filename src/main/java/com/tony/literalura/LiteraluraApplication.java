package com.tony.literalura;

import com.tony.literalura.principal.Main;
import com.tony.literalura.repository.AuthorRepository;
import com.tony.literalura.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteraluraApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LiteraluraApplication.class, args);
	}

	@Autowired
	private LibroRepository repository;
	@Autowired
	private AuthorRepository authorRepository;
	public void run(String[] args) {
		Main principal = new Main(repository,authorRepository);
		principal.showMenu();
	}
}
