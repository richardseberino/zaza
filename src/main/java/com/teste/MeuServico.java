package com.teste;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MeuServico {

	@GetMapping("teste")
	public String meuMetodo()
	{
		return "Funcionou";
	}
}
