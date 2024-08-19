package br.org.unicortes.barbearia.models;

import jakarta.validation.constraints.*;
import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "tb_barbeiro")
public class Barbeiro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long barbeiroId;

    @NotBlank(message = "O nome é obrigatório")
    private String barbeiroNome;

    @Email(message = "O e-mail deve ser válido")
    @NotBlank(message = "O e-mail é obrigatório")
    private String barbeiroEmail;

    @NotBlank(message = "O telefone é obrigatório")
    private String barbeiroTelefone;

    @NotBlank(message = "O CPF é obrigatório")
    @Size(min = 11, max = 11, message = "O CPF deve ter 11 dígitos")
    private String barbeiroCpf;

    @NotNull(message = "O salário é obrigatório")
    @PositiveOrZero(message = "O salário deve ser um valor positivo ou zero")
    private Double barbeiroSalario;

    @NotBlank(message = "O endereço é obrigatório")
    private String barbeiroEndereco;

    @NotNull(message = "A data de admissão é obrigatória")
    private LocalDate barbeiroDataDeAdimissao;

    @NotBlank(message = "Os horários de atendimento são obrigatórios")
    private String barbeiroHorariosAtendimento;
}