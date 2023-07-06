package med.voll.api.domain.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.domain.endereco.DadosEndereco;

// DTO

public record DadosCadastroMedico(
		@NotBlank(message = "Nome é obrigatório.")
		String nome,
		
		@NotBlank(message = "E-mail é obrigatório.")
		@Email
		String email,
		
		@NotBlank(message = "Telefone é obrigatório.")
		String telefone,
		
		@NotBlank(message = "CRM é obrigatório.")
		@Pattern(regexp = "\\d{4,6}", message = "Deve conter entre 4 a 6 números.")
		String crm,
		
		@NotNull(message = "Escolha uma especialidade: ")
		Especialidade especialidade,
		
		@NotNull @Valid
		DadosEndereco endereco) {

}
