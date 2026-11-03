package com.jmp.locacao.entities;

import java.math.BigDecimal;

import com.jmp.locacao.enums.TipoAlocacao;

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
public class AlocacaoRecebimento {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long recebimento_id;
	private Long cobranca_id;
	private TipoAlocacao tipoAlocacao;
	private BigDecimal valor;
	private String observacao;
}
