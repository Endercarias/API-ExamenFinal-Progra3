package com.examen.api.reposities;

import org.springframework.data.repository.CrudRepository;

import com.examen.api.entities.Paciente;

public interface PacienteRepository extends CrudRepository<Paciente, Long>{

}
