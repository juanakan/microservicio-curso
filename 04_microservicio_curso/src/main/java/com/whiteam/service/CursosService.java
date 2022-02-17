package com.whiteam.service;

import java.util.List;

import com.whiteam.model.Curso;

public interface CursosService {
	
	void altaCurso(Curso curso);
	Curso actualizarCurso(Curso curso);
	List<Curso> cursosCortos(int duracion);
	void eliminarCursos(String denominacion);
	List<Curso> cursosTematica(String tematica);

}
