package com.jmp.locacao.entities;

import java.time.LocalDateTime;

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
public class ContratoDocumento {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long locacao_id;
	private String nomeArquivo;
	private String caminhoArquivo;
	private LocalDateTime dataGeracao;
}
