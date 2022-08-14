package me.dio.academia.digital.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import me.dio.academia.digital.entity.Matricula;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long>{
	
	@Query("FROM Matricula m WHERE m.aluno.bairro = :bairro")
	List<Matricula> findAlunosMatriculadosBairro(String Bairro);
}
