package br.com.alura.rh.service;

import java.math.BigDecimal;

import br.com.alura.rh.model.Funcionario;

public interface ValidacaoReajuste {

	void validad(Funcionario funcionario, BigDecimal aumento);
}
