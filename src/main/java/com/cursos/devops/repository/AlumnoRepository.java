package com.cursos.devops.repository;

import java.util.List;

import com.cursos.devops.model.Alumno;

public interface AlumnoRepository {

	Alumno add(Alumno newAlumno);
	
	List<Alumno> findAll();
	
}
