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
public class ItemIncobravel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long registro_incobravel_id;
	private Long cobranca_id;
	private BigDecimal valorClassificado;
}
