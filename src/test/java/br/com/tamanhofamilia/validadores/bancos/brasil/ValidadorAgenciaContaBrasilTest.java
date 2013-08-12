package br.com.tamanhofamilia.validadores.bancos.brasil;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import br.com.tamanhofamilia.validadores.Validador;

public class ValidadorAgenciaContaBrasilTest {
	private Validador validador;
	
	@Before
	public void init() {
		validador = new ValidadorAgenciaContaBrasil();
	}
	
	@Test
	public void Testa_Validacao_() {
		assertTrue(validador.validaDocumentoCompleto("1584-9"));
		assertTrue(validador.validaDocumentoCompleto("00210169-6"));
		assertTrue(validador.validaDocumentoCompleto("00011961-X"));
	}
	
	@Test
	public void Teste_geracao_digito_verificador(){
		assertEquals("9", validador.digitosVerificadores("1584"));
		assertEquals("6", validador.digitosVerificadores("00210169"));
		assertEquals("X", validador.digitosVerificadores("00011961"));
	}
}


