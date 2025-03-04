package com.example.meu_projeto;

import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.google.gson.Gson;

@SpringBootApplication
public class MeuProjetoApplication {

	public static void main(String[] args) {
		Gson gson = new Gson();
		String json = gson.toJson("Olá, Maven com Spring!");

		System.out.println("JSON gerado: " + json);
		System.out.println("Texto em maiúsculas: " + StringUtils.upperCase("spring initializer funcionando!"));
	}

}
