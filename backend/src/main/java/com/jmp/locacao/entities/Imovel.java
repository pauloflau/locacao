package com.jmp.locacao.entities;

import com.jmp.locacao.enums.StatusImovel;
import com.jmp.locacao.enums.TipoImovel;

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
public class Imovel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long proprietario_id;
	private String identificacao;
	private String endereco;
	private TipoImovel tipoImovel;
	private StatusImovel statusImovel;
	
}
