package com.cursos.devops.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cursos.devops.model.Alumno;

@Repository
public class AlumnoRepositoryImpl implements AlumnoRepository {

	private static List<Alumno> alumnos = new ArrayList<Alumno>();
	
	static {
		Alumno alumno = new Alumno();
		alumno.setId(1);
		alumno.setNombre("Javier");
		alumno.setApellidos("Solis Guzman");
		alumno.setEdad(25);
		alumno.setCarrera("Informatica");
		alumnos.add(alumno);
	}
	
	@Override
	public Alumno add(Alumno newAlumno) {
		newAlumno.setId(alumnos.size()+1);
		alumnos.add(newAlumno);
		return newAlumno;
	}

	@Override
	public List<Alumno> findAll() {
		return alumnos;
	}

}
