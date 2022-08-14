package me.dio.academia.digital.service.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.dio.academia.digital.entity.Matricula;
import me.dio.academia.digital.entity.form.MatriculaForm;
import me.dio.academia.digital.infra.utils.JavaTimeUtils;
import me.dio.academia.digital.repository.MatriculaRepository;
import me.dio.academia.digital.service.IMatriculaService;

@Service
public class MatriculaServiceImpl implements IMatriculaService{

	
	@Autowired
	private MatriculaRepository repository;
	
	@Override
	public Matricula create(MatriculaForm form) {
		return null;
	}

	@Override
	public Matricula get(Long id) {
		return null;
	}

	@Override
	public List<Matricula> getAll(String bairro) {
		if (bairro == null)
			return repository.findAll();
		else {
			return repository.findAlunosMatriculadosBairro(bairro);
		}
	}

	@Override
	public void delete(Long id) {

	}

}
