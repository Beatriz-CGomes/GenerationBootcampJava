package com.helloWorld.helloWorld.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloWorld")
public class HelloWorldController {
	public static void main(String[] args) {

	}

	@GetMapping
	public String helloWordl() {
		return "Hello World -- Olá, Mundo!";
	}

	@GetMapping("/bsms")
	public List<String> bsms() {
		ArrayList<String> bsms = new ArrayList<>();

		bsms.add("Mentalidade de Crescimento ");
		bsms.add("Orientação ao Detalhes ");
		bsms.add("Persistencia ");
		bsms.add("Comunicação");
		bsms.add("Trabalho em equipe");
		bsms.add("Proativade");

		return bsms;
	}

	@GetMapping("/objetivoPessoal")
	public List<String> objetivoPessoal() {
		ArrayList<String> objetivoPessoal = new ArrayList<>();

		objetivoPessoal.add("Mandar a sindrome do impostor para lá");
		objetivoPessoal.add("Estudar mais");
		objetivoPessoal.add("Ajudar meus amigos quando precisar de mim");

		return objetivoPessoal;
	}
}