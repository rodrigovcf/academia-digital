package me.dio.academia.digital.entity.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class MatriculaForm {

	@NotNull(message = "Preencha o campo corretamente.")
	@Positive(message = "O ID precisa ser positivo")
	private Long alunoId;

}
