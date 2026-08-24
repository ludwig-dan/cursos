package com.github.ludwig_dan.cursos.library_api;

import com.github.ludwig_dan.cursos.library_api.model.Autor;
import com.github.ludwig_dan.cursos.library_api.repository.AutorRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.time.LocalDate;

@SpringBootApplication
@EnableJpaAuditing // Para funcionar o listner que salva data_atualizacao e data_cadastro
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
