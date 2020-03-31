package com.uca.capas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.uca.capas.domain.Usuario;
@Controller
public class MainController {
	@GetMapping("/login")
	public String enviarForm(Usuario user) {
		return "Login";
	}
	
	@PostMapping("/validacion")
	public String validar(Usuario user) {
		//CREDENCIALES USUARIO: Javier password: admin
		if(user.getName().equals("Javier") && user.getPassword().equals("admin")) return "MostrarMensajeV";
		else return "MostrarMensajeF";
	}

}
