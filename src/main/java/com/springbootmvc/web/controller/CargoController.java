package com.springbootmvc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cargos")
public class CargoController {
	
	@GetMapping(value = "/cadastrar")
	public String cadastrar() {
		return "/cargo/cadastro";
	}
	

	@GetMapping(value = "/listar")
	public String listar() {
		return "/cargo/lista";
	}

}
