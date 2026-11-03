package com.jmp.locacao.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.jmp.locacao.enums.TipoAjuste;

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
public class AcordoAjuste {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long locacao_id;
	private TipoAjuste tipoAjuste;
	private BigDecimal valorTotal;
	private Integer quantidadeParcelas;
	private LocalDate dataInicio;
	private String observacao;
}
