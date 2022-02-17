package com.whiteam.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.whiteam.model.Curso;
import com.whiteam.service.CursosService;

@RestController
public class CursosController {
	
	@Autowired
	CursosService service;
	
	@PostMapping(value="curso", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void alta (@RequestBody Curso curso) {
		service.altaCurso(curso);
	}
	
	@PutMapping(value="curso", consumes = MediaType.APPLICATION_JSON_VALUE, produces= MediaType.APPLICATION_JSON_VALUE)
	public Curso actualizacion (@RequestBody Curso curso) {
		return service.actualizarCurso(curso);
	}
	@DeleteMapping(value="curso/{denominacion}")
	public void eliminacion(@PathVariable("denominacion") String denominacion) {
		
	}
	
	@GetMapping(value="cursosduracion/{duracion}", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> cursosCortos(@PathVariable("duracion") int duracion){
		return service.cursosCortos(duracion);
	}
	@GetMapping(value="cursostematica/{tematica}", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> cursosTematica(@PathVariable("tematica") String tematica){
		return service.cursosTematica(tematica);
	}
	
	

}
