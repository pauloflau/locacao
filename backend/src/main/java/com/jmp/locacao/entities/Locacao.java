package com.jmp.locacao.entities;

import java.time.LocalDate;

import com.jmp.locacao.enums.PrazoContrato;

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
public class Locacao {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long imovel_id;
	private Long inquilino_id;
	private Long reserva_id;
	private LocalDate dataEntrada;
	private LocalDate dataSaida;
	private PrazoContrato prazoContrato;
	private Integer diaVencimento;
	private String observacao;
}
