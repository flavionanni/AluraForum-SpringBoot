package br.com.flaviogermano.AluraSpringForum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.flaviogermano.AluraSpringForum.controller.dto.TopicoDto;
import br.com.flaviogermano.AluraSpringForum.model.Curso;
import br.com.flaviogermano.AluraSpringForum.model.Topico;

@RestController
public class TopicosController {

	@RequestMapping("/topicos")
	public List<TopicoDto> lista() {

		Topico topico = new Topico("Dúvida", "Dúvida com Spring", new Curso("Java com Spring", "Programação"));

		return TopicoDto.converter(Arrays.asList(topico, topico, topico));

	}

}
