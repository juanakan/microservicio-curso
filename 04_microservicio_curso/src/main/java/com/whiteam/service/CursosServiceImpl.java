package com.whiteam.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.whiteam.model.Curso;




@Service
public class CursosServiceImpl implements CursosService {
	
	List<Curso> cursos;
	{
	cursos=new ArrayList<>(List.of(new Curso("Java 17",40,"programación"),
	new Curso("php",30,"web"),
	new Curso("python",60,"programación"),
	new Curso("Spring",50,"programación"),
	new Curso("Docker",30,"devops")
	));
	}

	@Override
	public void altaCurso(Curso curso) {
		cursos.add(curso);

	}

	@Override
	public Curso actualizarCurso(Curso curso) {
		Curso cr=cursos.stream()
				.filter(c->c.getDenominacion().equals(curso.getDenominacion()))
				.findFirst()
				.orElse(null);
				if(cr!=null) {
				cr.setDuracion(curso.getDuracion());
				cr.setTematica(curso.getTematica());
				return cr;
				}else {
				return null;
				}
	}
	
	@Override
	public List<Curso> cursosCortos(int duracion) {
		return cursos.stream()
		.filter(c->c.getDuracion()<duracion)
		.collect(Collectors.toList());
	}

	@Override
	public void eliminarCursos(String denominacion) {
		cursos.removeIf(c->c.getDenominacion().equals(denominacion));


	}

	@Override
	public List<Curso> cursosTematica(String tematica) {
		return cursos.stream()
				.filter(c->c.getTematica().equals(tematica))
				.collect(Collectors.toList());
	}

}
