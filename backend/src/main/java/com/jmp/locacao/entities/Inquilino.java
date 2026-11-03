package com.jmp.locacao.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.jmp.locacao.enums.StatusCobranca;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class Inquilino {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private String cpf;
	private String identidade;
	private BigDecimal rendaMensal;
	private String telefone;
	private LocalDate nascimento;
	private StatusCobranca statusCobranca;
	
}
