package br.com.tamanhofamilia.validadores.bancos.brasil;

import br.com.tamanhofamilia.validadores.bancos.Mod11Validador;

public class ValidadorAgenciaContaBrasil extends Mod11Validador {
	public ValidadorAgenciaContaBrasil() {
		super(2, 9, "X", "0");
	}
}
