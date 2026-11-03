package com.jmp.locacao.entities;

import java.math.BigDecimal;

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
public class AjusteCobranca {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long acordo_ajuste_id;
	private Long cobranca_id;
	private Integer numeroParcelas;
	private BigDecimal valor;
}
