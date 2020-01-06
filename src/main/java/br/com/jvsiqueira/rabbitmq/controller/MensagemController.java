package br.com.jvsiqueira.rabbitmq.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.jvsiqueira.rabbitmq.services.MensagemService;

@RestController
public class MensagemController {
	
	@GetMapping(path = "/enviaxml")
	public void teste(@RequestBody String xml) throws Exception {
		MensagemService mensagem = new MensagemService();
		mensagem.enviando(xml);
	}
}
